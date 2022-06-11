import { Injectable } from '@angular/core';

const TOKEN_KEY = 'auth-token'
const USER_KEY = 'auth-user'
@Injectable({
  providedIn: 'root'
})
export class TokenServiceService {

  constructor() { }



  getToken(){
    const token = window.localStorage.getItem(TOKEN_KEY);
    return token;
  }

  public saveToken(token: string):void {
    window.localStorage.removeItem(TOKEN_KEY);
    window.localStorage.setItem(TOKEN_KEY, token);
  }

  removeToken(){
    window.localStorage.removeItem(TOKEN_KEY);
  }

  public saveUser(user: any): void {
    window.localStorage.removeItem(TOKEN_KEY);
    window.localStorage.setItem(USER_KEY, JSON.stringify(user));
  }

  public getUser(): any {
    const user = window.localStorage.getItem(USER_KEY);
    if(user){
      return JSON.parse(user);
    }
    return {};
  }
}
