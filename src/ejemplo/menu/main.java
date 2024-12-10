
package ejemplo.menu;
//abstract parcial POO
//Juan Pablo Uribe Quiroga
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurante restaurante = new Restaurante();
        Empleado empleado = new Empleado("Juan Pablo");

        while (true) {
            System.out.println("\n----Menu de opciones:-----");
            System.out.println("1. Ver menu disponible");
            System.out.println("2. Realizar pedido");
            System.out.println("3. Salir");
            System.out.println("--------------------------");

            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                empleado.mostrarMenu(restaurante);
            } else if (opcion == 2) {
                empleado.realizarPedido(restaurante);
            } else if (opcion == 3) {
                System.out.println("Gracias por usar el simulador del restaurante.");
                break;
            } else {
                System.out.println("Ingrese una de las opciones dadas, gracias");
            }
        }
    }
}


    
  
