package com.shorobura.controller;

import com.shorobura.dto.PostDto;
import com.shorobura.mapper.PostMapper;
import com.shorobura.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping
    public HttpStatus save(@RequestBody PostDto postDto){
        postService.save(PostMapper.INSTANCE.postDtoToPost(postDto));
        return HttpStatus.OK;
    }

    @GetMapping
    public PostDto findOne(@RequestParam int id){
        return postService.findOne(id);
    }

    @GetMapping("/all")
    public List<PostDto> findAll(){
        return postService.findAll();
    }

    @DeleteMapping
    public HttpStatus delete(@RequestParam int id){
        postService.delete(id);
        return HttpStatus.OK;
    }

}
