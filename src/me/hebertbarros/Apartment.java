package me.hebertbarros;

public class Apartment extends Home {
    private short internalNumber;

    public Apartment(String street, char section, short number, int price, long buildDate,
                     float tax, double cubicMeters, boolean mortgaged, short internalNumber) {
        super(street, section, number, price, buildDate, tax, cubicMeters, mortgaged);
        this.internalNumber = internalNumber;
    }
}
