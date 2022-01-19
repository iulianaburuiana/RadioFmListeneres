package com.unibuc.radiofmlisteneres.service;

import com.unibuc.radiofmlisteneres.model.Genre;
import com.unibuc.radiofmlisteneres.repository.GenreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {
    private final GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository)
    {
        this.genreRepository = genreRepository;
    }

    public Genre save (Genre genre) {
        return genreRepository.save(genre);}

    public List<Genre> getAll() {
        return genreRepository.findAll();
    }

    public Genre getById(int id)
    {
        return genreRepository.getById(id);
    }

}

