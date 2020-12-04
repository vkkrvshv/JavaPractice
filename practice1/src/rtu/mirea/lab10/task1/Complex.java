package rtu.mirea.lab10.task1;

public class Complex {
    int real;
    int image;

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public int getReal() {
        return real;
    }

    public int getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "Complex: " + "real = " + real + ", image = " + image;
    }

    public static void main(String[] args) {
        Complex a = new Complex(1, 19);
        System.out.println(a);

        ComplexAbstractFactory b = new ConcreteFactory();
        Complex c = b.createComplex(7, -11);
        System.out.println(c);
    }
}
