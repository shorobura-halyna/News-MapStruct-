import {Component, OnInit} from '@angular/core';
import {Post} from './post';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-post-component',
  templateUrl: './post.component.html',
  styleUrls: ['post.component.css']
})
export  class PostComponent implements OnInit {
  posts: Post [];
  constructor(private http: HttpClient) {
  }
  ngOnInit(): void {
    this.http.get<Post[]>('http://localhost:8080/post?id=1').subscribe(
      res => this.posts = res
    );
  }
}
