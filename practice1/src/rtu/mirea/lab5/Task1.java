package rtu.mirea.lab5;
import java.util.Scanner;

public class Task1 {
    public static void recursion(int n){
        int str = 0;
        int j = 0;
        if(n==1)
            System.out.println("1");
        else{
            for(int i=1; str<n; i++) {
                str+=i;
                j=i;
            }
            --n;
            recursion(n);
            System.out.println(j);
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        recursion(n);
    }
}
