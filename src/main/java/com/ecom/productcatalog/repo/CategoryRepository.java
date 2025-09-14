package com.ecom.productcatalog.repo;

import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
