import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public myFrom!:FormGroup;
  constructor(private fb:FormBuilder){}
  ngOnInit(): void {
    this.myFrom=this.createMyForm();
    
  }
  private createMyForm():FormGroup{
    return this.fb.group({
      email:['lin[a siniva',[Validators.required]],
      password:['3112537054',[Validators.required]]

    });

  }
  public submitFormulario(){
    alert("se va a enviar el formulario");
    console.log(this.myFrom.value);
  }

}
