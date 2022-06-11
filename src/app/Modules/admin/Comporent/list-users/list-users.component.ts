import { Component, OnInit } from '@angular/core';
import { UserAdminService } from '../../adminServices/user-admin.service';

@Component({
  selector: 'app-list-users',
  templateUrl: './list-users.component.html',
  styleUrls: ['./list-users.component.css']
})
export class ListUsersComponent implements OnInit {

  constructor(private userAdminService: UserAdminService) { }

  ngOnInit(): void {
    this.loadUsers();
    // this.getTokenFromApi();
  }

  listUsers: Array<any> = [];
  loadUsers(){
    this.userAdminService.get().subscribe(res => {
      this.listUsers = res;
      console.log(this.listUsers)
    })
  }

  // token: string = '';
  // usernName: string = 'lychinhdat';
  // password: string = 'admin#123';
  // getTokenFromApi(){
  //   this.userAdminService.getToken(this.usernName, this.password).subscribe(res => {
  //     this.token = res;
  //     console.log(this.token)
  //   })
  // }

}
