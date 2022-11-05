package ddd.training.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Cart {

    private UUID uuid = java.util.UUID.randomUUID();
    private List<CartItem> items = new ArrayList<>();
    private List<String> removedItems = new ArrayList<>();

    private CartStatus status = CartStatus.FILLED;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return uuid.equals(cart.uuid);
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void checkout() {
        status = CartStatus.CHECKED_OUT;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }
}
