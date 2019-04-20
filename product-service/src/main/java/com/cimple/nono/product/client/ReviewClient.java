package com.cimple.nono.product.client;


import com.cimple.nono.product.dto.ReviewDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@FeignClient(name = "review-service")
public interface ReviewClient {


    @GetMapping("/review/reviews")
    Map<Integer, List<ReviewDTO>> getProductReviews();
}
