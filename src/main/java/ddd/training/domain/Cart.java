package ddd.training.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();
    private List<String> removedItems = new ArrayList<>();

    public void add(CartItem item) {
        items.add(item);
    }

    public void remove(CartItem item) {
        items.remove(item);
        removedItems.add(item.getProduct().getName());
    }

    public List<String> getRemovedItems() {
        return removedItems;
    }
    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }
}
