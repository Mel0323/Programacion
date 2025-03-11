package Tarea;
import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[30];

        System.out.println("Ingresa 30 números:");
        for (int i = 0; i < 30; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        
        int mayor = numeros[0];
        int menor = numeros[0];
        int contarMayor = 0;
        int contarMenor = 0;
    
    }
}

