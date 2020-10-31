package rtu.mirea.lab5;
import java.util.Scanner;

public class Task5 {
    public static int recursion(int n){
        if(n <= 9){
            return n;
        }
        else {
            int Sum = n%10;
            return Sum+recursion(n/10);
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(recursion(N));
    }
}
