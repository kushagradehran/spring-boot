package com.tcs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.beans.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
