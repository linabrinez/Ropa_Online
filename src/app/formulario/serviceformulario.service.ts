import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormGroup, FormControl } from '@angular/forms';
@Injectable({
  providedIn: 'root'
})
export class ServiceformularioService {
  URL = 'http://localhost:8080/productos'

  InsertarDatos(datosformulario: FormGroup<{ name: FormControl<string | null>; precio: FormControl<string | null>; descripcion: FormControl<string | null>; }>){
    //alert(datosformulario.value.name);
   //alert(datosformulario.value.price);
    //alert(datosformulario.value.expire_date);
    return this.http.post(`${this.URL}`,{"name":datosformulario.value.name, "precio":datosformulario.value.precio, "descripcion":datosformulario.value.descripcion})
  }

  constructor(private http: HttpClient) { }
}
