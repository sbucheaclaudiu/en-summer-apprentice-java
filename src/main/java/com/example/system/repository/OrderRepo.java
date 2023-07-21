package com.example.system.repository;

import com.example.system.domain.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends CrudRepository<Order, Long> {

    List<Order> getOrderByCustomer_CustomerID(Long idCustomer);
}
