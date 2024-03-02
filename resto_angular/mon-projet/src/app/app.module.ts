import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NZ_I18N } from 'ng-zorro-antd/i18n';
import { fr_FR } from 'ng-zorro-antd/i18n';
import { registerLocaleData } from '@angular/common';
import fr from '@angular/common/locales/fr';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';

import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { SignupComponent } from './auth-components/signup/signup.component';
import { DemoNgZorroAntdModule } from './DemoNgZorroAntdModule';



registerLocaleData(fr);

@NgModule({
  declarations: [
    AppComponent,
    SignupComponent
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    DemoNgZorroAntdModule
    
  ],
  providers: [
    { provide: NZ_I18N, useValue: fr_FR }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
