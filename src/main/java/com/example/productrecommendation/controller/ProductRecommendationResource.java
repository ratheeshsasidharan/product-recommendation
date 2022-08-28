package com.example.productrecommendation.controller;

import com.example.productrecommendation.model.ProductDto;
import com.example.productrecommendation.service.ProductRecomendationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/products-recommendations")
public class ProductRecommendationResource {

    private final ProductRecomendationService productRecomendationService;

    @GetMapping(value = "/")
    public List<ProductDto> getRecommendedProducts(){
        return productRecomendationService.getRecommendedProducts();
    }
}
