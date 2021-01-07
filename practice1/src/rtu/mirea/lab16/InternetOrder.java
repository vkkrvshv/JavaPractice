package rtu.mirea.lab16;

class ListNode {
    ListNode next;
    MenuItem value;

    public ListNode(ListNode next, MenuItem value) {
        this.next = next;
        this.value = value;
    }
}

public class InternetOrder implements Order{
    private int size = 0;
    private ListNode head;
    private ListNode tail;
    Customer customer;

    public InternetOrder(MenuItem[] mas){
        for (MenuItem ma : mas) add(ma);
    }

    public InternetOrder(){}

    @Override
    public boolean add(MenuItem item) {
        ListNode n = new ListNode(null, item);;
        try {
            if (head == null && tail == null){
                tail = n;
                head = n;
                head.next = tail;
            }
            else {
                ListNode s = head;
                s.next = n;
                head = n;
            }
            size++;
        }
        catch (Exception ex) { return false;}
        return true;
    }

    @Override
    public String[] itemsNames() {
        String[] strs = new String[size];
        ListNode n = tail;
        for(int i = 0; i < size; n = n.next, i++){
            strs[i] = n.value.getName();
        }
        return strs;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int amount = 0;
        ListNode n = tail;
        for(int i = 0; i < size; n = n.next, i++){
            if(n.value.getName().equals(itemName)) amount++;
        }
        return amount;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        int amount = 0;
        ListNode n = tail;
        for(int i = 0; i < size; n = n.next, i++){
            if(n.value == item) amount++;
        }
        return amount;
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] list = new MenuItem[size];
        ListNode n = tail;
        for(int i = 0; i < size; n = n.next, i++){
            list[i] = n.value;
        }
        return list;
    }

    @Override
    public boolean remove(String itemName) {
        try {
            if (tail.value.getName().equals(itemName)) tail = tail.next;
            else {
                for (ListNode n = tail; n != head; n = n.next) {
                    if (n.next.value.getName() == itemName) {
                        n.next = n.next.next;
                        if (head == n.next) head = n;
                        break;
                    }
                }
            }
        }
        catch (Exception ex) {return false;}
        return true;
    }

    @Override
    public boolean remove(MenuItem item) {
        try {
            if (tail.value == item) tail = tail.next;
            else {
                for (ListNode n = tail; n != head; n = n.next) {
                    if (n.next.value == item) {
                        n.next = n.next.next;
                        if (head == n.next) head = n;
                        break;
                    }
                }
            }
        }
        catch (Exception ex) {return false;}
        return true;
    }

    @Override
    public int removeAll(String itemName) {
        int i = 0;
        if (tail.value.getName().equals(itemName)) tail = tail.next;
        else {
            for (ListNode n = tail; n != head; n = n.next) {
                if (n.next.value.getName() == itemName) {
                    n.next = n.next.next;
                    if (head == n.next) head = n;
                    i++;
                }
            }
        }
        return i;
    }

    @Override
    public int removeAll(MenuItem item) {
        int i = 0;
        if (tail.value == item) tail = tail.next;
        else {
            for (ListNode n = tail; n != head; n = n.next) {
                if (n.next.value == item) {
                    n.next = n.next.next;
                    if (head == n.next) head = n;
                    i++;
                }
            }
        }
        return i;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] list = getItems();
        int gap = list.length / 2;
        while (gap >= 1) {
            for (int right = 0; right < list.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (list[c].getPrice() > list[c + gap].getPrice()) {
                        MenuItem tmp = list[c + gap];
                        list[c+gap] = list[c];
                        list[c] = tmp;
                    }
                }
            }
            gap = gap / 2;
        }
        return list;
    }

    @Override
    public int costTotal() {
        int cost = 0;
        ListNode n = tail;
        for(int i = 0; i < size; n = n.next, i++){
            cost += n.value.getPrice();
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
        ListNode n = tail;
        int cost = 0;
        for(int i = 0; i < size; n = n.next, i++){
            cost+=n.value.getPrice();
        }
        return cost;
    }
}
