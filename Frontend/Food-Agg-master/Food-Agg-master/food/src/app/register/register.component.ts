// import { register } from './../forgot/forgot.component';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { RegisterService } from '../register.service';
export class reg {
  firstName: string 
  lastName: string 
  email: string;
  password: string;
  phNumber: string
}
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})

export class RegisterComponent{
  registrationform!: FormGroup;
  user: reg;
  loading = false;
  submitted = false;
  error = '';
  constructor(private router: Router,private service: RegisterService) {
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
      // dob: new FormControl(this.user.dob, [
      //   Validators.required,
      // ]),
      phNumber: new FormControl(this.user.phNumber, [
        Validators.required,
        Validators.minLength(10),
        Validators.maxLength(10),
        Validators.pattern(/^\d+$/),
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

  get phNumber() {
    return this.registrationform.get('phNumber');
  }

 
  // register() {
  //    Object.values(this.registrationform.controls).forEach(control => {
  //      control.markAsTouched();
  //    });
   
  //    if (this.registrationform.valid) {
  //      let response = this.service.registerUser(this.registrationform.value).subscribe({
  //        next: (data) =>{ 
  //             },
  //        error: (e) =>{ if(e.status){
  //          alert('Registration successful!'); 
  //      this.router.navigate(['/login']);
  //    } else {
  //         alert('Email already exsist, use other email or click on login.')
  //      }
  //    },
  //  })
  //  }
  //  }

  register() {
    // Handle registration logic here
     Object.values(this.registrationform.controls).forEach(control => {
       control.markAsTouched();
     });
   
     if (this.registrationform.valid) {
       let response = this.service.registerUser(this.registrationform.value).subscribe({
         next: (data) =>{ 
              },
         error: (e) =>{ if(e.status===200){
           alert('Registration successful!'); 
       this.router.navigate(['/login']);
       
     } else {
          alert('Email already exsist, use other email or click on login.')
       }
     },
   })
   }}
  
  login(){
    this.router.navigate(['/login'])
  }
}