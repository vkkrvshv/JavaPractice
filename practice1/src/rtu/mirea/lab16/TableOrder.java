package rtu.mirea.lab16;

public class TableOrder implements Order {
    private int size = 0;
    private MenuItem[] items = new MenuItem[5];
    private Customer customer;

    @Override
    public boolean add(MenuItem item) {
        if(size < items.length){
            items[size] = item;
            size++;
        }
        else{
            MenuItem[] items = new MenuItem[size*2];
            for(int i = 0; i < size; i++) items[i] = this.items[i];
            this.items = items;
            this.items[size] = item;
            size++;
        }
        return true;
    }

    @Override
    public String[] itemsNames() {
        String[] strs = new String[size];
        for(int i = 0; i < size; i++){
            strs[i] = items[i].getName();
        }
        return strs;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        for(int i = 0; i < size; i++){
            if(items[i].getName().equals(itemName)) count++;
        }
        return count;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        int count = 0;
        for(int i = 0; i < size; i++){
            if(items[i] == item) count++;
        }
        return count;
    }

    @Override
    public MenuItem[] getItems() {
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        boolean exchange = false;
        for(int i = 0; i < size; i++){
            if(items[i].getName().equals(itemName)) exchange = true;
            if(exchange && i!=size-1) items[i] = items[i+1];
        }
        items[size-1] = null;
        size--;
        return true;
    }

    @Override
    public boolean remove(MenuItem item) {
        boolean exchange = false;
        for(int i = 0; i < size; i++){
            if(items[i] == item) exchange = true;
            if(exchange && i!=size-1) items[i] = items[i+1];
        }
        items[size-1] = null;
        size--;
        return true;
    }

    @Override
    public int removeAll(String itemName) {
        int sc = 0;
        for(int i = 0; i < size; i++){
            if(items[i].getName().equals(itemName) && i!=size-1) {
                for(int j = i; j < size; j++) items[i] = items[i+1];
                items[size-1] = null;
                size--;
                sc++;
            }
        }
        if(items[size-1].getName().equals(itemName)) items[size-1] = null;
        return sc;
    }

    @Override
    public int removeAll(MenuItem item) {
        int sc = 0;
        for(int i = 0; i < size; i++){
            if(items[i] == item && i!=size-1) {
                for(int j = i; j < size; j++) items[i] = items[i+1];
                items[size-1] = null;
                size--;
                sc++;
            }
        }
        if(items[size-1] == item) items[size-1] = null;
        return sc;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] n = items;
        int gap = n.length / 2;
        while (gap >= 1) {
            for (int right = 0; right < n.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (n[c].getPrice() > n[c + gap].getPrice()) {
                        MenuItem tmp = n[c + gap];
                        n[c+gap] = n[c];
                        n[c] = tmp;
                    }
                }
            }
            gap = gap / 2;
        }
        return n;
    }

    @Override
    public int costTotal() {
        int cost = 0;
        for(int i = 0; i < size; i++){
            cost += items[i].getPrice();
        }
        return cost;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public int getCost() {
        int cost = 0;
        for(int i = 0; i < size; i++){
            cost+=items[i].getPrice();
        }
        return cost;
    }
}
