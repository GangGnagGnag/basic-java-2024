package com.hellosop.order;

import com.hellosop.product.Product;
import com.hellosop.user.User;

public class OrderService {

    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
