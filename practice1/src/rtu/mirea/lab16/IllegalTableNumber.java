package rtu.mirea.lab16;

public class IllegalTableNumber extends RuntimeException {
    public IllegalTableNumber(){
        super("Столика с таким номером нет.");
    }
}
