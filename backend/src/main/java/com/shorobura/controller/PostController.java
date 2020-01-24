package com.shorobura.controller;

import com.shorobura.dto.PostDto;
import com.shorobura.model.Post;
import com.shorobura.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping
    public HttpStatus save(@RequestParam String title,
                           @RequestParam LocalDateTime dateTime,
                           @RequestParam String context){
        postService.save(new Post(title, dateTime, context));
        return HttpStatus.OK;
    }

    @GetMapping
    public PostDto findOne(@PathVariable int id){
        return postService.findOne(id);
    }

    @GetMapping("/all")
    public List<PostDto> findAll(){
        return postService.findAll();
    }

    @DeleteMapping
    public HttpStatus delete(@PathVariable int id){
        postService.delete(id);
        return HttpStatus.OK;
    }

}
