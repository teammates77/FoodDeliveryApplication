// import { register } from './../forgot/forgot.component';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { RegisterService } from '../register.service';
import Swal from 'sweetalert2';
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
  constructor(private router: Router,private registerService: RegisterService) {
    this.user = {} as reg;
  }

  ngOnInit(): void {
    this.registrationform = new FormGroup({
      firstName: new FormControl(this.user.firstName, [
        Validators.required,
        Validators.minLength(4),
      ]),
      lastName: new FormControl(this.user.lastName, [
        Validators.required,
        Validators.minLength(4),
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

 
  registerUser() {
    this.user = this.registrationform.value
    this.registerService.registerUser(this.user).subscribe({
      next: (data) =>{
        Swal.fire({
          icon: 'success',
          title: 'Success',
          text: 'Registration successful!'
        }).then
        // alert("Registration successful");
        this.router.navigate(['/login']);
      },
      error: (e) => {
        console.log(e);
        if (e.status === 200 || e.status === 201) {
          Swal.fire({
            icon: 'success',
            title: 'Success',
            text: 'Registration successful!'
          }).then
          // alert("Registration successful");
          this.router.navigate(['/login']);
          // console.log("logged in");
 } 
 /*if (e.status === 409) { // Assuming 409 is the status code for email conflict
  Swal.fire({
    icon: 'error',
    title: 'Error',
    text: 'Email already exists. Please use a different email address or login.',
  });
}*/
        else {
          Swal.fire({
            icon: 'error',
            title: 'Oops',
            text: 'Email Id already exists!'
          }).then
        //  alert("Registration failed");
          console.log("logged fail");
        }
      }
  });
  }
  
  login(){
    this.router.navigate(['/login'])
  }
}