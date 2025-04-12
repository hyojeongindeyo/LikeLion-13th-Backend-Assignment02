package com.example.springprac.item.domain;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class MemoryMovieRepository implements MovieRepository {

    private static Map<Long, Movie> database = new HashMap<>();

    @Override
    public void save(Movie movie) {
        database.put(movie.getId(), movie);
    }

    @Override
    public Movie findById(Long id) {
        return database.get(id);
    }

    @Override
    public List<Movie> findAll() {
        return database.values().stream().toList();
    }

    @Override
    public void updateById(Long id, Movie movie) {
        database.put(id, movie);
    }

    @Override
    public void deleteById(Long id) {
        database.remove(id);
    }
}
