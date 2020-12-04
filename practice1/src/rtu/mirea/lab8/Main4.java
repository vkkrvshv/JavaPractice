package rtu.mirea.lab8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Виктория\\IdeaProjects\\practice1\\src\\rtu\\mirea\\lab8\\file1.txt";
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        try {
            Files.write(Paths.get(filePath), text.getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
