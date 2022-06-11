import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import jwt_decode from 'jwt-decode';
@Injectable({
  providedIn: 'root'
})
export class UserAdminService {

  private base_url:string = 'http://localhost:8089/api/userAdmin';
  constructor(private http: HttpClient) {}

  getDecodedAccessToken(token: string): any {
    try {
      return jwt_decode(token);
    } catch(Error) {
      return null;
    }
  }

    get(): Observable<any> {
      return this.http.get(this.base_url);
    }

    findById(id:any): Observable<any>{
      return this.http.get(this.base_url + '/' + id)
    }

    add(entity:any): Observable<any>{
      return this.http.post(this.base_url, entity);
    }

    edit(id:any, entity:any): Observable<any> {
      return this.http.put(this.base_url + '/' + id, entity);
    }

    remove(id:any): Observable<any>{
      return this.http.delete(this.base_url + '/' + id);
    }

    login(formLogin: any): Observable<any> {
      return this.http.post(this.base_url + '/token', formLogin);

    }

    getUserByUserName(userName:any): Observable<any>{
      return this.http.get(this.base_url + '/' + userName);
    }
}
