package Tarea;
import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio13 {
    
    
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
    
            
            double suma = 0;
            for (int i = 0; i < N; i++) {
                suma += A[i];
            }
            double media = suma / N;
    
            
            ArrayList<Integer> mayores = new ArrayList<>();
            ArrayList<Integer> menores = new ArrayList<>();
    
            
            for (int i = 0; i < N; i++) {
                if (A[i] > media) {
                    mayores.add(A[i]);
                } else if (A[i] < media) {
                    menores.add(A[i]);
                }
            }
    
            
            System.out.println("La media del arreglo es: " + media);
    
            System.out.print("Elementos mayores que la media: ");
            for (int num : mayores) {
                System.out.print(num + " ");
            }
            System.out.println();
    
            System.out.print("Elementos menores que la media: ");
            for (int num : menores) {
                System.out.print(num + " ");
            }
            System.out.println();
    
          
        }
    }
    

    

