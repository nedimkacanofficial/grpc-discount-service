package com.grpc.discount.service;

import com.grpc.discount.dto.CategoryDTO;
import com.grpc.discount.dto.DiscountDTO;
import com.grpc.discount.repository.DiscountRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
@Transactional
public class DiscountService {
    private final Logger logger= LoggerFactory.getLogger(DiscountService.class);
    private final DiscountRepository discountRepository;

    public DiscountDTO add(DiscountDTO discountDTO) {
        return null;
    }
    public BigDecimal apply(DiscountDTO discountDTO) {
        return null;
    }
}
