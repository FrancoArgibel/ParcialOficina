package Models;

public class Sillas extends Muebles {

    //Attributes
    
    private boolean ruedas;

    //Constructor

    public Sillas(String name, double price, Integer stock, boolean ruedas) {
        super(name, price, stock);
        this.ruedas = ruedas;
    }

    //Getters and Setters

    public boolean isRuedas() {
        return ruedas;
    }

    public void setRuedas(boolean ruedas) {
        this.ruedas = ruedas;
    }

    //Methods

    @Override
    public String toString() {
        return "Sillas [ruedas=" + ruedas + "]";
    }

    
}
