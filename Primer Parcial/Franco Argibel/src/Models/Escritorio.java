package Models;

public class Escritorio extends Muebles{

    //Attributes

    private double alto;
    private double ancho;

    //Constructor

    public Escritorio(String name, double price, Integer stock, double alto, double ancho) {
        super(name, price, stock);
        this.alto = alto;
        this.ancho = ancho;
    }

    //Getters and Setters

    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    //Methods

    @Override
    public String toString() {
        return "Escritorio [alto=" + alto + ", ancho=" + ancho + "]";
    }

}
