package com.shorobura.service.impl;

import com.shorobura.dto.PostDto;
import com.shorobura.mapper.PostMapper;
import com.shorobura.model.Post;
import com.shorobura.repository.PostRepository;
import com.shorobura.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    @Override
    public PostDto findOne(int id) {
        return PostMapper.INSTANCE.postToPostDto(postRepository.getOne(id));
    }

    @Override
    public List<PostDto> findAll() {
        return postRepository.findAll().stream()
                .map(PostMapper.INSTANCE::postToPostDto)
                .collect(Collectors.toList());
    }

    @Override
    public void save(Post post) {
        post.setTitle(post.getTitle());
        post.setDateTime(post.getDateTime());
        post.setContext(post.getContext());
        postRepository.save(post);
    }

    @Override
    public void delete(int id) {
        postRepository.deleteById(id);
    }
}
