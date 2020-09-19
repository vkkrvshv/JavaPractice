package rtu.mirea.lab1;

public class Book {
    private String name;
    private int numbpages;

    public Book(String name, int numbpages) {
        this.name = name;
        this.numbpages = numbpages;
    }

    public Book(String name) {
        this.name = name;
    }

    public void setNumbpages(int numbpages) {
        this.numbpages = numbpages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString () {
        return "'"+this.name+"', number of pages: " + this.numbpages;
    }

    public void Somebook () {
        System.out.println("The book '"+this.name + "' has " + this.numbpages+" pages");
    }
}
