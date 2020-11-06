package rtu.mirea.lab6;
import java.util.Arrays;
import java.util.ArrayList;

public class SortingStudentsByGPA {
    public void QuickSort(ArrayList<Students> array, int a, int b){
        if(a<b){
            int index = QSort(array,a,b);
            QuickSort(array, a, index-1);
            QuickSort(array, index, b);
        }
    }
    public static int QSort(ArrayList<Students> array, int a, int b){
        ComparatorSt T = new ComparatorSt();
        int left = a;
        int right = b;
        Students S = array.get(a+(b-a)/2);
        while(left<=right){
            while(T.compare(array.get(left),S)<0)
                left++;
            while(T.compare(array.get(right),S)>0)
                right--;
            if(left<=right){
                Swap(array,left,right);
                left++;
                right--;
            }
        }
        return left;
    }
    private static void Swap(ArrayList<Students> array, int left, int right){
        String name = array.get(left).getName();
        int numb = array.get(left).getMarks();
        array.get(left).setName(array.get(right).getName());
        array.get(left).setMarks(array.get(right).getMarks());
        array.get(right).setName(name);
        array.get(right).setMarks(numb);
    }
}
