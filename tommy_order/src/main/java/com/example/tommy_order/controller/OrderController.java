package com.example.tommy_order.controller;

import com.example.tommy_order.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;
    public OrderController(OrderService orderService){ this.orderService = orderService; }

    @GetMapping("/{userId}")
    public String create(@PathVariable Long userId) {
        orderService.createOrder(userId);
        return "OK";
    }
}
