package com.shorobura.service;

import com.shorobura.dto.PostDto;
import com.shorobura.model.Post;

import java.util.List;

public interface PostService {
    PostDto findOne(int id);

    List<PostDto> findAll();

    void save(Post post);

    void delete(int id);
}
