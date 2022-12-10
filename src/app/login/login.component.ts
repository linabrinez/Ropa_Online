import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ServicegeneralService } from '../servicegeneral.service';

declare var validar_email:any;

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  

  public myFrom!:FormGroup;

  constructor (private fb:FormBuilder,private loginprd:ServicegeneralService){}
 
  
  ngOnInit(): void {
    this.myFrom=this.createMyForm();
    
  }
  private createMyForm():FormGroup{
    return this.fb.group({
      email:['',[Validators.required]],
      password:['',[Validators.required]]

    });

  }
  public submitFormulario(){
    //console.log(this.myFrom);
    if(this.myFrom.invalid){
      Object.values(this.myFrom.controls).forEach(control => {
        control.markAllAsTouched();//pesto es para q el momento en q le de al boton ingresa sin escribir correo y contraseña aparesca error
  
      });
      return;
    }
   /// alert("se va a enviar el formulario");
 // console.log(this.myFrom.value);
  if(this.loginprd.ingresarAppweb(this.myFrom.value)){
    alert("usuario y contraseña validos")
  }else(
    alert("usuario y contraseña invalidos")
  )
  }
   

   
  public get f():any
{
  return this.myFrom.controls;
}
}
