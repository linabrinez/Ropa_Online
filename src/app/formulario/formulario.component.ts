import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ServiceformularioService } from './serviceformulario.service';

declare var validar_nombre:any;
declare var validar_precio:any;
//declare var validar_email:any;

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent {

  titulo="Formulario Registrar Prenda";

  datosformulario = new FormGroup({
    name: new FormControl(''),
    //email: new FormControl(''),
    precio: new FormControl(''),
    descripcion: new FormControl(''),

  });

  recibirdatos(){
    var name1 = this.datosformulario.value.name;
    var valor = this.datosformulario.value.precio;
    //var email1 = this.datosformulario.value.email;
    var date1 = this.datosformulario.value.descripcion;
    let p=0
   
    if(name1 == ""){
      alert("Debe digitar un nombre");
    //}else{
    // if(email1=="" ){
    //  alert("Debe digitar un email"); 
     
    }else{
     if(valor==""){
      alert("Debe digitar un precio");
    }else{
      if(date1 == ""){
        alert("Debe realizar una descripcion de la prenda");
    }else{
      var rta = validar_nombre(name1);
      if(rta == false){
      alert("Digite solo letras en el nombre");
      }else{
      //alert("Esta bien escrito");
      p = p + 1;
      }
      var rta = validar_precio(valor);
      if(rta == true){
       alert("Digite solo numeros en el precio");
      }else{
      p = p + 1;
      //alert("Esta bien escrito");
      }

       //var rta = validar_email(email1);
       //if(rta == false){
       // alert("Digite un email correcto");
       //}else{
        //p = p + 1;
      //alert("Esta bien escrito");
       }
    
       if(p==2){
        alert("formulario diligenciado corectamente");
        this.serviceformularioservice.InsertarDatos(this.datosformulario).subscribe(datos => {alert("Se guardo con exito");});
       }
  }
    }
  }
  constructor(private serviceformularioservice : ServiceformularioService){}
  ngOnInit():void{}
}
 // } 

//}
