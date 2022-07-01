import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ProductService } from '../../userServices/product.service';

@Component({
  selector: 'app-phone-model',
  templateUrl: './phone-model.component.html',
  styleUrls: ['./phone-model.component.css']
})
export class PhoneModelComponent implements OnInit {

  constructor(private router: ActivatedRoute, private productService: ProductService) { }

  ngOnInit(): void {
    this.getParam()
    this. loadProducts();
  }

  space:string = '';
  getParam(){
    let phoneName = this.router.snapshot.params['phoneName'];
    this.space = phoneName.replace(/_/g, " ");
    console.log(this.space)
  }

  count:number = 0;
  shop_product: Array<any> = [];
  img: Array<any> = [];
  loadProducts(){
    this.productService.get().subscribe(res =>{
      for(let p of res){
        let a = p.productName.split("-");
        if(a[0]==(this.space+" ")){
          this.shop_product.push(p);
          this.count++;
        }
      }
      for(let i=0;i<this.shop_product.length;i++){
        this.img = this.shop_product[i].productImage.split(" ");
        this.shop_product[i].productImage = this.img[0];
      }
    })
  }
}
