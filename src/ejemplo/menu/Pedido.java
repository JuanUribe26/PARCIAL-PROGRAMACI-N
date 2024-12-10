package ejemplo.menu;
//abstract parcial POO
//Juan Pablo Uribe Quiroga
import java.util.ArrayList;

public class Pedido {
    
    private final ArrayList<Plato> platos;

    public Pedido() {
        platos = new ArrayList<>();
    }

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public double total() {
        double total = 0;
        for (Plato plato : platos) {
            total += plato.getPrecio();
        }
        return total;
    }

    public void mostrarPedido() {
        System.out.println("Pedido:");
        for (Plato plato : platos) {
            System.out.println(plato);
        }
        System.out.println("Total: $" + String.format("%.2f", total()));
    }
}
    

