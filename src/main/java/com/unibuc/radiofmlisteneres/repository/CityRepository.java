package com.unibuc.radiofmlisteneres.repository;

import com.unibuc.radiofmlisteneres.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
}
