import {NgModule} from '@angular/core';
import {RouterModule} from '@angular/router';
import {routes} from './post.routes';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {PostComponent} from './main-post/post.component';

@NgModule({
  declarations: [PostComponent],
  imports: [RouterModule.forChild(routes), BrowserModule, ReactiveFormsModule, FormsModule]
})
export class PostModule {

}
