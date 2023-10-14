package com.grpc.discount.controller;

import com.grpc.discount.dto.DiscountDTO;
import com.grpc.discount.service.DiscountService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "discount")
@RequiredArgsConstructor
public class DiscountController {
    private final Logger logger= LoggerFactory.getLogger(DiscountController.class);
    private final DiscountService discountService;

    @PostMapping
    public ResponseEntity<DiscountDTO> add(@RequestBody DiscountDTO discountDTO) {
        DiscountDTO discountDTO1=this.discountService.add(discountDTO);
        logger.debug("REST request to save Discount : {}", discountDTO1);
        return new ResponseEntity<>(discountDTO1, HttpStatus.CREATED);
    }
}
