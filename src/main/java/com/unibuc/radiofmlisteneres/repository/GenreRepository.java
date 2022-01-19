package com.unibuc.radiofmlisteneres.repository;

import com.unibuc.radiofmlisteneres.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
