package rtu.mirea.lab2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1=new Author("Tray Merty", "traym17@gmail.com", 'F');
        Author author2=new Author("Fletcher","fletch29@yandex.ru",'M');
        System.out.println(author1);
        System.out.println(author2.getGender());
        System.out.println(author2.getName());
        System.out.println(author2.getEmail());
    }
}
