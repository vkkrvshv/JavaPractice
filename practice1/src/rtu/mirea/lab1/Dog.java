package rtu.mirea.lab1;
import java.lang.*;
public class Dog {
        private String dname;
        private int dage;

    public Dog(String name, int age)
        {
            dname = name;
            dage = age;
        }

    public Dog(String name)
        {
            dname = name;
            dage = 0;
        }

    public Dog()
        {
            dname = "Puppy";
            dage = 0;
        }

        public void setAge (int age)
        {
            this.dage = age;
        }

        public void setName (String name)
        {
            this.dname = name;
        }

        public String getName (String name)
        {
            return name;
        }

        public int getAge ()
        {
            return dage;
        }

        public String toString () {
            return this.dname + ", age " + this.dage;
        }

        public void intoHumanAge () {
            System.out.println(dname + "'s age in human years is " + dage * 7 + " years");
        }
}
