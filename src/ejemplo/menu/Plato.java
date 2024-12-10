package ejemplo.menu;
//abstract parcial POO
//Juan Pablo Uribe Quiroga
import java.util.ArrayList;
import java.util.Scanner;

public class Plato {

    private String nombre;
    private double precio;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    Plato(String pizza_, int i, int i0) {
        throw new UnsupportedOperationException("");
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String toString() {
        return nombre + " ------> $" + String.format("%.2f", precio);
    }
}





