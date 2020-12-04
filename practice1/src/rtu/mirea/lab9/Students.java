package rtu.mirea.lab9;

public class Students implements Comparable<Students>{
    private String Name;
    private int Marks;

    public Students(String name, int marks) {
        Name = name;
        Marks = marks;
    }

    public String getName() {
        return Name;
    }

    public int getMarks() {
        return Marks;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    @Override
    public int compareTo(Students o) {
        return Integer.compare(this.Marks, o.getMarks());
    }

    @Override
    public String toString() {
        return "Student: "  + Name + ", marks: " + Marks;
    }
}
