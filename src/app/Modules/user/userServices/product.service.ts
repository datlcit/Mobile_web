import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private base_url:string = 'http://localhost:8089/api/product';
  constructor(private http: HttpClient) {}

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

    asc(): Observable<any>{
      return this.http.get(this.base_url + '/asc');
    }

    desc(): Observable<any>{
      return this.http.get(this.base_url + '/desc');
    }

    ascName(): Observable<any>{
      return this.http.get(this.base_url + '/ascName');
    }

    descName(): Observable<any>{
      return this.http.get(this.base_url + '/descName');
    }

    rangeProductByPrice(lowCost:any, highCost:any): Observable<any>{
      return this.http.get(this.base_url + '/range', lowCost, highCost);
    }
}
