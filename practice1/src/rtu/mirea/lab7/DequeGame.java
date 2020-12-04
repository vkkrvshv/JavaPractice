package rtu.mirea.lab7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeGame {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Deque<Integer> d1=new ArrayDeque<Integer>();
        Deque<Integer> d2=new ArrayDeque<Integer>();
        for(int i=0;i<5;i++)
            d1.add(scanner.nextInt());
        for(int i=0;i<5;i++)
            d2.add(scanner.nextInt());
        BaseofGame(d1,d2);
    }
    public static void BaseofGame(Deque<Integer> d1,Deque<Integer> d2) {
        int moves = 0;
        while (!d1.isEmpty() && !d2.isEmpty() && moves < 107) {
            int FirstCard = d1.pop();
            int SecondCard = d2.pop();
            if (FirstCard == 0 && SecondCard == 9) {
                d1.add(FirstCard);
                d1.add(SecondCard);
            } else if (FirstCard == 9 && SecondCard == 0) {
                d2.add(FirstCard);
                d2.add(SecondCard);
            } else if (FirstCard < SecondCard) {
                d2.add(FirstCard);
                d2.add(SecondCard);
            } else {
                d1.add(FirstCard);
                d1.add(SecondCard);
            }
            moves++;
        }
        if (moves == 107) {
            System.out.println("botva");
        }
        else if (d2.isEmpty()) {
            System.out.println("FIRST is the winner! Quantity of moves before the winning: "+moves);
        }
        else {
            System.out.println("SECOND is the winner! Quantity of moves before the winning: "+moves);
        }
    }
}
