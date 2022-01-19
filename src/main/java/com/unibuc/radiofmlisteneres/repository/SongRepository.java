package com.unibuc.radiofmlisteneres.repository;

import com.unibuc.radiofmlisteneres.dto.TopSongDTO;
import com.unibuc.radiofmlisteneres.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {
    @Query(value = "select s.song_id AS songId, s.title AS title from song s inner join rating r on s.song_id = r.song_id group by s.song_id order by AVG(r.mark) DESC limit 5" , nativeQuery = true)
    List<TopSongDTO> findTopFiveSongs();
}
