package Tarea;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer las entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de empleados (N)
        System.out.print("Ingresa la cantidad de empleados: ");
        int N = scanner.nextInt();

       
        double[] sueldos = new double[N];
        double[] asignaciones = new double[N];
        double[] deducciones = new double[N];
        double[] netoPagar = new double[N];

       
        for (int i = 0; i < N; i++) {
            System.out.println("Empleado " + (i + 1) + ":");

            System.out.print("Ingrese el sueldo: ");
            sueldos[i] = scanner.nextDouble();

            System.out.print("Ingrese las asignaciones: ");
            asignaciones[i] = scanner.nextDouble();

            System.out.print("Ingrese las deducciones: ");
            deducciones[i] = scanner.nextDouble();

            // Calcular el neto a pagar y almacenarlo en el arreglo netoPagar
            netoPagar[i] = sueldos[i] + asignaciones[i] - deducciones[i];
        }

            System.out.println("\nNeto a pagar a cada empleado:");
            for (int i = 0; i < N; i++) {
                System.out.println("Empleado " + (i + 1) + ": " + netoPagar[i]);
        }

        
    }
}

