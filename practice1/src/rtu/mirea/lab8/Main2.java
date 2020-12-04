package rtu.mirea.lab8;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main2 {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Виктория\\IdeaProjects\\practice1\\src\\rtu\\mirea\\lab8\\1.txt"))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
