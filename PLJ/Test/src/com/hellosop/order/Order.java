package com.hellosop.order;

import com.hellosop.product.Product;
import com.hellosop.user.User;

import java.util.PrimitiveIterator;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product){
        this.user = user;
        this.product = product;
    }
}
