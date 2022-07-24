public class Products {
    long id;
    String name;
    double price;


    // Constructor
    public Products(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    // Getters and Setters for id
    public long getId() {
        if (id <= 0) throw new IllegalArgumentException();
        else return id;
    }
    public void setId(long id) {
        if (id <= 0) throw new IllegalArgumentException();
        else this.id = id;
    }


    // Getters and Setters for name
    public String getName() {
        if (name == "") throw new IllegalArgumentException();
        else return name;
    }
    public void setName(String name) {
        if (name == "") throw new IllegalArgumentException();
        else this.name = name;
    }


    // Getters and Setters for price
    public double getPrice() {
        if (price <= 0) throw new IllegalArgumentException();
        else return price;
    }
    public void setPrice(double price) {
        if (price <= 0) throw new IllegalArgumentException();
        else this.price = price;
    }


    // Method for displaying list of all products
    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
