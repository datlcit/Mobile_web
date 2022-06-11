import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { LazyLoadServiceService } from '../../userServices/lazy-load-service.service';
import { ProductService } from '../../userServices/product.service';

@Component({
  selector: 'app-store',
  templateUrl: './store.component.html',
  styleUrls: ['./store.component.css']
})
export class StoreComponent implements OnInit {

  constructor(private lazyLoad: LazyLoadServiceService, private service: ProductService) { }

  ngOnInit(): void {
    // this.lazyLoad.loadScript('assets/js/plugins.js').subscribe(_ => {
    // });
    this.lazyLoad.loadScript('assets/js/main.js').subscribe(_ => {
    });
    this.loadProducts();

    //this.loadPaginate(1);
  }
  shop_product: Array<any> = [];
  img: Array<any> = [];
  loadProducts(){
    this.service.get().subscribe(res =>{
      this.shop_product = res;
      for(let i=0;i<this.shop_product.length;i++){
        this.img = this.shop_product[i].productImage.split(" ");
        this.shop_product[i].productImage = this.img[0];
      }
    })
  }

  buy(product: any) {
    // Lấy dữ liệu giỏ hàng trong storage
    let carts = localStorage.getItem('carts') ? JSON.parse(localStorage.getItem('carts')!) : [];

    const itemCart = {
      product: product,
      quantity: 1
    };

    // Kiểm tra xem sản phẩm có trong giỏ chưa
    let flag = false;
    carts = carts.map((x: any) =>{
      if(x.product.productId == product.productId){
        x.quantity += 1;
        flag = true;
      }
      return x;
    })

    if(!flag){
      carts.push(itemCart);
    }

    //Lưu giỏ vào localStorage
    localStorage.setItem('carts', JSON.stringify(carts));

    this.clickBuy.emit(product.productId);
}


  @Input() countPro:number = 0;
  @Input() countWishList:number = 0;
  @Input() proPrice:number = 0;

  @Output() clickBuy: EventEmitter<any> = new EventEmitter();
  // addPro(pId: string): void {
  //   this.clickBuy.emit(pId);
  // }

  @Output() clickTotal: EventEmitter<any> = new EventEmitter();
  addTotal(current_price: number): void {
    this.clickTotal.emit(current_price);
  }

  @Output() clickWithlist: EventEmitter<any> = new EventEmitter();
  addToWishList(pId: string): void {
    this.clickWithlist.emit(pId);
  }

  // pageData: any[] = [];
  // pageSize: number = 12;
  // totalPage: number = 0;
  // currentPage: number = 1;
  // pages: any[] = [];

  // loadPaginate(page: number){
  //   // Tính tổng số trang
  //   this.totalPage = Math.ceil(this.shop_product.length / this.pageSize);
  //   this.pages = new Array(this.totalPage);
  //   // Lấy ra số bản ghi của trang hiện tại
  //   let start = (page - 1) * this.pageSize;
  //   let end = start + this.pageSize;
  //   this.pageData = this.shop_product.slice(start, end);
  //   this.currentPage = page;
  // }

  // prevPage(): void {
  //   this.currentPage--;
  //   this.loadPaginate(this.currentPage);
  // }

  // nextPage(): void {
  //   this.currentPage++;
  //   this.loadPaginate(this.currentPage);
  // }

  // firstPage(): void {
  //   this.currentPage = 1;
  //   this.loadPaginate(this.currentPage);
  // }

  // lastPage(): void {
  //   this.currentPage = this.totalPage;
  //   this.loadPaginate(this.currentPage);
  // }


}
