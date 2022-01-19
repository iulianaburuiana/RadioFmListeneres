package com.unibuc.radiofmlisteneres.controller;

import com.unibuc.radiofmlisteneres.model.Rating;
import com.unibuc.radiofmlisteneres.service.RatingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {
    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @PostMapping("/new")
    public ResponseEntity<Rating> saveRating(@RequestBody Rating rating)
    {
        return ResponseEntity.ok()
                .body(ratingService.save(rating));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Rating>> retrieveRatings()
    {
        return ResponseEntity.ok().body(ratingService.getAll());
    }

    @DeleteMapping("/deleteRating")
    public ResponseEntity<Boolean> deleteRating(@RequestParam int id)
    {
        return ResponseEntity.ok().body(ratingService.delete(id));
    }


}


