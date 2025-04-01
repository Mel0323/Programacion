package Tarea;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio12 {
    
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

       
        System.out.print("Ingresa el valor X a buscar: ");
        int X = scanner.nextInt();

        
        ArrayList<Integer> posiciones = new ArrayList<>();

                for (int i = 0; i < N; i++) {
            if (A[i] == X) {
                posiciones.add(i);       
            }
        }

        
        if (posiciones.isEmpty()) {
            System.out.println("El valor " + X + " no se encuentra en el arreglo.");
        } else {
            System.out.print("El valor " + X + " se encuentra en las posiciones: ");
            for (int i = 0; i < posiciones.size(); i++) {
                System.out.print(posiciones.get(i));
                if (i < posiciones.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        
    }
}


    

