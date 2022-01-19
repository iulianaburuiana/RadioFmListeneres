package com.unibuc.radiofmlisteneres.controller;

import com.unibuc.radiofmlisteneres.dto.TopSongDTO;
import com.unibuc.radiofmlisteneres.model.Song;
import com.unibuc.radiofmlisteneres.service.SongService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/song")
public class SongController {
    private final SongService songService;

    public SongController(SongService songService)
    {
        this.songService = songService;
    }

    @PostMapping("/new")
    public ResponseEntity<Song> saveSong(@RequestBody @Valid Song song)
    {
        return ResponseEntity.ok()
                .body(songService.save(song));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Song>> retrieveSongs()
    {
        return ResponseEntity.ok().body(songService.getAll());
    }

    @GetMapping("/getTopFive")
    public ResponseEntity<List<TopSongDTO>> retrieveTopFiveSongs()
    {
        return ResponseEntity.ok().body(songService.getTopFiveSongs());
    }


}
