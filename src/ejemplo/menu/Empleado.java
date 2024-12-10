package ejemplo.menu;

import java.util.Scanner;


public class Empleado {
    private final String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarMenu(Restaurante restaurante) {
        restaurante.mostrarMenu();
    }

    public Pedido realizarPedido(Restaurante restaurante) {
        Pedido pedido = new Pedido();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            restaurante.mostrarMenu();
            System.out.print("Seleccione el numero del plato que desea agregar al pedido (0 para terminar): ");
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }

            Plato plato = restaurante.obtenerPlato(opcion);
            if (plato != null) {
                pedido.agregarPlato(plato);
                System.out.println(plato.getNombre() + " agregado al pedido.");
            } else {
                System.out.println("Opción invalida. Intente de nuevo.");
            }
        }

        pedido.mostrarPedido();
        return pedido;
    }
}

