package Tarea;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio11 {
  


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

        
        ArrayList<Integer> negativos = new ArrayList<>();
        ArrayList<Integer> ceros = new ArrayList<>();
        ArrayList<Integer> positivos = new ArrayList<>();

      
        for (int i = 0; i < N; i++) {
            if (A[i] < 0) {
                negativos.add(A[i]);
            } else if (A[i] == 0) {
                ceros.add(A[i]);
            } else {
                positivos.add(A[i]);
            }
        }
    }
}
  

    

