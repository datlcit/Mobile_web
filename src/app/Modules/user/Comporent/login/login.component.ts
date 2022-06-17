import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { TokenServiceService } from 'src/app/Modules/admin/adminServices/token-service.service';
import { UserAdminService } from 'src/app/Modules/admin/adminServices/user-admin.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user: any;

  formLogin: FormGroup = this.fb.group({
    userName: ['', Validators.required],
    password: ['', Validators.required]
  });

  submitted = false;
  constructor(private fb: FormBuilder,
    private route: ActivatedRoute,
     private router: Router,
     private http: HttpClient,
     private tokenService: TokenServiceService,
     private userAdminService: UserAdminService) {  }

  ngOnInit(): void {
  }


  getUser(userName: string, password: string) : Observable<any>{
    return this.http.post('http://localhost:8089/api/userAdmin/token',{"userName": userName,"password": password},{responseType: 'text'});
  }

  login(){
    this.userAdminService.userLogin(this.formLogin.value).subscribe(res=>{
      console.log(res)
      if(res != null) {
        alert('Đăng nhập thành công');
        localStorage.setItem('userName', this.formLogin.get('userName')?.value);
        this.router.navigate(['']);
      } else{
        alert('Sai tài khoản mật khẩu')
      }
    })
  }

}
