package Tarea;

import java.util.Scanner;


public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de personas: ");
        int N = scanner.nextInt();

        int[] edades = new int[N];

        System.out.println("Ingresa las edades:");
        for (int i = 0; i < N; i++) {
            edades[i] = scanner.nextInt();
        }

        int mayorEdad = edades[0];

        for (int i = 1; i < N; i++) {
            if (edades[i] > mayorEdad) {
                mayorEdad = edades[i];  
            }
        }

        System.out.println("La mayor edad es: " + mayorEdad);

    }
}

