package Models;

import Interfaces.iDescuento;

public class Sillas extends Muebles implements iDescuento{

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

    @Override
    public Double aplicarDescuento(int porcentaje) {
        Double price=getPrice();
        return (price - price/100.00*porcentaje);
    }
    
}
