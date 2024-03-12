import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { FormControl} from '@angular/forms';
export class register {
  email: string;
  cemail: string;
}
@Component({
  selector: 'app-forgot',
  templateUrl: './forgot.component.html',
  styleUrls: ['./forgot.component.scss']
})
export class ForgotComponent{
  // email: string = '';
  emailform!: FormGroup;
  user: register;
 
  constructor(public router: Router) {this.user = {} as register;}
 
  ngOnInit(): void {
    this.emailform = new FormGroup({
      email: new FormControl(this.user.email, [
        Validators.required,
        Validators.minLength(1),
        Validators.maxLength(250),
        Validators.pattern(
          /^(([^<>()\[\]\.,;:\s@\"]+(\.[^<>()\[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i
        ),
      ]),
      cemail: new FormControl(this.user.cemail, [
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
    return this.emailform.get('email')!;
  }
  get cemail() {
    return this.emailform.get('cemail')!;
  }
 
  onSubmit() {
    if (this.email.value !== this.cemail.value) {
      alert('Emails do not match');
    } else {
      alert('Form submitted successfully');
    }
  }
}
 