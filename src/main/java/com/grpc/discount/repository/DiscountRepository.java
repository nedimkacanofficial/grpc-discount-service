package com.grpc.discount.repository;

import com.grpc.discount.entity.Category;
import com.grpc.discount.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DiscountRepository extends JpaRepository<Discount,Long> {
}
