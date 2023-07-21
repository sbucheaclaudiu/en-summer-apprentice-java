package com.example.system.service;

import com.example.system.domain.Order;
import com.example.system.domain.OrderDTO;

public interface Service {
    Order saveOrder(OrderDTO order);
}
