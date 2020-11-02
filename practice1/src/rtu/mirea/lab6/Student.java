package rtu.mirea.lab6;

import java.util.Arrays;

public class Student {
    private int ID;
    private String name;
    private String surname;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString(){
        return "Student: ID="+ID+", name="+name+", surname="+surname+".";
    }

    static String[] names = new String[]{"Nancy","Terry","Trey","Fletch","Brad"};
    static String[] surnames = new String[]{"Alderson","Nerty","Drew","Paultry","Merty"};

    public static Student[] IDNumber(){
        var IDNumber = new Student[10];
        for (int i = 0; i < 10; i++) {
            var Student = new Student();
            Student.setID(i*60%17);
            Student.setName(names[i%names.length]);
            Student.setSurname(surnames[i%surnames.length]);
            IDNumber[i]=Student;
        }
        return IDNumber;
    }
}
