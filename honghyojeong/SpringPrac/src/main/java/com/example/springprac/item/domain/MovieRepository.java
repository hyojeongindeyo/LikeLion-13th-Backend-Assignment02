package com.example.springprac.item.domain;

import java.util.List;
public interface MovieRepository {
    void save(Movie movie);
    Movie findById(Long id);
    List<Movie> findAll();
    void updateById(Long id, Movie movie);
    void deleteById(Long id);

}
