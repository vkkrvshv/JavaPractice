package rtu.mirea.lab16;

public class MenuItem {
    private int price;
    private String name;
    private String description;

    public MenuItem(int price, String name, String description) throws IllegalArgumentException{
        if(price < 0 || name.equals("") || description.equals("")) throw new IllegalArgumentException();
        this.price = price;
        this.name = name;
        this.description = description;

    }

    public MenuItem(String name, String description) {
        this.price = 0;
        this.name = name;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
