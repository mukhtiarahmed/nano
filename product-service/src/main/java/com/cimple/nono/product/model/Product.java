package com.cimple.nono.product.model;

import com.cimple.nono.product.dto.ReviewDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    private Integer id;

    private String name;

    private double price;

    private List<ReviewDTO> reviews;

}
