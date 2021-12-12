package baitap.baitapvn;

import java.time.LocalDate;

public class ScienceBook extends Book {
    private String type; // thể loại

    public ScienceBook() {
    }

    public ScienceBook(String type) {
        this.type = type;
    }

    public ScienceBook(String name, double price, int amount, String publishDate, String type) {
        super(name, price, amount, publishDate);
        this.type = type;
    }

    public ScienceBook(String name, double price, int amount, String publishDate) {
        super(name, price, amount, publishDate);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ScienceBook{" +
                "type='" + type + '\'' +
                super.toString()+
                '}';
    }
}
