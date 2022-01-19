package com.unibuc.radiofmlisteneres.repository;

import com.unibuc.radiofmlisteneres.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository  extends JpaRepository<Rating, Integer> {
    @Query(value = "select * from rating r  order by r.mark DESC limit 5" , nativeQuery = true)
    List<Rating> findTopFiveRatings();
}
