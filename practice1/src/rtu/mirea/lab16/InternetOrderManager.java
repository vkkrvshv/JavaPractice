package rtu.mirea.lab16;

class QueueNode{
    QueueNode next;
    QueueNode prev;
    Order value;

    public QueueNode(QueueNode next, QueueNode prev, Order value) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }
}

public class InternetOrderManager implements OrdersManager{
    private QueueNode head;
    private QueueNode tail;
    private int size = 0;

    public boolean add(Order order){
        if(head == null && tail == null){
            tail = new QueueNode(null, null, order);
            head = tail;
            tail.next = head;
        }
        else{
            QueueNode n = new QueueNode(tail, null, order);
            tail = n;
        }
        size++;
        return true;
    }

    public Order remove(){
        Order n = head.value;
        head = head.prev;
        head.next = tail;
        size--;
        return n;
    }

    public Order order(){
        return remove();
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        QueueNode n = head;
        for(int i = 0; i < size; i++, n = n.prev) count += n.value.itemQuantity(itemName);
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        QueueNode n = head;
        for(int i = 0; i < size; i++, n = n.prev) count += n.value.itemQuantity(item);
        return count;
    }

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size];
        QueueNode n = head;
        for(int i = 0; i < size; i++, n = n.prev) orders[i] = n.value;
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        QueueNode n = head;
        int cost = 0;
        for(int i = 0; i < size; i++, n = n.prev) cost+=n.value.getCost();
        return cost;
    }

    @Override
    public int ordersQuantity() {
        return size;
    }
}
