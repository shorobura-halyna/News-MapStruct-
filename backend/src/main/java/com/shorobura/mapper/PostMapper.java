package com.shorobura.mapper;

import com.shorobura.dto.PostDto;
import com.shorobura.model.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PostMapper {

    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class) ;

    @Mapping(source = "title", target = "title")
    @Mapping(source = "dateTime", target = "dateTime")
    @Mapping(source = "context", target = "context")
    PostDto postToPostDto (Post post);

    @Mapping(source = "title", target = "title")
    @Mapping(source = "dateTime", target = "dateTime")
    @Mapping(source = "context", target = "context")
    Post postDtoToPost(PostDto postDto);
}
