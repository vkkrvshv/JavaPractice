package rtu.mirea.lab6;

public class Students {
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
}
