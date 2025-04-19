
import java.util.Scanner;

public class Inventario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] nombre = new String[5]; // Aqui se define el nombre de los productos y la longitud del array que tiene un tamaño de 5. 
        int[] cantidad = new int[5]; // Aqui se define la cantidad de los productos que se vayan a ingresar.
        float[] precio = new float[5]; // Aqui se define el precio de los productos.
        int contador = 0; // Aqui se inicializa el contador que comenzara desde cero.

        int opcion; // El opcion se utiliza como una variable de ayuda para hacer el programa mas didactico.

        do { //Aqui utilizaremos un DO WHILE, para mostrar el menu y las opciones, las veces que sea necesaria.
            System.out.println("--- Menu de la Tienda ---");
            System.out.println("1. Añadir Producto");
            System.out.println("2. Visualizar Inventario");
            System.out.println("3. Total");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt(); // Aqui es para que el ususario ingrese la opcion que el necesita, ya que el programa se lo pide.
            scanner.nextLine(); 

            if (opcion == 1) { // si la opcion es 1 hara este proceso. 
                if (contador < nombre.length) {// Aqui el contador sera menos que la matriz de nombre.
                    System.out.println("--- Añadir Producto ---");
                    System.out.print("Nombre del producto: ");
                    nombre[contador] = scanner.nextLine();//Aqui se utilizara el array para que vaya reemplazando y haga su conteo del nombre del producto ingresado y lo almacene.

                    System.out.print("Cantidad de Producto: ");
                    cantidad[contador] = scanner.nextInt();// Aqui se utilizara el array para que al momento de ingresar nuestra cantidad de producto este lo almacene.
                    scanner.nextLine(); 

                    System.out.print("Precio por unidad: ");
                    precio[contador] = scanner.nextInt();// Aqui se utilizara el array para cuando se ingrese el precio el programa lo almacene y lo conserve para cuando se vaya a utilizar de nuevo
                    scanner.nextLine(); 

                    System.out.println("Producto agregado.");
                    contador++;//Este aumentara el producto agregado.
                } else {// Aqui es si los productos sobrepasan el tamaño del array este dara su aviso.
                    System.out.println("Tu carrito a llegado a su limite.");
                }
            } else if (opcion == 2) {// Aqui es el sino, si la persona ingresa la opcion 2 psara a mostrar el inventario. 
                System.out.println("--- Inventario ---");
                if (contador > 0) {// En este if el contador sera mayor por lo tanto hara lo siguiente.
                    for (int i = 0; i < contador; i++) {// Aqui para i es igual a 0, y el i es menor que el contador, se ira aumentando.
                        System.out.println("Nombre: " + nombre[i] +
                                           " - Cantidad: " + cantidad[i] +
                                           " - Precio: " + precio[i]);// Muestra en pantalla el nombre, la cantidad y el precio del producto actual (posición i en las listas). 
                    }
                } else {// Aquies un else (no) de que si no se cumple lo que esta anteriormenteb y si no tenemos nada agregado y el usuario desea ver el inventario le mostrara esta advertencia.
                    System.out.println("Tu carrito aùn esta vacio.");
                }
            } else if (opcion == 3) {// Aqui es la tercera opcion del menu que es para saber el valor total.
                float valorTotal = 0;// Este es el contador desde donde inicia el valor del vlortotal.
                for (int i = 0; i < contador; i++) {//Aqui seria si i es 1 y es mayor a contador este lo aumentara.
                    valorTotal = valorTotal + (cantidad[i] * precio[i]);//Aqui relizara su debido proceso para el valor final y el valor total deontro de este sirve para guardar el precio final por si el usuario ingresa mas cosas.
                }
                System.out.println("--- Valor Total ---");
                System.out.println("El valor total es: " + valorTotal);
            } else if (opcion == 4) { //este else es para la opcion 4 que funcionara par salirse del programa.
                System.out.println("Gracias por la compra.");
            } else {//si llegasemos a colocar como 5 una opcion no funcionara.
                System.out.println("Opción no válida.");
            }

        } while (opcion != 4);// si la opcion es diferente a 4 no funcionara y seguira en bucle hasta que demos la opcion 4 de salir.

        scanner.close();
    }
}
