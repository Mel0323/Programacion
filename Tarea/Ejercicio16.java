package Tarea;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de profesores: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        String[] nombres = new String[N];
        int[] edades = new int[N];
        String[] sexos = new String[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Profesor " + (i + 1));
            System.out.print("Nombre: ");
            nombres[i] = scanner.nextLine();
            System.out.print("Edad: ");
            edades[i] = scanner.nextInt();
            System.out.print("Sexo (M/F): ");
            sexos[i] = scanner.next().toUpperCase();
            scanner.nextLine();
        }

        int sumaEdades = 0;
        for (int i = 0; i < N; i++) {
            sumaEdades += edades[i];
        }
        double edadPromedio = (double) sumaEdades / N;

        String profesorMasJoven = nombres[0];
        int edadMasJoven = edades[0];
        String profesorMasViejo = nombres[0];
        int edadMasViejo = edades[0];

        for (int i = 1; i < N; i++) {
            if (edades[i] < edadMasJoven) {
                profesorMasJoven = nombres[i];
                edadMasJoven = edades[i];
            }
            if (edades[i] > edadMasViejo) {
                profesorMasViejo = nombres[i];
                edadMasViejo = edades[i];
            }
        }

        int numProfesoraMayorPromedio = 0;
        int numProfesorMenorPromedio = 0;

        for (int i = 0; i < N; i++) {
            if (sexos[i].equals("F") && edades[i] > edadPromedio) {
                numProfesoraMayorPromedio++;
            }
            if (sexos[i].equals("M") && edades[i] < edadPromedio) {
                numProfesorMenorPromedio++;
            }
        }

        System.out.println("Edad promedio de los profesores: " + edadPromedio);
        System.out.println("Profesor más joven: " + profesorMasJoven);
        System.out.println("Profesor con mayor edad: " + profesorMasViejo);
        System.out.println("Número de profesoras con edad mayor al promedio: " + numProfesoraMayorPromedio);
        System.out.println("Número de profesores con edad menor al promedio: " + numProfesorMenorPromedio);

    
    }
}