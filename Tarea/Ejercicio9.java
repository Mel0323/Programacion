package Tarea;

import java.util.Scanner;

public class Ejercicio9 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del arreglo: ");
        int n = scanner.nextInt();

        
        int[] arreglo = new int[n];

      
        System.out.println("Ingresa los " + n + " números del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

       
        System.out.print("Ingresa el número a buscar: ");
        int numeroABuscar = scanner.nextInt();

       
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (arreglo[i] == numeroABuscar) {
                contador++;
            }
        }

        
        System.out.println("El número " + numeroABuscar + " aparece " + contador + " veces en el arreglo.");

    }
}
