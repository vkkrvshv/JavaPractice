package rtu.mirea.lab1;
public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Mylie", 2);
        Dog dog2 = new Dog("Kelly", 7);
        Dog dog3 = new Dog("Hensen");
        dog3.setAge(1);
        System.out.println(dog1);
        dog1.intoHumanAge();
        dog2.intoHumanAge();
        dog3.intoHumanAge();

        Book book1=new Book("The book thief", 560);
        Book book2=new Book("War and peace", 1225);
        System.out.println(book1);
        book2.Somebook();
    }
}
