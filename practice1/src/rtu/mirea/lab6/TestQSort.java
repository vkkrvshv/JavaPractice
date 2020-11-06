package rtu.mirea.lab6;

import java.util.ArrayList;

public class TestQSort {
    static String[] names = new String[]{"Nancy","Terry","Trey","Fletch","Brad"};
    static String[] surnames = new String[]{"Alderson","Nerty","Drew","Paultry","Merty"};

    public static void main(String args[]){
        ArrayList<Students> array = new ArrayList<>(10);
        for(int i=0;i<10;i++)
            array.add(new Students(names[i%names.length]+" "+surnames[i%surnames.length], i*60%17+2));
        System.out.println("List of students:");
        for(int i=0;i<10;i++)
            System.out.println(array.get(i).getName()+" "+array.get(i).getMarks());
        SortingStudentsByGPA arr = new SortingStudentsByGPA();
        arr.QuickSort(array, 0, array.size()-1);
        System.out.println("\nSorted list of students by their marks:");
        for(int i=0;i<10;i++)
            System.out.println(array.get(i).getName()+" "+ array.get(i).getMarks());
    }
}
