
import java.util.Scanner;

public class Inventario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] nombre = new String[5]; 
        int[] cantidad = new int[5];
        float[] precio = new float[5];
        int contador = 0;

        int opcion;

        do {
            System.out.println("--- Menu de la Tienda ---");
            System.out.println("1. Añadir Producto");
            System.out.println("2. Visualizar Inventario");
            System.out.println("3. Total");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            if (opcion == 1) {
                if (contador < nombre.length) {
                    System.out.println("--- Añadir Producto ---");
                    System.out.print("Nombre del producto: ");
                    nombre[contador] = scanner.nextLine();

                    System.out.print("Cantidad de Producto: ");
                    cantidad[contador] = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Precio por unidad: ");
                    precio[contador] = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.println("Producto agregado.");
                    contador++;
                } else {
                    System.out.println("Tu carrito a llegado a su limite.");
                }
            } else if (opcion == 2) {
                System.out.println("--- Inventario ---");
                if (contador > 0) {
                    for (int i = 0; i < contador; i++) {
                        System.out.println("Nombre: " + nombre[i] +
                                           " - Cantidad: " + cantidad[i] +
                                           " - Precio: " + precio[i]);
                    }
                } else {
                    System.out.println("Tu carrito aùn esta vacio.");
                }
            } else if (opcion == 3) {
                float valorTotal = 0;
                for (int i = 0; i < contador; i++) {
                    valorTotal = valorTotal + (cantidad[i] * precio[i]);
                }
                System.out.println("--- Valor Total ---");
                System.out.println("El valor total es: " + valorTotal);
            } else if (opcion == 4) {
                System.out.println("Gracias por la compra.");
            } else {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
