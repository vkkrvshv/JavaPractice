package rtu.mirea.lab16;

import java.util.HashMap;
import java.util.Map;

public class TablesOrderManager implements OrdersManager{
    private HashMap<Integer, Order> orders = new HashMap<>();

    public void add(Order order, int tableNumber){
        try{
            if(orders.containsKey(tableNumber)) throw new OrderAlreadyAddedException();
            orders.put(tableNumber, order);
        }
        catch (OrderAlreadyAddedException ex){
            System.out.println("У этого столика уже есть заказ");
        }
    }

    public void addItem(MenuItem item, int tableNumber){
        if(orders.containsKey(tableNumber)) orders.get(tableNumber).add(item);
        else{
            TableOrder n = new TableOrder();
            n.add(item);
            orders.put(tableNumber, n);
        }
    }

    public int freeTableNumber(){
        int i = 1;
        while(true)
        {
            if(orders.containsKey(i)) i++;
            else break;
        }
        return i;
    }

    public int[] freeTableNumbers(){
        int[] n = new int[3];
        int i = 1, j = 0;
        while(true)
        {
            if(orders.containsKey(i)) i++;
            else{
                n[j] = i;
                j++;
                if(j == 3) break;
            }
        }
        return n;
    }

    public Order getOrder(int tableNumber){
        if(!orders.containsKey(tableNumber)) throw new IllegalTableNumber();
        return orders.get(tableNumber);
    }

    public void remove(int tableNumber){
        if(!orders.containsKey(tableNumber)) throw new IllegalTableNumber();
        orders.remove(tableNumber);
    }

    public void remove(Order order){
        for(Map.Entry<Integer, Order> entry: orders.entrySet()){
            if(entry.getValue() == order){
                orders.remove(entry.getKey());
                break;
            }
        }
    }

    public void removeAll(Order order){
        for(Map.Entry<Integer, Order> entry: orders.entrySet()){
            if(entry.getValue() == order){
                orders.remove(entry.getKey());
            }
        }
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        for(Map.Entry<Integer, Order> entry: orders.entrySet()){
            count+= entry.getValue().itemQuantity(itemName);
        }
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        for(Map.Entry<Integer, Order> entry: orders.entrySet()){
            count+= entry.getValue().itemQuantity(item);
        }
        return count;
    }

    @Override
    public Order[] getOrders() {
        Order[] or = new Order[orders.size()];
        int i = 0;
        for(Map.Entry<Integer, Order> entry: orders.entrySet()){
            or[i] = entry.getValue();
            i++;
        }
        return or;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        for(Map.Entry<Integer, Order> entry: orders.entrySet()){
            cost += entry.getValue().getCost();
        }
        return cost;
    }

    @Override
    public int ordersQuantity() {
        return orders.size();
    }
}
