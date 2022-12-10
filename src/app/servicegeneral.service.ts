import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ServicegeneralService {
 
  private ingresar:boolean=false;

  constructor() { }
  public ingresarAppweb(obj:any):boolean{
   this.ingresar= obj.email=='lina' && obj.password=='123';
   return this.ingresar;
    
  }
  public habilitarlogeo(){
    return this.ingresar;
  }
}
