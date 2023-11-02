package com.web.JPA.Hibernate.repositories;

import com.web.JPA.Hibernate.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {






}
