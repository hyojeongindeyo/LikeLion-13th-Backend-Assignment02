package com.example.springprac.item.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Movie {
    private Long id;
    private String title;
    private String genre;

    @Builder
    public Movie(Long id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public void update(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }
}
