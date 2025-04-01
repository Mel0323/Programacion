package Tarea;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresa la cantidad de números: ");
        int N = scanner.nextInt();

        // Crear el arreglo para los números
        int[] numeros = new int[N];

        
        System.out.println("Ingresa los números:");
        for (int i = 0; i < N; i++) {
            numeros[i] = scanner.nextInt();
        }

       
        int sumaPares = 0;
        int sumaImpares = 0;

        
        for (int i = 0; i < N; i++) {
            if (numeros[i] % 2 == 0) {
                sumaPares += numeros[i];  
            } else {
                sumaImpares += numeros[i];  
            }
        }

       
        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.println("La suma de los números impares es: " + sumaImpares);

       
        scanner.close();
    }
}

    

