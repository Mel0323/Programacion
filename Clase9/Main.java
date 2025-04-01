import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir los datos al usuario
        System.out.print("Introduce la cédula del trabajador: ");
        String cedula = scanner.nextLine();

        System.out.print("Introduce el nombre del trabajador: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce el salario del trabajador: ");
        double salario = scanner.nextDouble();

        // Crear un objeto Trabajador
        Trabajador trabajador = new Trabajador(cedula, nombre, salario);

        // Mostrar los datos del trabajador
        trabajador.mostrarDatos();

        // Mostrar el monto a pagar
        System.out.println("El monto a pagar es: " + trabajador.pagar());

        scanner.close();
    }
}
