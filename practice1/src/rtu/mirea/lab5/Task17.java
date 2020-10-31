package rtu.mirea.lab5;
import java.util.Scanner;

public class Task17 {
    public static int recursion(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n == 0)
        {
            return 0;
        }
        else {
            return Math.max(n,recursion());
        }
    }
    public static void main(String args[]){
        System.out.println(recursion());
    }
}
