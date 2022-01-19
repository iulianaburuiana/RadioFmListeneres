package com.unibuc.radiofmlisteneres.repository;

import com.unibuc.radiofmlisteneres.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {
    @Query(value = "select * from artist a where a.artist_name = :name", nativeQuery = true)
    Artist findArtistByNameWithNativeQuery(String name);

    // List<ArtistCityDTO> findByCity(String city);
}
