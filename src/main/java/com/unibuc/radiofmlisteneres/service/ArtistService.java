package com.unibuc.radiofmlisteneres.service;

import com.unibuc.radiofmlisteneres.model.*;
import com.unibuc.radiofmlisteneres.repository.*;
import org.springframework.stereotype.*;

import java.util.List;

@Service
public class ArtistService {
    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository)
    {
        this.artistRepository = artistRepository;
    }

    public Artist save (Artist artist)
    {
        return artistRepository.save(artist);
    }
    public List<Artist> getAll()
    {
        return artistRepository.findAll();
    }
    public Artist retrieveByName(String name)
    {
        return artistRepository.findArtistByNameWithNativeQuery(name);
    }
//    public List<ArtistCityDTO> getByCity(String city)
//    {
//        return artistRepository.findByCity(city);
//    }
}
