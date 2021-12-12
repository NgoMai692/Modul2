package baitap.baitapvn;

import java.time.LocalDate;

public class Novel extends  Book{
    private String author; // Tác giả

    public Novel() {
    }

    public Novel(String author) {
        this.author = author;
    }

    public Novel(String name, double price, int amount, String publishDate, String author) {
        super(name, price, amount, publishDate);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "author='" + author + '\'' +
                super.toString()+
                '}';
    }
}

