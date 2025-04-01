package Tarea;
import java.util.Scanner;
public class Ejercicio6 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de viviendas: ");
        int N = scanner.nextInt();

        double[] alquileres = new double[N];
        double[] porcentajesGanancia = new double[N];
        double[] ganancias = new double[N];

        
        System.out.println("Ingresa los datos de las viviendas:");
        for (int i = 0; i < N; i++) {
            System.out.print("Alquiler mensual de la vivienda " + (i + 1) + ": ");
            alquileres[i] = scanner.nextDouble();

            System.out.print("Porcentaje de ganancia para la vivienda " + (i + 1) + ": ");
            porcentajesGanancia[i] = scanner.nextDouble();

            ganancias[i] = alquileres[i] * (porcentajesGanancia[i] / 100);
        }

       
        System.out.println("\nGanancias por cada vivienda:");
        for (int i = 0; i < N; i++) {
            System.out.println("Vivienda " + (i + 1) + ": " + ganancias[i]);
        }

       
    }
}


