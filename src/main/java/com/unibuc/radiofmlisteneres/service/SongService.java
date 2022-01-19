package com.unibuc.radiofmlisteneres.service;

import com.unibuc.radiofmlisteneres.dto.TopSongDTO;
import com.unibuc.radiofmlisteneres.model.Song;
import com.unibuc.radiofmlisteneres.repository.SongRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {

    private final SongRepository songRepository;

    public SongService(SongRepository songRepository) 
    {
        this.songRepository = songRepository; 
    }

    public Song save (Song song)
    {
        return songRepository.save(song);
    }

    public List<Song> getAll() 
    {
        return songRepository.findAll();
    }

    public List<TopSongDTO> getTopFiveSongs () {
        System.out.println(songRepository.findTopFiveSongs());
        return songRepository.findTopFiveSongs();}
}
