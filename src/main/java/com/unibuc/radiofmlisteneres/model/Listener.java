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
public class Listener {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int listenerId;
    private String username;
    private String email;

    @OneToMany(mappedBy = "listener")
    @JsonIgnore
    private List<Rating> reviews = new ArrayList<>();
}
