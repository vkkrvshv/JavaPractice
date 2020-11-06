package rtu.mirea.lab6;
import java.util.Comparator;

public class ComparatorSt implements Comparator<Students>{
    public int compare(Students s1,Students s2){
        return s1.getMarks() - s2.getMarks();
    }
}
