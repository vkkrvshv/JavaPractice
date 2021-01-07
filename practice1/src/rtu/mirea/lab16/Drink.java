package rtu.mirea.lab16;

public final class Drink extends MenuItem{
    private DrinkTypeEnum type;

    public Drink(int price, String name, String description) {
        super(price, name, description);
    }

    public Drink(String name, String description) {
        super(name, description);
    }

    public DrinkTypeEnum getType() {
        return type;
    }
}