package com.grpc.discount.service;

import com.grpc.discount.dto.CategoryDTO;
import com.grpc.discount.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoryService {
    private final Logger logger= LoggerFactory.getLogger(CategoryService.class);
    private final CategoryRepository categoryRepository;

    public CategoryDTO add(CategoryDTO categoryDTO) {
        return null;
    }
    public CategoryDTO findByExternalId(Long externalId) {
        return null;
    }
}
