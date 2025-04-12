package com.example.springprac.item.application;

import com.example.springprac.item.api.dto.MovieDto;
import com.example.springprac.item.domain.Movie;
import com.example.springprac.item.domain.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;

    private static Long sequence = 0L;

    public void saveItem(MovieDto requestDto) {
        Movie movie = Movie.builder()
                .id(++sequence)
                .title(requestDto.title())
                .genre(requestDto.genre())
                .build();

        movieRepository.save(movie);
    }

    public MovieDto findItemById(Long id) {
        Movie movie = movieRepository.findById(id);
        if (movie == null) {
            throw new IllegalArgumentException("해당하는 영화가 없습니다. id = " + id);
        }
        return toDto(movie);
    }

    public List<MovieDto> findAllItems() {
        return movieRepository.findAll().stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public Movie updateItemById(Long id, MovieDto requestDto) {
        Movie movie = movieRepository.findById(id);
        if (movie == null) {
            throw new IllegalArgumentException("해당하는 영화가 없습니다. id = " + id);
        }
        movie.update(requestDto.title(), requestDto.genre());
        movieRepository.updateById(id, movie);
        return movie;
    }

    public void deleteItemById(Long id) {
        movieRepository.deleteById(id);
    }

    private MovieDto toDto(Movie movie) {
        return MovieDto.builder()
                .id(movie.getId())
                .title(movie.getTitle())
                .genre(movie.getGenre())
                .build();
    }

}
