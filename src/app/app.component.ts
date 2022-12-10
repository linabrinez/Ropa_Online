import { Component } from '@angular/core';
import { ServicegeneralService } from './servicegeneral.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Malejand34webangular';

  constructor(private loginprd:ServicegeneralService){

  }
  public Visualizarpaginaprincipal():boolean{
    return this.loginprd.habilitarlogeo();

  }
  
}


