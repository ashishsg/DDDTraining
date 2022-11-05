package ddd.training.application;

import ddd.training.domain.Cart;
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
 */
public class CartApp {

    public static void main(String[] args) {
        Product product = new Product("Apple Pencil");
        Cart cart = new Cart();
        cart.add(product);
        System.out.println(cart);
    }
}
