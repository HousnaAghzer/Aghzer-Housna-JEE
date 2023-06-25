import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable, of, throwError} from "rxjs";
import {Customer} from "../model/customer.model";
import {environment} from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private customers! : Array<Customer>;
  constructor(private http:HttpClient) { }

  public getCustomers():Observable<Array<Customer>>{
    return this.http.get<Array<Customer>>(environment.backendHost+"/customers")
  }
  public searchCustomers(keyword : string):Observable<Array<Customer>>{
    return this.http.get<Array<Customer>>(environment.backendHost+"/customers/search?keyword="+keyword)
  }
  public saveCustomer(customer: Customer):Observable<Customer>{
    return this.http.post<Customer>(environment.backendHost+"/customers",customer);
  }
  public deleteCustomer(id: number){
    return this.http.delete(environment.backendHost+"/customers/"+id);
  }
  public getCustomer( customerId:number) : Observable<Customer>{
    return this.http.get<Customer>(environment.backendHost+"/customers/"+customerId);
  }
  public updateCustomer( customerId:number, customer:Customer) : Observable<Customer>{
    return this.http.put<Customer>(environment.backendHost+"/customers/"+customerId, customer );
  }
}
