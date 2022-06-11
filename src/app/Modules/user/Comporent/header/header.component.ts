import { Component, Input, OnInit } from '@angular/core';
import { UserAdminService } from 'src/app/Modules/admin/adminServices/user-admin.service';
import { LazyLoadServiceService } from '../../userServices/lazy-load-service.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private lazyLoad: LazyLoadServiceService,
    private userService: UserAdminService) { }

  countCart: number = 0;
  total: number = 0;
  ngOnInit(): void {
    this.calTotal();
  }

  token: any;

  loadToken(){
    this.userService.get().subscribe(res =>{
      this.token = res;
      console.log(this.token)
    })
  }

  calTotal(){
    for(let c of this.dataCart){
      if(c.quantity == 1){
        this.total += c.product.price;
        this.countCart++;
      }
      else{
        this.total += (c.product.price * c.quantity);
        this.countCart++;
      }

    }
    console.log(this.countCart)
    console.log(this.total)
  }


  local: string = window.location.origin;


  @Input() countPro:number = 0;
  @Input() dataCart: any[] = [];
  @Input() countWishList:number = 0;
  @Input() proPrice:number = 0;

}
