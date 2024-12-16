package Lab1_variant4;

public class Main {
    public static void main(String[] args) {
        Date defaultDate = new Date();
        defaultDate.printDate();

        Date customDate = new Date(25, 12, 2024);
        customDate.printDate();

        customDate.setDay(31);
        customDate.setMonth(10);
        customDate.setYear(2023);
        customDate.printDate();
    }
}

