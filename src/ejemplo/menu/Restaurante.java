package ejemplo.menu;
//abstract parcial POO
//Juan Pablo Uribe Quiroga
import java.util.ArrayList;

public class Restaurante {
    
    private ArrayList<Plato> menu;

    public Restaurante() {
        menu = new ArrayList<>();
        menu.add(new Plato("Ensaladas", 10000));
        menu.add(new Plato("Pizza ", 7000));
        menu.add(new Plato("Hamburguesa ", 18000));
        menu.add(new Plato("Lasagna", 20000));
        menu.add(new Plato("Salchipapa", 15000));
    }

    public void mostrarMenu() {
        System.out.println("Menu Disponible:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i));
        }
    }

    public Plato obtenerPlato(int opcion) {
        if (opcion >= 1 && opcion <= menu.size()) {
            return menu.get(opcion - 1);
        }
        return null;
    }
}

