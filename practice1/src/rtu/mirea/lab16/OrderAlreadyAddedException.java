package rtu.mirea.lab16;

public class OrderAlreadyAddedException extends Exception{
    public OrderAlreadyAddedException(){
        super("С данным столиком или адресом уже связан заказ.");
    }
}
