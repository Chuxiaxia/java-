package hm_day7.Test9;

public class Book {
    private int number;
    private String name;
    private String coding;
    private double price;
    private String data;
    public Book(){

    }

    public Book(int number, String name, String coding, double price, String data) {
        this.number = number;
        this.name = name;
        this.coding = coding;
        this.price = price;
        this.data = data;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoding() {
        return coding;
    }

    public void setCoding(String coding) {
        this.coding = coding;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
