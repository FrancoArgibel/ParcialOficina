package Models;

public class Productos {
    
    //Attributes

    private String name;
    private double price;
    private Integer Stock;

    //Constructor
    public Productos(String name, double price, Integer stock) {
        this.name = name;
        this.price = price;
        Stock = stock;
    }

    //Getters and Setters

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

    public Integer getStock() {
        return Stock;
    }

    public void setStock(Integer stock) {
        Stock = stock;
    }

    //Methods

    @Override
    public String toString() {
        return "Productos [name=" + name + ", price=" + price + ", Stock=" + Stock + "]";
    }

    public void aumentarPrecios (int porcentaje){
        this.price=this.price+ (this.price /100 *porcentaje);
        setPrice(this.price);
    }
}
