package com.cimple.nono.review.controller;

import com.cimple.nono.review.model.Review;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ReviewController {

    private Map<Integer, List<Review>> reviews;

    @PostConstruct
    public void init() {
        reviews = new HashMap<>();
        reviews.put(1, Arrays.asList(new Review(1, "My reivew product 1", 4, 1),
                new Review(2, "My reivew product 1", 4, 1)));

        reviews.put(2, Arrays.asList(new Review(1, "My reivew product 1", 4, 2),
                new Review(2, "My reivew product 1", 4, 2)));

        reviews.put(3, Arrays.asList(new Review(1, "My reivew product 1", 4, 3),
                new Review(2, "My reivew product 1", 4, 3)));

        reviews.put(4, Arrays.asList(new Review(1, "My reivew product 1", 4, 4),
                new Review(2, "My reivew product 1", 4, 4)));

        reviews.put(5, Arrays.asList(new Review(1, "My reivew product 1", 4, 5),
                new Review(2, "My reivew product 1", 4, 5)));

        reviews.put(6, Arrays.asList(new Review(1, "My reivew product 1", 4, 6),
                new Review(2, "My reivew product 1", 4, 6)));

        reviews.put(7, Arrays.asList(new Review(1, "My reivew product 1", 4, 7),
                new Review(2, "My reivew product 1", 4, 7)));

        reviews.put(8, Arrays.asList(new Review(1, "My reivew product 1", 4, 8),
                new Review(2, "My reivew product 1", 4, 8)));

        reviews.put(9, Arrays.asList(new Review(1, "My reivew product 1", 4, 9),
                new Review(2, "My reivew product 1", 4, 9)));

        reviews.put(10, Arrays.asList(new Review(1, "My reivew product 1", 4, 10),
                new Review(2, "My reivew product 1", 4, 10)));

        reviews.put(11, Arrays.asList(new Review(1, "My reivew product 1", 4, 11),
                new Review(2, "My reivew product 1", 4, 11)));

    }


    @GetMapping("/reviews")
    public  Map<Integer, List<Review>> getProductReviews() {
            return reviews;
    }
}
