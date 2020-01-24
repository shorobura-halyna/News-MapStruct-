package com.shorobura.mapper;

import com.shorobura.dto.PostDto;
import com.shorobura.model.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PostMapper {

    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class) ;

    @Mapping(source = "title", target = "titleDto")
    @Mapping(source = "dateTime", target = "dateTimeDto")
    @Mapping(source = "context", target = "contextDto")
    PostDto postToPostDto (Post post);

    @Mapping(source = "titleDto", target = "title")
    @Mapping(source = "dateTimeDto", target = "dateTime")
    @Mapping(source = "contextDto", target = "context")
    Post postDtoToPost(PostDto postDto);
}
