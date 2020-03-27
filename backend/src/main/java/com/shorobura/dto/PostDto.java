package com.shorobura.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
    private int id;
    private String title;
    private LocalDateTime dateTime;
    private String context;
}
