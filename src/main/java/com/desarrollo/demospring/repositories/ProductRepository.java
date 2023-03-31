package com.desarrollo.demo.repositories;

import com.desarrollo.demo.entities.Product;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
