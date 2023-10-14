package com.grpc.discount.controller;

import com.grpc.discount.dto.CategoryDTO;
import com.grpc.discount.entity.Category;
import com.grpc.discount.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "categories")
@RequiredArgsConstructor
public class CategoryController {
    private final Logger logger= LoggerFactory.getLogger(CategoryController.class);
    private final CategoryService categoryService;

    @PostMapping
    public ResponseEntity<CategoryDTO> add(@RequestBody CategoryDTO categoryDTO) {
        CategoryDTO categoryDTO1=this.categoryService.add(categoryDTO);
        logger.debug("REST request to save Category : {}", categoryDTO1);
        return new ResponseEntity<>(categoryDTO1, HttpStatus.CREATED);
    }
}
