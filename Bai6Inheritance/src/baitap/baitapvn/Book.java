package baitap.baitapvn;

import java.time.LocalDate;

public class Book {
    private String name;
    private double price;   // giá
    private int amount;     // số lượng
    private String publishDate; // ngày xuất bản

    public Book() {
    }

    public Book(String name, double price, int amount, String publishDate) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", publishDate=" + publishDate +
                '}';
    }
}
