package com.unibuc.radiofmlisteneres.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int artistId;
    private String artistName;

//    @OneToOne
//    @JoinColumn(name = "city_id")
//    private City city;

    @OneToMany(mappedBy = "artist")
    @JsonIgnore
    private List<Song> songs = new ArrayList<>();

}
