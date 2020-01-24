package com.shorobura.dto;

import com.shorobura.model.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
    private String titleDto;
    private LocalDateTime dateTimeDto;
    private String contextDto;
}
