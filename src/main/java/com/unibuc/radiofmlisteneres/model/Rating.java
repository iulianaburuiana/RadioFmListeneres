package com.unibuc.radiofmlisteneres.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unibuc.radiofmlisteneres.model.Listener;
import com.unibuc.radiofmlisteneres.model.Song;
import io.swagger.annotations.ApiModel;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ratingId;

    private String comment;

    @ManyToOne
    //@JsonIgnore
    @JoinColumn(name = "listener_id")
    private Listener listener;

    @ManyToOne
    //@JsonIgnore
    @JoinColumn(name = "song_id")
    private Song song;

    //goes from 1 to 10
    private Integer mark;
}
