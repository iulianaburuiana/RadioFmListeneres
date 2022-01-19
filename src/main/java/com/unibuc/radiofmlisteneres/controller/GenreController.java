package com.unibuc.radiofmlisteneres.controller;


import com.unibuc.radiofmlisteneres.model.Genre;
import com.unibuc.radiofmlisteneres.service.GenreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genre")
public class GenreController {
    private final GenreService genreService;

    public GenreController(GenreService genreService)
    {
        this.genreService = genreService;
    }
    @PostMapping("/new")
    public ResponseEntity<Genre> saveMusicGenre(@RequestBody Genre genre){
        return ResponseEntity.ok()
                .body(genreService.save(genre));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Genre>> retrieveCategories() {
        return ResponseEntity.ok().body(genreService.getAll());
    }

    @PutMapping("/updateGenre")
    public ResponseEntity<Genre> updateOrCreateMusicGenre(@RequestBody Genre genre){
        return ResponseEntity.ok()
                .body(genreService.save(genre));
    }

}