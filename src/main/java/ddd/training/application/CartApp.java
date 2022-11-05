package ddd.training.application;

import ddd.training.domain.Cart;
import ddd.training.domain.CartItem;
import ddd.training.domain.Order;
import ddd.training.domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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
 *
 *  As a business User, I would like to differentiate between two Carts, even if they contain same Item ( both carts have Product "Sony Wireless headphone" with 1 quantity)
 *  --
 *  Note –
 *  Two carts where items are same, equality on Carts should return false
 *  Cart cart1 = Cart();
 *  Cart cart2 = Cart();
 *  Item item1 = new Item(new Product("Sony Wireless headphone"), 1);
 *  Item item2 = new Item(new Product("Sony Wireless headphone"), 1);
 *  cart1.add(item1);
 *  cart2.add(item2);
 *  cart1.equals(cart2)  =>  should return false
 *
 *  Code Problem 9
 * Create Order(with Products) when Cart is checked out. Also, Mark Cart as checked out .
 *  --
 *  Note –
 * While Creating Order please do not use Item class but use Product class. Flatten out products in Item,
 * that means, if Cart has  Item with Product "Apple Pencil" and Quantity two,
 * then create two Product objects for "Apple Pencil" and add them to Order’s product list.
 *  Order order = new Order( List<Product> products)
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
        List<Product> orderProducts = new ArrayList<>();
        for(CartItem ci : cart.getItems()) {
            IntStream.range(0, ci.getQuantity()).forEach(c -> orderProducts.add(ci.getProduct()));
        }
        Order order = new Order(orderProducts);
        System.out.println(order);


    }
}
