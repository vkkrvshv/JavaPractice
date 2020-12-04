package rtu.mirea.lab8;

import java.io.*;
import java.io.InputStreamReader;


public class Main3 {
    public static void main(String[] args){
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\Виктория\\IdeaProjects\\practice1\\src\\rtu\\mirea\\lab8\\file1.txt")))){
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("C:\\Users\\Виктория\\IdeaProjects\\practice1\\src\\rtu\\mirea\\lab8\\file2.txt")));
            String string = null;
            while((string =reader.readLine())!=null) {
                    BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
                    writer.write(reader1.readLine());
            }
            writer.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
