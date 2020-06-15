package com.enjoy.service;

import com.enjoy.entity.OrderEntiry;

public interface OrderService {
    OrderEntiry getDetail(String id);
    void submit(OrderEntiry order);
    String cancel(OrderEntiry order);
}
