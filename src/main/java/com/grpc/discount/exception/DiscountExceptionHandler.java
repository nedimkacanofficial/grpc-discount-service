package com.grpc.discount.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class DiscountExceptionHandler {
    @ExceptionHandler(DiscountNotFoundException.class)
    public ResponseEntity<?> notFoundException(DiscountNotFoundException discountNotFoundException) {
        List<String> detail=new ArrayList<>();
        detail.add(discountNotFoundException.getMessage());
        ErrorResponse errorResponse=new ErrorResponse("Discount Not Found!",detail, LocalDateTime.now());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
