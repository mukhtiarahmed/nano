package com.cimple.nono.review.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Review {

    private Integer id;

    private String comment;

    private int rating;

    private Integer productId;



}
