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
 *
 *  Code problem 4
 * Remove already added Item "Apple Pencil" (with all its quantities) from Cart.
 *
 * Code Problem 5
 *
 *  As a business User, I would like to know which Products (Product’s name) were removed from Cart.
 *  --
 *  Note – Please do not create business User class.  You could have a method on Cart class or some other class, which returns list of Products names which were removed from Cart.
 */
public class CartApp {

    public static void main(String[] args) {
        Product product = new Product("Apple Pencil");
        CartItem item = new CartItem(product,2);
        Cart cart = new Cart();
        cart.add(item);
        System.out.println(cart);
        System.out.println("Removed Items" + cart.getRemovedItems());
        cart.remove(item);
        System.out.println(cart);
        System.out.println("Removed Items" + cart.getRemovedItems());
        cart.add(item);
        System.out.println(cart);
        System.out.println("Removed Items" + cart.getRemovedItems());



    }
}
