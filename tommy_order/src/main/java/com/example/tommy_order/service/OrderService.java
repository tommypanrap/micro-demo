package com.example.tommy_order.service;

import com.example.tommy_order.dto.User;
import com.example.tommy_order.feignclient.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private UserClient userClient;

    public void createOrder(Long userId) {
        User user = userClient.getUserById(userId);
        System.out.println("訂單建立成功，用戶：" + user.getName());
    }
}
