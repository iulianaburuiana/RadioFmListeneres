package com.unibuc.radiofmlisteneres.service;

import com.unibuc.radiofmlisteneres.model.City;
import com.unibuc.radiofmlisteneres.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public City save(City city){
        return cityRepository.save(city);
    }
    public List<City> getAll() {
        return cityRepository.findAll();
    }
}