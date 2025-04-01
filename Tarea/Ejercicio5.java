package Tarea;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Ingresa la cantidad de productos: ");
        int N = scanner.nextInt();

       
        double[] preciosUnitarios = new double[N];
        int[] cantidadesCompradas = new int[N];
        String[] descripciones = new String[N];
        double[] totalGastado = new double[N];

        
        System.out.println("Ingresa los datos de los productos:");
        for (int i = 0; i < N; i++) {
            scanner.nextLine();  // Limpiar el buffer del Scanner
            System.out.print("Descripción del producto " + (i + 1) + ": ");
            descripciones[i] = scanner.nextLine();

            System.out.print("Precio unitario del producto " + (i + 1) + ": ");
            preciosUnitarios[i] = scanner.nextDouble();

            System.out.print("Cantidad comprada del producto " + (i + 1) + ": ");
            cantidadesCompradas[i] = scanner.nextInt();

           
            totalGastado[i] = preciosUnitarios[i] * cantidadesCompradas[i];
        }

       
        double totalGeneral = 0;
        double mayorGasto = totalGastado[0];  
        int indiceMayorGasto = 0;

        for (int i = 0; i < N; i++) {
            totalGeneral += totalGastado[i];

            // Encontrar el producto con el mayor gasto
            if (totalGastado[i] > mayorGasto) {
                mayorGasto = totalGastado[i];
                indiceMayorGasto = i;
            }
        }

       
        System.out.println("\nEl total general de todas las compras es: " + totalGeneral);

        
        System.out.println("\nEl producto con el mayor gasto es: ");
        System.out.println("Descripción: " + descripciones[indiceMayorGasto]);
        System.out.println("Total gastado: " + mayorGasto);

       
    }
}

