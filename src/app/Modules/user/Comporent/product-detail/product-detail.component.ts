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

  }
  getProduct(){
    const productId = this.router.snapshot.params['productId'];
    this.productService.findById(productId).subscribe(res => {
      this.dataProduct = res;
      this.dataProduct.productImage = this.dataProduct.productImage.split(" ");
      this.dataProduct.color = this.dataProduct.color.split(";");
      console.log(this.dataProduct.productImage);
      console.log(this.dataProduct.color);
    });
  }


  product:any ={
    pId: 'P101',
    pName: 'Iphone 12',
    img1: 'assets/img/product/iphone/iphone_12_series/iphone_12_do.png',
    importPrice: 12000000,
    oldPrice: 16390000,
    oldPriceView: '16,390,000',
    currentPrice: 16090000,
    currentPriceView: '16,090,000',
    pStorage: '64 GB',
    pColor: '',
    pDescribe: 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Impedit eligendi ut ullam dolore. Adipisci deserunt excepturi cupiditate exercitationem architecto aperiam, repellat, autem impedit numquam id reiciendis, quas recusandae perferendis unde!',
    pRAM: '4 GB',
    producer: 'Apple',
    pAmount: 1,
    categoryId: 1,
    pStatus: true
  }

  chooseColor(c: string): void{
    this.dataProduct.color =  this.dataProduct.color.toString();
    this.dataProduct.color = c;
    // this.dataProduct.color = 'hello'
    // this.dataProduct.color.toString() = c;
    console.log(this.dataProduct);
  }

  proAmount(pAmount: number): void {
    this.product.pAmount++;
    console.log(this.product.pAmount);
  }

  @Output() clickBuy: EventEmitter<any> = new EventEmitter();
  addPro(pId: string): void {
    this.clickBuy.emit(pId);
  }

  @Output() clickWithlist: EventEmitter<any> = new EventEmitter();
  addToWishList(pId: string): void {
    this.clickWithlist.emit(pId);
  }

}
