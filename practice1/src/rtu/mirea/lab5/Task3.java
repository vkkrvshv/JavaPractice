package rtu.mirea.lab5;
import java.util.Scanner;

public class Task3 {
    public static String recursion(int A, int B){
        if(A==B){
            return Integer.toString(A);
        }
        if(A>B){
            return A+" "+recursion(A - 1, B);
        }
        else {
            return A + " " + recursion(A + 1, B);
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(recursion(a,b));
    }
}
