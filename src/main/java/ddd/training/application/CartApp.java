package ddd.training.application;

import ddd.training.domain.Cart;
import ddd.training.domain.CartItem;
import ddd.training.domain.Product;

/**
 * Code Problem 1
 *
 *  Add a "Apple Pencil" to a Cart
 *  --
 *   --
 *
 *  Note:
 *  Please do not create User class.
 *  Please do not create ProductCategory, Variant, Colour, etc classes.
 *  Code Problem 3
 *
 *  Add 2 quantity of "Apple Pencil" to a Cart.
 */
public class CartApp {

    public static void main(String[] args) {
        Product product = new Product("Apple Pencil");
        CartItem item = new CartItem(product,2);
        Cart cart = new Cart();
        cart.add(item);
        System.out.println(cart);
    }
}
