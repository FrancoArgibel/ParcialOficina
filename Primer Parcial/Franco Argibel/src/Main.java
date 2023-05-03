import java.util.ArrayList;
import java.util.List;

import Models.Escritorio;
import Models.Impresoras;
import Models.Notebook;
import Models.Productos;
import Models.Sillas;

public class Main {
    public static void main(String[] args) throws Exception {

        Sillas s = new Sillas("Gamer",100,3, true);
        Escritorio e = new Escritorio("Vikin",150,4,60,120);
        Impresoras i = new Impresoras("pep",200,1,"LG",100);
        Notebook n = new Notebook("pop",250,10,"MSI",32);

        List<Productos> listProductos = new ArrayList<>();
        listProductos.add(s);
        listProductos.add(e);
        listProductos.add(i);
        listProductos.add(n);

        for (Productos products : listProductos){
            System.out.println(products.toString());
        }

        s.Descuento(15);
        System.out.println("\n\n El nuevo precio de las sillas es: " + s.getPrice());
        i.Descuento(15);
        System.out.println("El nuevo precio de las Impresoras es: " + i.getPrice());

        System.out.println("\n");
        for (Productos products : listProductos){
            {
                System.out.println(products.getClass().getName() + " precio original: $" + products.getPrice());

                if(products.getClass().getName()=="Sillas"){
                    products.Descuento(5);
                }else if(products.getClass().getName()=="Escritorio"){
                    products.Descuento(10);
                }else if(products.getClass().getName()=="Impresoras"){
                    products.Descuento(15);
                }else{
                    products.Descuento(20);
                }
            }
            System.out.println("\n" + products.getClass().getName() + " precio nuevo $" + products.getPrice());
        }


    }
}
