package Models;

import Interfaces.iDescuento;

public class Impresoras extends ProductosInformaticos implements iDescuento{

    //Attributes

    private String fabricante;
    private Integer copiasxMin;

    //Constructor

    public Impresoras(String name, double price, Integer stock, String fabricante, Integer copias) {
        super(name, price, stock);
        this.fabricante = fabricante;
        this.copiasxMin = copias;
    }

    //Getters and Setters

    public Integer getCopias() {
        return copiasxMin;
    }

    public void setCopias(Integer copias) {
        this.copiasxMin = copias;
    }
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public String getFabricante() {
        return fabricante;
    }

    //Methods

    @Override
    public String toString() {
        return "Impresoras [copias=" + copiasxMin + "]";
    }

    @Override
    public Double aplicarDescuento(int porcentaje) {
        Double price=getPrice();
        return (price - price/100.00*porcentaje);
    }
    
}
