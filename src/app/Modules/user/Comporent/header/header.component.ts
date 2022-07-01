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

  //Các chức năng tìm kiếm

  //Tìm kiếm điện thoại
//1. Tạo biến theo dòng điện thoại
iphone_13 :string = "Iphone 13"
iphone_13_pro_max :string = "Iphone 13 Pro Max"
iphone_12 :string = "Iphone 12"
iphone_12_mini :string = "Iphone 12 Mini"

samsung_galaxy_s22:string ="Samsung Galaxy S22"
samsung_galaxy_s22_ultra:string ="Samsung Galaxy S22 Ultra"
samsung_galaxy_z_flip3_5g:string = "Samsung Galaxy Z Flip3 5G"
samsung_galaxy_z_fold3_5g:string = "Samsung Galaxy Z Fold3 5G"

xiaomi_12:string = "Xiaomi 12"
xiaomi_12_pro:string = "Xiaomi 12 Pro"
redmi_note_11:string = "Redmi Note 11"
redmi_note_11_pro:string = "Redmi Note 11 Pro"

phoneDetail(name: string){

}
}
