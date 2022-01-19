package com.unibuc.radiofmlisteneres.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int songId;

    @NotNull(message = "Song title cannot be null!!!")
    @NotEmpty(message = "Song title cannot be empty!!!")
    private String title;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    @OneToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @OneToMany(mappedBy = "song")
    @JsonIgnore
    private List<Rating> ratings = new ArrayList<>();

    public Song(@NotNull(message = "Song title cannot be null!!!") @NotEmpty(message = "Song title cannot be empty!!!") String title)
    {
        this.title = title;
    }
}
