import { Injectable } from '@angular/core';
import { register } from './login/login.component';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private baseUrl = "http://localhost:8083/api/v/login";

  constructor(private httpClient: HttpClient) { }

  loginUser(register: register){
    return this.httpClient.post(`${this.baseUrl}`, register)
}
}