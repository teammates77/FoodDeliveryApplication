import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { FormControl } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { LoginService } from '../login.service';
export class register {
  email: string;
  password: string;
}
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent{
  loginform!: FormGroup;
  user: register;
  loading = false;
  submitted = false;
  error = '';
  constructor(private router: Router, private loginservice:LoginService) {
    this.user = {} as register;
  }

  ngOnInit(): void {
    this.loginform = new FormGroup({
      password: new FormControl(this.user.password, [
        Validators.required,
        Validators.minLength(6),
      ]),
      email: new FormControl(this.user.email, [
        Validators.required,
        Validators.minLength(1),
        Validators.maxLength(250),
        Validators.pattern(
          /^(([^<>()\[\]\.,;:\s@\"]+(\.[^<>()\[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i
        ),
      ]),
    });
  }

  get email() {
    return this.loginform.get('email')!;
  }

  get password() {
    return this.loginform.get('password');
  }

  public signin(): void {
    console.log(this.loginform.value);
  }

  loginUser() {
    this.user = this.loginform.value
    this.loginservice.loginUser(this.user).subscribe({
      next: (data) =>{ 
        alert("Login successful");
        this.router.navigate(['/dashboard']);
      },
      error: (e) => {
        console.log(e);
        if (e.status === 200) {
          alert("Login successful");
          this.router.navigate(['/dashboard']);
          console.log("logged in");
        } else {
         alert("Login failed");
          console.log("logged fail");
        }
      }
  });
  }

  
  forgotPassword() {
    this.router.navigate(['/forgot'])
  }
 
  register() {
    this.router.navigate(['/register'])
  }
}
