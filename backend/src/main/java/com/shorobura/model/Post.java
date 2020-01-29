package com.shorobura.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private LocalDateTime dateTime;
    private String context;

    public Post(int id, String title, LocalDateTime dateTime, String context) {
        this.id = id;
        this.title = title;
        this.dateTime = dateTime;
        this.context = context;
    }

}
