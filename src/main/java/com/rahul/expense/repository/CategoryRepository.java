package com.rahul.expense.repository;

import com.rahul.expense.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

// maps database to the java class
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
