package com.codingshuttle.jpaTutorial.jpaTuts.repositories;

import com.codingshuttle.jpaTutorial.jpaTuts.entities.ProductEntity;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface ProductRepository extends JpaRepository <ProductEntity, Long> {

    List<ProductEntity> findByTitle(String title , Pageable pageable);

    List<ProductEntity> findByCreatedAtAfter(LocalDateTime after);

    List<ProductEntity> findByQuantityGreaterThanAndPriceLessThan(int quantity, BigDecimal price);

    List<ProductEntity> findByTitleContainingIgnoreCase(String title, Pageable pageable);
}
