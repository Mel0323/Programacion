package Tarea;
import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de elementos del arreglo: ");
        int N = scanner.nextInt();

        int[] A = new int[N];
        int[] B = new int[N - 1];

        System.out.println("Ingresa los elementos del arreglo A:");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            B[i] = A[i + 1] - A[i];
        }

        System.out.print("Arreglo resultante B: ");
        for (int i = 0; i < N - 1; i++) {
            System.out.print(B[i] + " ");
        }

        
    }
}
    
    
       