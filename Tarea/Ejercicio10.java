package Tarea;
import java.util.Scanner;
public class Ejercicio10 {
    


    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingresa el tamaño del arreglo A: ");
        int N = scanner.nextInt();

        
        int[] A = new int[N];
        
        
        System.out.println("Ingresa los " + N + " elementos para el arreglo A:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

       
        int[] B = new int[N / 2]; 

       
        for (int i = 0; i < N / 2; i++) {
            B[i] = A[i] + A[N - 1 - i];
        }

        
        System.out.print("El arreglo B es: (");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]);
            if (i < B.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");

        
    }
}


