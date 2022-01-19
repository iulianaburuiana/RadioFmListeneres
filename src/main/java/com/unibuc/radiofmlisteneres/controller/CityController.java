package com.unibuc.radiofmlisteneres.controller;

import com.unibuc.radiofmlisteneres.model.City;
import com.unibuc.radiofmlisteneres.service.CityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/city")
public class CityController{
    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }
    @PostMapping("/new")
    public ResponseEntity<City> saveCity(@Valid @RequestBody City city){
        return ResponseEntity.ok()
                .body(cityService.save(city));
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<City>> retrieveCityes() {
        return ResponseEntity.ok().body(cityService.getAll());
    }
}
   

