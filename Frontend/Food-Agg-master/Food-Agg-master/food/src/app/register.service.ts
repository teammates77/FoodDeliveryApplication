import { Injectable } from '@angular/core';
import { reg } from './register/register.component';
import { HttpClient } from '@angular/common/http';
import { AbstractControl } from '@angular/forms';
@Injectable({
  providedIn: 'root'
})
export class RegisterService {
  registerService(arg0: AbstractControl<any, any>, arg1: AbstractControl<any, any>) {
    throw new Error('Method not implemented.');
  }

  private baseURL = "http://localhost:8080/api/v/register";
  constructor(private httpClient:HttpClient) { }
 
  registerUser(reg:reg){
    return this.httpClient.post(`${this.baseURL}`,reg);
}

}
