package hellosop.order;

import hellosop.product.Product;
import hellosop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product){
        this.user = user;
        this.product = product;
    }
}
