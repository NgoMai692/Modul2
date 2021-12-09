public class Product {
    private int id;
    private String name;
    private long price; // giá
    private String categories; //loại
    private String money = "USD";

    public Product() {
    }

    public Product(int id, String name, long price, String categories) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categories = categories;
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
