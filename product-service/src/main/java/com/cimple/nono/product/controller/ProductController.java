package com.cimple.nono.product.controller;

import com.cimple.nono.product.client.ReviewClient;
import com.cimple.nono.product.dto.ReviewDTO;
import com.cimple.nono.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    private List<Product> productList;

    @Autowired
    private ReviewClient reviewClient;

    @PostConstruct
    public void init() {
        List<ReviewDTO> emptyList = Collections.emptyList();
        productList = new ArrayList<>();
        productList.add(new Product(1, "Product 1", 12.4, emptyList));
        productList.add(new Product(2, "Product 2", 12.4, emptyList));
        productList.add(new Product(3, "Product 3", 12.4, emptyList));
        productList.add(new Product(4, "Product 4", 12.4, emptyList));
        productList.add(new Product(5, "Product 5", 12.4, emptyList));
        productList.add(new Product(6, "Product 6", 12.4, emptyList));
        productList.add(new Product(7, "Product 7", 12.4, emptyList));
        productList.add(new Product(8, "Product 8", 12.4, emptyList));
        productList.add(new Product(9, "Product 9", 12.4, emptyList));
        productList.add(new Product(10, "Product 10", 12.4, emptyList));
        productList.add(new Product(11, "Product 11", 12.4, emptyList));
    }

    @GetMapping("/products")
    public List<Product> getProductList() {
        Map<Integer, List<ReviewDTO>> reviews = reviewClient.getProductReviews();
        for (Product product : productList) {
            product.setReviews(reviews.get(product.getId()));
        }
        return  productList;
    }
}
