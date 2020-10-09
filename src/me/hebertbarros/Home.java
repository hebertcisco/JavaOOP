package me.hebertbarros;

import java.util.Objects;

public class Home {
    private String street;
    private char section;
    private short number;
    private int price;
    private long buildDate;
    private float tax;
    private  double cubicMeters;
    private boolean mortgaged;

    public Home(String street, char section, short number, int price, long buildDate,
                float tax, double cubicMeters, boolean mortgaged) {
        this.street = street;
        this.section = section;
        this.number = number;
        this.price = price;
        this.buildDate = buildDate;
        this.tax = tax;
        this.cubicMeters = cubicMeters;
        this.mortgaged = mortgaged;
    }

    public Home(String street, short number,boolean mortgaged, short tax) {
        this.street = street;
        this.number = number;
        this.mortgaged = mortgaged;
        this.tax = tax;
    }

    public Home() {

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public short getNumber() {
        return number;
    }

    public void setNumber(short number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(long buildDate) {
        this.buildDate = buildDate;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public double getCubicMeters() {
        return cubicMeters;
    }

    public void setCubicMeters(double cubicMeters) {
        this.cubicMeters = cubicMeters;
    }

    public boolean isMortgaged() {
        return mortgaged;
    }

    public void setMortgaged(boolean mortgaged) {
        this.mortgaged = mortgaged;
    }

    @Override
    public String toString() {
        return "Home{" +
                "street='" + street + '\'' +
                ", section=" + section +
                ", number=" + number +
                ", price=" + price +
                ", buildDate=" + buildDate +
                ", tax=" + tax +
                ", cubicMeters=" + cubicMeters +
                ", mortgaged=" + mortgaged +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Home home = (Home) o;
        return section == home.section &&
                number == home.number &&
                price == home.price &&
                buildDate == home.buildDate &&
                Float.compare(home.tax, tax) == 0 &&
                Double.compare(home.cubicMeters, cubicMeters) == 0 &&
                mortgaged == home.mortgaged &&
                Objects.equals(street, home.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, section, number, price, buildDate, tax, cubicMeters, mortgaged);
    }
}
