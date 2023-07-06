package com.example.SpringBootProdCrud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootProdCrud.beans.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

	

	
}
