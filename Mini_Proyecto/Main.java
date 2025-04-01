import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pelicula[] listaPeliculas = new Pelicula[10];  // Arreglo de películas (capacidad máxima 10)
        Funcion[] listaFunciones = new Funcion[10];    // Arreglo de funciones (capacidad máxima 10)
        int peliculaCount = 0;
        int funcionCount = 0;

        int opcion;

        do {
            System.out.println("\n*** MENU ***");
            System.out.println("1. Agregar película");
            System.out.println("2. Asignar función");
            System.out.println("3. Ver funciones");
            System.out.println("4. Comprar boletos");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Agregar película
                    if (peliculaCount < listaPeliculas.length) {
                        System.out.print("Ingrese el nombre de la película: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el idioma: ");
                        String idioma = scanner.nextLine();
                        System.out.print("Ingrese el tipo (35mm o 3D): ");
                        String tipo = scanner.nextLine();
                        System.out.print("Ingrese la duración en minutos: ");
                        int duracion = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer

                        listaPeliculas[peliculaCount++] = new Pelicula(nombre, idioma, tipo, duracion);
                        System.out.println("Película agregada con éxito.");
                    } else {
                        System.out.println("No se pueden agregar más películas.");
                    }
                    break;

                case 2:
                    // Asignar función
                    if (peliculaCount == 0) {
                        System.out.println("No hay películas disponibles.");
                        break;
                    }

                    System.out.println("Seleccione una película para asignar una función:");
                    for (int i = 0; i < peliculaCount; i++) {
                        System.out.println((i + 1) + ". " + listaPeliculas[i].obtenerNombre());
                    }
                    int peliculaIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Limpiar el buffer
                    Pelicula peliculaSeleccionada = listaPeliculas[peliculaIndex];

                    System.out.println("Seleccione un horario:");
                    String[] horarios = {"14:00 - 16:30", "16:30 - 19:00", "19:00 - 21:00"};
                    for (int i = 0; i < horarios.length; i++) {
                        System.out.println((i + 1) + ". " + horarios[i]);
                    }
                    int horarioIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Limpiar el buffer
                    String horarioSeleccionado = horarios[horarioIndex];

                    Sala sala = new Sala(1, peliculaSeleccionada.obtenerTipo().equals("3D"));
                    listaFunciones[funcionCount++] = new Funcion(peliculaSeleccionada, sala, horarioSeleccionado);
                    System.out.println("Función asignada con éxito.");
                    break;

                case 3:
                    // Ver funciones
                    if (funcionCount == 0) {
                        System.out.println("No hay funciones disponibles.");
                        break;
                    }

                    System.out.println("Funciones disponibles:");
                    for (int i = 0; i < funcionCount; i++) {
                        Funcion funcion = listaFunciones[i];
                        System.out.println((i + 1) + ". " + funcion.obtenerPelicula().obtenerNombre() +
                                " - Sala " + funcion.obtenerSala().obtenerNumero() +
                                " - Horario: " + funcion.obtenerHorario());
                    }
                    break;

                case 4:
                    // Comprar boletos
                    if (funcionCount == 0) {
                        System.out.println("No hay funciones disponibles para comprar boletos.");
                        break;
                    }

                    System.out.println("Seleccione una función para comprar boletos:");
                    for (int i = 0; i < funcionCount; i++) {
                        Funcion funcion = listaFunciones[i];
                        System.out.println((i + 1) + ". " + funcion.obtenerPelicula().obtenerNombre() +
                                " - Sala " + funcion.obtenerSala().obtenerNumero() +
                                " - Horario: " + funcion.obtenerHorario());
                    }
                    int funcionIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Limpiar el buffer
                    Funcion funcionSeleccionada = listaFunciones[funcionIndex];

                    funcionSeleccionada.mostrarAsientos();
                    System.out.print("Ingrese los asientos que desea comprar (Ej: A1,B3): ");
                    String asientosInput = scanner.nextLine();
                    String[] asientosArray = asientosInput.split(",");

                    Venta venta = new Venta(funcionSeleccionada, asientosArray);
                    System.out.println("Monto total de la venta: $" + venta.obtenerMonto());
                    break;

                case 5:
                    System.out.println("¡Gracias por usar el sistema de cine!");
                    break;

                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
                    break;
            }

        } while (opcion != 5); // El programa continúa hasta que el usuario elige salir

        scanner.close(); // Cerramos el scanner al final
    }
}
