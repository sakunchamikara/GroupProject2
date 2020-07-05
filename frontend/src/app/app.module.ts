import { BrowserModule } from '@angular/platform-browser';
import { NgModule,CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { DefaultModule } from './layouts/default/default.module';
import { HomeModule } from './webportal/layouts/home/home.module';
import { LogoutComponent } from './modules/logout/logout.component';
// import { ProductDetailsComponent } from './modules/products/view-product/product-details/product-details.component';
// import { UpdateComponent } from './modules/products/view-product/update/update.component';
// import { UpdateProductComponent } from './modules/products/view-product/update-product/update-product.component';
// import { ViewProductComponent } from './modules/products/view-product/view-product.component';
// import { InsertProductsComponent } from './modules/products/insert-products/insert-products.component';
import { ProfileComponent } from './modules/profile/profile.component';




import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import { MatSliderModule } from '@angular/material/slider';
import { InsertCollectedWasteComponent } from './modules/collected-waste/insert-collected-waste/insert-collected-waste.component';
import { ViewCollectedWasteComponent } from './modules/collected-waste/view-collected-waste/view-collected-waste.component';
import { AddEventComponent } from './modules/events/add-event/add-event.component';
import { ViewEventComponent } from './modules/events/view-event/view-event.component';
import { TermsComponent } from './modules/terms/terms.component';
import { AddtermsComponent } from './modules/terms/addterms/addterms.component';
import { ViewtermsComponent } from './modules/terms/viewterms/viewterms.component';

@NgModule({
  declarations: [
    AppComponent,
    LogoutComponent,
    //ProductDetailsComponent,
    //UpdateComponent,
    // UpdateProductComponent,
    // ViewProductComponent,
    // InsertProductsComponent,
    InsertCollectedWasteComponent,
    ViewCollectedWasteComponent,
    AddEventComponent,
    ViewEventComponent,
    TermsComponent,
    AddtermsComponent,
    ViewtermsComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    DefaultModule, // default component and dashboard component has declared here
    HomeModule,

    //material
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    
  ],
  
  schemas: [ CUSTOM_ELEMENTS_SCHEMA ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
