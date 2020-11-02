package rtu.mirea.lab6;

import java.util.Arrays;

public class Test {
    static void Reverse(Student[] IDNumber){
        for(int i=0; i<IDNumber.length;i++){
            Student temp = IDNumber[i];
            IDNumber[i] = IDNumber[IDNumber.length-1-i];
            IDNumber[IDNumber.length-1-i] = temp;
        }
    }

    static void InsertionSort(Student[] IDNumber){
        for (int left = 0; left < IDNumber.length; left++) {
            var value = IDNumber[left];
            int i = left - 1;
            for (i = left - 1; i >= 0; i--) {
                if (value.getID() < IDNumber[i].getID()) {
                    IDNumber[i + 1] = IDNumber[i];
                }
                else
                    break;
            }
            IDNumber[i + 1] = value;
        }
    }

    public static void main(String args[]) {
        var Students = Student.Students();
        System.out.println("Specified array:");
        for (int i=0; i<Students.length; i++)
            System.out.println(Students[i]);
        System.out.println("\nSorted array:");
        Reverse(Students);
        InsertionSort(Students);
        for (int i=0; i<Students.length; i++)
            System.out.println(Students[i]);
    }
}
