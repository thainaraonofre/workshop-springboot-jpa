package com.web.JPA.Hibernate.repositories;

import com.web.JPA.Hibernate.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {






}
