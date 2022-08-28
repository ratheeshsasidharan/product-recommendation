package com.example.productrecommendation.service;

import com.example.productrecommendation.model.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="product-service")
public interface ProductProxy {

    @RequestMapping(method = RequestMethod.GET, value = "/products/{id}", consumes = "application/json")
    public ProductDto getProductById(@PathVariable("id") String id);

    @RequestMapping(method = RequestMethod.GET, value = "/products/", consumes = "application/json")
    public List<ProductDto> getAllProducts();
}
