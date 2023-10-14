package com.grpc.discount.repository;

import com.grpc.discount.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    Optional<Category> findByExternalId(String id);
}
