package com.example.springprac.item.api;

import com.example.springprac.item.api.dto.MovieDto;
import com.example.springprac.item.application.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @PostMapping("movies")
    public void save(@RequestBody MovieDto movieDto){
        movieService.saveItem(movieDto);
    }

    @GetMapping("movies/{id}")
    public MovieDto findItemById(@PathVariable Long id) {
        return movieService.findItemById(id);
    }

    @GetMapping("movies/list")
    public List<MovieDto> findAllItem() {
        return movieService.findAllItems();
    }

    @PatchMapping("movies/{id}")
    public void updateItemById(@PathVariable Long id, @RequestBody MovieDto movieDto){
        movieService.updateItemById(id, movieDto);
    }

    @DeleteMapping("movies/{id}")
    public void deleteItemById(@PathVariable Long id) {
        movieService.deleteItemById(id);
    }
}
