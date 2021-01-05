package rtu.mirea.lab12;

public class PhoneNumber {
    private final String number;
    private String kod;

    public PhoneNumber(String number) {
        this.number = parseNumber(number);
    }

    public String parseNumber(String number) {
        boolean isPlus = number.charAt(0) == '+';
        kod = number.substring(0, number.length() - 10);
        if (!isPlus) {
            if(kod.equals("8")){
                this.kod = "+7";
            }
            else this.kod = "+" + kod;
        }
        number = number.substring(number.length() - 10, number.length());
        return this.kod + " "+number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6, 10);
    }

    public String toString() {
        return "Номер телефона: " + number;
    }

    public static void main(String[] args) {
        PhoneNumber phone1 = new PhoneNumber("+79779796454");
        PhoneNumber phone2 = new PhoneNumber("89165321469");
        System.out.println(phone1);
        System.out.println(phone2);
    }
}
