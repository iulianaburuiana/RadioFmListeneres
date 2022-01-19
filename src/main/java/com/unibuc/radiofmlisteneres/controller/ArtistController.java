package com.unibuc.radiofmlisteneres.controller;

import com.unibuc.radiofmlisteneres.model.Artist;
import com.unibuc.radiofmlisteneres.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artist")
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }
    @PostMapping("/new")
    public ResponseEntity<Artist> saveAuthor(@RequestBody Artist artist){
        return ResponseEntity.ok()
                .body(artistService.save(artist));
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Artist>> retrieveArtist()
    {
        return ResponseEntity.ok().body(artistService.getAll());
    }
    @GetMapping("/artistByName")
    public ResponseEntity<Artist> retrieveByName(@RequestParam String authorName){
        return ResponseEntity.ok().body(artistService.retrieveByName(authorName));
    }
}

