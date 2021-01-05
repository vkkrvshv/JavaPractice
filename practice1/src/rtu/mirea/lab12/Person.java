package rtu.mirea.lab12;

public class Person {
    private String firstName, secondName, middleName;

    Person(String name, String surname, String middleName) {
        this.firstName = name;
        this.secondName = surname;
        this.middleName = middleName;
    }

    public String toString() {
        if (firstName == null || middleName == null) {
            return secondName;
        }
        else {
            return (secondName + " " + ((firstName.toUpperCase()).toCharArray())[0] + "." + ((middleName.toUpperCase()).toCharArray())[0] + ".");
        }
    }
    
    public static void main(String[] args){
        Person pers1 = new Person("Виктория", "Кривошеева", "Дмитриевна");
        System.out.println(pers1.toString());
        Person pers2 = new Person("Victoria", "Krivosheeva", null);
        System.out.println(pers2.toString());
        Person pers3 = new Person(null, "Krivosheeva", "Dmitrievna");
        System.out.println(pers3.toString());
    }
}
