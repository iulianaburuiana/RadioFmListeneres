package com.unibuc.radiofmlisteneres.service;

import com.unibuc.radiofmlisteneres.exceptions.BadValueForMarkException;
import com.unibuc.radiofmlisteneres.model.Rating;
import com.unibuc.radiofmlisteneres.repository.RatingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    private final RatingRepository ratingRepository;

    public RatingService(RatingRepository ratingRepository)
    {
        this.ratingRepository = ratingRepository;
    }

    public Rating save(Rating rating) {
        if (rating.getMark() > 10 || rating.getMark() < 0)
            throw new BadValueForMarkException("You have to choose a mark between 1 and 10.");
        return ratingRepository.save(rating);
    }

    public List<Rating> getAll() {
        return ratingRepository.findAll();
    }

    public Rating getById(int id) {
        return ratingRepository.getById(id);
    }

    public boolean delete(int id) {
        if (this.getById(id) != null) {
            ratingRepository.deleteById(id);
            return true;
        }

        return false;
    }
}

