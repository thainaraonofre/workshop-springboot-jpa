package com.web.JPA.Hibernate.repositories;

import com.web.JPA.Hibernate.entities.Order;
import com.web.JPA.Hibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {






}
