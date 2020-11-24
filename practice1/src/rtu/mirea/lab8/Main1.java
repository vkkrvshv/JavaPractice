package rtu.mirea.lab8;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args){
        try(FileWriter writer = new FileWriter("C:\\Users\\Виктория\\IdeaProjects\\practice1\\src\\rtu\\mirea\\lab8\\1.txt", false)){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            writer.write(reader.readLine());
            writer.append('\n');
            writer.flush();
            reader.close();
        } catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
