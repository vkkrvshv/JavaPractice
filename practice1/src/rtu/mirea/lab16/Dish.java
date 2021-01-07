package rtu.mirea.lab16;

public final class Dish extends MenuItem {

    public Dish(int price, String name, String description) {
        super(price, name, description);
    }

    public Dish(String name, String description) {
        super(name, description);
    }
}
