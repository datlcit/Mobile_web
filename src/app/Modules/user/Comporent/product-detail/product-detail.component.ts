import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { join } from 'src/assets/plugins/uplot/uPlot';
import { LazyLoadServiceService } from '../../userServices/lazy-load-service.service';
import { ProductService } from '../../userServices/product.service';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent implements OnInit {

  constructor(private lazyLoad: LazyLoadServiceService, private router: ActivatedRoute, private productService: ProductService) { }

  dataProduct: any;
  ngOnInit(): void {
    // this.lazyLoad.loadScript('assets/js/plugins.js').subscribe(_ => {
    // });
    this.lazyLoad.loadScript('assets/js/main.js').subscribe(_ => {
    });

    this.getProduct();
    this.getDataHasOneImg();

  }
  mainImg:any;
  //function đẩy đối tượng vào trang
  getProduct(){
    const productId = this.router.snapshot.params['productId'];
    this.productService.findById(productId).subscribe(res => {
      this.dataProduct = res;
      this.dataProduct.productImage = this.dataProduct.productImage.split(" ");
      this.mainImg = this.dataProduct.productImage[0];
      this.dataProduct.color = this.dataProduct.color.split(";");
    });
  }

  dataHasOneImg: any = null;
  // function tạo đối tượng chỉ có 1 ảnh để gửi lên cart
  getDataHasOneImg(){
    const productId = this.router.snapshot.params['productId'];
    this.productService.findById(productId).subscribe(res2 => {
      this.dataHasOneImg = res2;
      this.dataHasOneImg.productImage = this.dataHasOneImg.productImage.split(" ");
      this.dataHasOneImg.productImage = this.dataHasOneImg.productImage[0]
      this.dataHasOneImg.color = this.dataHasOneImg.color.split(";");
      this.dataHasOneImg.color = this.dataHasOneImg.color[0]
    });
  }


  chooseColor(c: string): void{
    this.dataHasOneImg.color =  this.dataHasOneImg.color.toString();
    this.dataHasOneImg.color = c;
  }


  @Output() clickBuy: EventEmitter<any> = new EventEmitter();
  @Output() clickBuy2: EventEmitter<any> = new EventEmitter();

  @Output() clickTotal: EventEmitter<any> = new EventEmitter();
  addTotal(current_price: number): void {
    this.clickTotal.emit(current_price);
  }

  @Output() clickWithlist: EventEmitter<any> = new EventEmitter();
  addToWishList(pId: string): void {
    this.clickWithlist.emit(pId);
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
      if(x.product.productId == product.productId && x.product.color == product.color){
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
    this.clickBuy2.emit(product.color);
}

replaceImg(img:any){
  this.mainImg = img;
}

}
