import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { FormControl } from '@angular/forms';
export class register {
  email: string;
  password: string ;
}
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent{
  loginform!: FormGroup;
  user: register;
  constructor(private router: Router) {
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
    if (this.loginform.invalid) {
      for (const control of Object.keys(this.loginform.controls)) {
        this.loginform.controls[control].markAsTouched();
      }
      return;
    }
    this.user = this.loginform.value;
  }
  forgotPassword() {
    this.router.navigate(['/forgot'])
  }
 
  register() {
    this.router.navigate(['/register'])
  }
}