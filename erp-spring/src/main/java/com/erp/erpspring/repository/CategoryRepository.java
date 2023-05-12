package com.erp.erpspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.erpspring.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}
