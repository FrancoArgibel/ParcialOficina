package Models;

public class Notebook extends ProductosInformaticos{
    
    //Attributes

    private String fabricante;
    private Integer memoria;

    //Constructor

    public Notebook(String name, double price, Integer stock, String fabricante, Integer memoria) {
        super(name, price, stock);
        this.fabricante = fabricante;
        this.memoria = memoria;
    }

    //Getters and Setters

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    //Methods

    @Override
    public String toString() {
        return "Notebook [memoria=" + memoria + "]";
    }


    
}
