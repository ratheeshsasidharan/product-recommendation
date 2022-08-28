package com.example.productrecommendation.service;

import com.example.productrecommendation.model.ProductDto;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ProductRecomendationService {

    private final ProductProxy productProxy;


    @Retry(name="recommended-products",fallbackMethod = "defaultRecommendation")
    public List<ProductDto> getRecommendedProducts(){
        log.info("call API");
        return productProxy.getAllProducts();
    }

    public List<ProductDto> defaultRecommendation(Exception ex){
        return List.of(ProductDto.builder().productCode("DEF").productName("Default").build());
    }
}
