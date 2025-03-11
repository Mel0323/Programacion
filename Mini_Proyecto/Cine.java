import java.util.ArrayList;
import java.util.Scanner;

public class Cine {
    ArrayList<Pelicula> peliculas = new ArrayList<>();
    ArrayList<Sala> salas = new ArrayList<>();
    ArrayList<Funcion> funciones = new ArrayList<>();

    public Cine() {
        salas.add(new Sala(1, false));
        salas.add(new Sala(2, false));
        salas.add(new Sala(3, true));
    }

    public void agregarPelicula(String nombre, String idioma, String tipo, int duracion) {
        peliculas.add(new Pelicula(nombre, idioma, tipo, duracion));
    }

    public void asignarFuncion(int indicePelicula, int numeroSala, String horario) {
        funciones.add(new Funcion(peliculas.get(indicePelicula), salas.get(numeroSala - 1), horario));
    }

    public static void main(String[] args) {
        Cine cine = new Cine();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de gestión de Cine");
        System.out.println("1. Agregar Película");
        System.out.println("2. Asignar Función");
        System.out.println("3. Salir");

        int opcion = scanner.nextInt();
        while (opcion != 3) {
            if (opcion == 1) {
                System.out.print("Nombre de la película: ");
                String nombre = scanner.next();
                System.out.print("Idioma: ");
                String idioma = scanner.next();
                System.out.print("Tipo (35mm o 3D): ");
                String tipo = scanner.next();
                System.out.print("Duración en minutos: ");
                int duracion = scanner.nextInt();
                cine.agregarPelicula(nombre, idioma, tipo, duracion);
            } else if (opcion == 2) {
                System.out.print("Índice de película: ");
                int indice = scanner.nextInt();
                System.out.print("Número de sala: ");
                int sala = scanner.nextInt();
                System.out.print("Horario: ");
                String horario = scanner.next();
                cine.asignarFuncion(indice, sala, horario);
            }
            System.out.println("1. Agregar Película");
            System.out.println("2. Asignar Función");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
        }
        scanner.close();
    }
}
