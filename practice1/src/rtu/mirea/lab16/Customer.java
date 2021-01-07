package rtu.mirea.lab16;

public final class Customer {
    private String firstName;
    private String secondName;
    private int age;
    private Address address;
    private final Customer MATURE_UNKNOWN_CUSTOMER = new Customer(firstName, secondName, 0, address);
    private final Customer NOT_MATURE_UNKNOWN_CUSTOMER = new Customer(firstName, secondName, age, address);

    public Customer(String firstName, String secondName, int age, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
