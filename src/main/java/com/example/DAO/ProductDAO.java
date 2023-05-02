package com.example.DAO;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Product;


public interface ProductDAO extends CrudRepository<Product,Long>{
	Optional<Product> findByName(String name);
}
