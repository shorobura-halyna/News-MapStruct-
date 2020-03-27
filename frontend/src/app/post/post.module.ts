import {NgModule} from '@angular/core';
import {RouterModule} from '@angular/router';
import {routes} from './post.routest';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {PostComponent} from './post.component';

@NgModule({
  declarations: [PostComponent],
  imports: [RouterModule.forChild(routes), BrowserModule, ReactiveFormsModule, FormsModule]
})
export class PostModule {

}
