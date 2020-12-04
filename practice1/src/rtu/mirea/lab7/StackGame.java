package rtu.mirea.lab7;

import java.util.Scanner;
import java.util.Stack;

public class StackGame {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Stack<Integer> st1=new Stack();
        Stack<Integer> st2=new Stack();
        for(int i=0;i<5;i++)
            st1.push(scanner.nextInt());
        for(int i=0;i<5;i++)
            st2.push(scanner.nextInt());
        BaseofGame(st1,st2);
    }
    public static void BaseofGame(Stack<Integer> st1,Stack<Integer> st2){
        int moves=0;
        while(!st1.isEmpty() && !st2.isEmpty() && moves<107){
            int FirstCard= st1.pop();
            int SecondCard=st2.pop();
            if(FirstCard==0 && SecondCard==9){
                st1.add(0,FirstCard);
                st1.add(0,SecondCard);
            }else if(FirstCard==9 && SecondCard==0){
                st2.add(0,FirstCard);
                st2.add(0,SecondCard);
            } else if(FirstCard<SecondCard){
                st2.add(0,FirstCard);
                st2.add(0,SecondCard);
            } else {
                st1.add(0,FirstCard);
                st1.add(0,SecondCard);
            }
            moves++;
        }
        if(moves==107){
            System.out.println("botva");
        }
        else if(st2.isEmpty()){
            System.out.println("FIRST is the winner! Quantity of moves before the winning: "+moves);
        }
        else{
            System.out.println("SECOND is the winner! Quantity of moves before the winning: "+moves);
        }
    }
}
