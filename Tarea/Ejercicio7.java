package Tarea;
import java.util.Scanner;

public class Ejercicio7 {
   

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        int[] A = new int[10];

       
        System.out.println("Ingresa 10 números para el arreglo A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        int[] pares = new int[10];   // Máximo 10 pares
        int[] impares = new int[10]; // Máximo 10 impares
        int contadorPares = 0;      

    
    }
}
