package rtu.mirea.lab9;

import java.util.ArrayList;

public class LabClass {
    private final ArrayList<Students> listOfStudents;
    Students requiredStudent = null;

    public LabClass() {
        this.listOfStudents = new ArrayList<>();
    }

    public void add(Students student) {
        listOfStudents.add(student);
        listOfStudents.sort(Students::compareTo);
    }

    public Students find(String name) throws StudentException {
        listOfStudents.forEach(student -> {
            if (student.getName().equals(name))
                requiredStudent = student;
        });
        if (requiredStudent == null) {
            throw new StudentException("Студент " + name + " не найден!");
        }
        return requiredStudent;
    }

    public Students remove() {
        return listOfStudents.remove(0);
    }

    public boolean isEmpty() {
        return listOfStudents.isEmpty();
    }
}
