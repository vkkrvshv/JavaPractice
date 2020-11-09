package rtu.mirea.lab7;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueGame {
    public static void BaseofGame(Queue<Integer> q1, Queue<Integer> q2){
        int moves=0;
        while(!q1.isEmpty() && !q2.isEmpty() && moves<107){
            int FCard = q1.remove();
            int SCard = q2.remove();
            if(FCard==0 && SCard==9){
                q1.add(FCard);
                q1.add(SCard);
            }
            if(FCard==9 && SCard==0){
                q2.add(FCard);
                q2.add(SCard);
            }
            else if(FCard<SCard){
                q2.add(FCard);
                q2.add(SCard);
            }
            else if(FCard>SCard){
                q1.add(FCard);
                q1.add(SCard);
            }
            moves++;
        }
        if(moves==107)
            System.out.println("botva "+moves);
        else if(q1.isEmpty())
            System.out.println("SECOND is the winner! Quantity of moves before the winning: "+moves);
        else if(q2.isEmpty())
            System.out.println("FIRST is the winner! Quantity of moves before the winning: "+moves);
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> q1 = new ArrayDeque<Integer>();
        Queue<Integer> q2 = new ArrayDeque<Integer>();
        for(int i=0;i<5;i++)
            q1.add(scanner.nextInt());
        for(int i=0;i<5;i++)
            q2.add(scanner.nextInt());
        BaseofGame(q1,q2);
    }
}
