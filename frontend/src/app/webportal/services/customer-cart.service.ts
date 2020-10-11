import { Injectable } from '@angular/core';
import { Cart } from '../pojo/cart';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class CustomerCartService {
  constructor(private http: HttpClient) {}

  public addToCart(cart: Cart, pid: number): Observable<any> {
    return this.http.post<any>(`http://localhost:8080/addToCart/${pid}`, cart);
  }

  public getCartDetails(cid: number): Observable<any> {
    return this.http.get<any>(`http://localhost:8080/getCartDetails/${cid}`);
  }

  deleteFromCart(cid: number): Observable<any> {
    return this.http.delete<any>(`http://localhost:8080/cart/delete/${cid}`);
  }

  public updateCartOrder(cart: Array<Cart>, orderId: number): Observable<any> {
    return this.http.post<any>(
      `http://localhost:8080/updateCartOrder/${orderId}`,
      cart
    );
  }

  public getByOrder(oid: number): Observable<any> {
    return this.http.get<any>(`http://localhost:8080/getCartByOrder/${oid}`);
  }

  //view all data of cart
  public getCartDetailsAll(email:String): Observable<any> {
    return this.http.get<any>(`http://localhost:8080/getCart/${email}`);
  }
}
