package Tarea;
import java.util.Scanner;
public class Ejercicio {
    
    public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
    
           
            System.out.print("Ingresa la cantidad de números a sumar: ");
            int N = scanner.nextInt();
    
           
            double suma = 0;
    
           
            for (int i = 1; i <= N; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                double numero = scanner.nextDouble();
                suma += numero; // Sumar el número al total
            }
    
          
            System.out.println("La suma de los " + N + " números es: " + suma);
    
           
        }
    }
    

