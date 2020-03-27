import {Component, OnInit} from '@angular/core';
import {Post} from './post';
import {HttpClient} from '@angular/common/http';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-post-component',
  templateUrl: './post.component.html',
  styleUrls: ['post.component.css']
})
export class PostComponent implements OnInit {
  postForm: FormGroup;
  post: Post = new Post();

  posts: Post [] = [];

  formErrors = {
    name: '',
  };

  constructor(private fb: FormBuilder, private http: HttpClient) {
  }

  ngOnInit() {
    this.load();
  }

  load(): void {
    this.http.get<Post[]>('http://localhost:8080/post/all').subscribe(
      result => {
        this.posts = result,
          console.log(result);
      },
      error => console.log(error));
  }
  delete(id: number): void {
    this.http.delete('http://localhost:8080/post/' + id).subscribe(
      result => {
        if (result === 'OK') {
          this.load();
        }
      }
    );
  }
}
