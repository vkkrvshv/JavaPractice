package rtu.mirea.lab16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
        TablesOrderManager manager = new TablesOrderManager();
        TableOrder order = new TableOrder();
        order.add(new Dish(300,"PASTA","pasta with bacon"));
        order.add(new Drink(150,"WINE","white wine"));
        manager.add(order, 7);
        manager.add(new TableOrder(), 7);
        TableOrder or = (TableOrder)manager.getOrder(7);
        System.out.println(Arrays.toString(or.getItems()));
        manager.getOrder(3);
    }
}
