package rtu.mirea.lab5;
import java.util.Scanner;

public class Task2 {
    public static String recursion(int n){
        if(n==1){
            return "1";
        }
        return recursion(n-1)+" "+n;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(recursion(N));
    }
}
