import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { TokenServiceService } from 'src/app/Modules/admin/adminServices/token-service.service';
import { UserAdminService } from 'src/app/Modules/admin/adminServices/user-admin.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  formLogin: FormGroup = this.fb.group({
    userName: ['', Validators.required],
    password: ['', Validators.required],
  });

  submitted = false;
  isLoggedIn = false;
  constructor(private fb: FormBuilder,
    private route: ActivatedRoute,
     private router: Router,
     private http: HttpClient,
     private tokenService: TokenServiceService,
     private userAdminService: UserAdminService) {  }

  ngOnInit(): void {
    this.formLogin;
    if(this.tokenService.getToken()){
      this.isLoggedIn = true;
    }
  }


  token: string = '';

  login(){
    this.userAdminService.login(this.formLogin.value).subscribe(res=>{
      alert('Đăng nhập thành công');
      this.router.navigate(['home']);
      this.loadToken();
      this.tokenService.saveToken(res.token);
      // if(this.userAdminService.getDecodedAccessToken().auth === 'ROLE_ADMIN' || this.userAdminService.getDecodedAccessToken().auth === 'ROLE_USER'){
      //   this.getUserByUsername();
      // }
    })
  }

  // public getUserByUsername(): void {
  //   this.userAdminService.getUserByUserName( this.userAdminService.getDecodedAccessToken().sub).subscribe(
  //     (data: U)
  //   )
  // }

  token1: any;

  loadToken(){
    this.userAdminService.get().subscribe(res =>{
      this.token = res;
      console.log(this.token)
    })
  }

  // --------------------------------------------------


}
