package com.example.springbootpracticerelationships.repositories;

import com.example.springbootpracticerelationships.domain.Category;
import com.example.springbootpracticerelationships.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
