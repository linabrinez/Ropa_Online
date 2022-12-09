import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormGroup, FormControl } from '@angular/forms';
@Injectable({
  providedIn: 'root'
})
export class ServiceformularioService {
  URL = 'http://localhost:8080/productos'

  InsertarDatos(datosformulario: FormGroup<{ name: FormControl<string | null>; price: FormControl<string | null>; expire_date: FormControl<string | null>; }>){
    //alert(datosformulario.value.name);
   //alert(datosformulario.value.price);
    //alert(datosformulario.value.expire_date);
    return this.http.post(`${this.URL}`,{"name":datosformulario.value.name, "price":datosformulario.value.price, "expire_date":datosformulario.value.expire_date})
  }

  constructor(private http: HttpClient) { }
}
