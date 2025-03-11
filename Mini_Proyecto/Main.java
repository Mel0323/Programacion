import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cine cine = new Cine();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menú del Cine ---");
            System.out.println("1. Agregar Película");
            System.out.println("2. Asignar Función");
            System.out.println("3. Mostrar Funciones");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            if (opcion == 1) {
                System.out.print("Nombre de la película: ");
                String nombre = scanner.nextLine();
                System.out.print("Idioma: ");
                String idioma = scanner.nextLine();
                System.out.print("Tipo (35mm o 3D): ");
                String tipo = scanner.nextLine();
                System.out.print("Duración en minutos: ");
                int duracion = scanner.nextInt();
                
                cine.agregarPelicula(nombre, idioma, tipo, duracion);
                System.out.println("Película agregada exitosamente.");

            } else if (opcion == 2) {
                if (cine.peliculas.size() == 0) {
                    System.out.println("No hay películas disponibles.");
                    continue;
                }

                System.out.println("Lista de películas disponibles:");
                for (int i = 0; i < cine.peliculas.size(); i++) {
                    System.out.println(i + ". " + cine.peliculas.get(i).obtenerNombre());
                }

                System.out.print("Seleccione el índice de la película: ");
                int indice = scanner.nextInt();
                System.out.print("Número de sala (1, 2, 3...): ");
                int numeroSala = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                System.out.print("Horario (ejemplo: 18:00): ");
                String horario = scanner.nextLine();
                
                cine.asignarFuncion(indice, numeroSala, horario);
                System.out.println("Función asignada exitosamente.");

            } else if (opcion == 3) {
                System.out.println("\n--- Funciones Programadas ---");
                for (int i = 0; i < cine.funciones.size(); i++) {
                    Funcion funcion = cine.funciones.get(i);
                    System.out.println((i + 1) + ". " + funcion.obtenerPelicula().obtenerNombre() + " | Sala " + 
                                        funcion.obtenerSala().obtenerNumero() + " | " + funcion.obtenerHorario());
                }

            } else if (opcion == 4) {
                System.out.println("Saliendo del sistema...");
                break;

            } else {
                System.out.println("Opción inválida, intente nuevamente.");
            }
        }
        scanner.close();
    }
}
