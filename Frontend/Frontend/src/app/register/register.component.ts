import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { Injectable } from '@angular/core';
export class reg {
  firstName: string
  lastName: string
  email: string;
  password: string;
  dob: Date
}
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
 
export class RegisterComponent{
  registrationform!: FormGroup;
  user: reg;
  constructor(private router: Router) {
    this.user = {} as reg;
  }
 
  ngOnInit(): void {
    this.registrationform = new FormGroup({
      firstName: new FormControl(this.user.firstName, [
        Validators.required,
        Validators.minLength(6),
      ]),
      lastName: new FormControl(this.user.lastName, [
        Validators.required,
        Validators.minLength(6),
      ]),
      dob: new FormControl(this.user.dob, [
        Validators.required,
      ]),
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
    return this.registrationform.get('email')!;
  }
 
  get password() {
    return this.registrationform.get('password');
  }
  get firstName() {
    return this.registrationform.get('firstName');
  }
  get lastName() {
    return this.registrationform.get('lastName');
  }
  get dob() {
    return this.registrationform.get('dob');
  }
 
 
 
  submit() {
    this.router.navigate(['/register'])
  }
 
  login(){
    this.router.navigate(['/login'])
  }
}