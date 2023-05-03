package Models;

public class Impresoras extends ProductosInformaticos {

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

    
    
}
