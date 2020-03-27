import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HttpClientModule} from '@angular/common/http';
import {PostComponent} from './post/post.component';
import {PostModule} from './post/post.module';
import {RouterModule} from '@angular/router';
import {routes} from './post/post.routest';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    // RouterModule.forRoot(routes),
    HttpClientModule,
    PostModule
  ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
