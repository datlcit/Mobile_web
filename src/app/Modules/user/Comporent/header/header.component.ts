import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserAdminService } from 'src/app/Modules/admin/adminServices/user-admin.service';
import { LazyLoadServiceService } from '../../userServices/lazy-load-service.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private lazyLoad: LazyLoadServiceService,
    private userService: UserAdminService,
    private router: Router) { }

  countCart: number = 0;
  total: number = 0;
  ngOnInit(): void {
    this.lazyLoad.loadScript('assets/js/main.js').subscribe(_ => {
    });
    this.calTotal();
    this.loadCurrentUser();
  }

  currentUser: string = '';

  loadCurrentUser(){
    if(localStorage['userName'] != null){
      this.currentUser = localStorage['userName']
      console.log(this.currentUser)
    }
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

  //Nút đăng xuất
  logOut(){
    localStorage.removeItem('userName');
  }

  checkUser(){
    if(localStorage['userName'] == null){
      alert("Bạn cần đăng nhập để có thể mua hàng!");
      this.router.navigate(['/login']);
    } else {
      this.router.navigate(['/checkout']);
    }
  }


  local: string = window.location.origin;


  @Input() countPro:number = 0;
  @Input() dataCart: any[] = [];
  @Input() countWishList:number = 0;
  @Input() proPrice:number = 0;

}
