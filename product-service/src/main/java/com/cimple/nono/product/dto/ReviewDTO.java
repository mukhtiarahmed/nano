package com.cimple.nono.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReviewDTO {

    private Integer id;

    private String comment;

    private int rating;

    private Integer productId;



}
