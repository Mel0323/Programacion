import java.util.ArrayDeque;
import java.util.Queue;

public class ColaIdentica {

    // Método para verificar si dos colas son idénticas sin modificarlas
    public static <T> boolean sonIdenticas(Queue<T> cola1, Queue<T> cola2) {
        // Verificar si ambas colas tienen el mismo tamaño
        if (cola1.size() != cola2.size()) {
            return false;
        }

        // Crear iteradores para ambas colas
        Queue<T> copiaCola1 = new ArrayDeque<>(cola1);
        Queue<T> copiaCola2 = new ArrayDeque<>(cola2);

        // Comparar los elementos de las dos colas
        while (!copiaCola1.isEmpty() && !copiaCola2.isEmpty()) {
            if (!copiaCola1.poll().equals(copiaCola2.poll())) {
                return false;
            }
        }

        // Si ambas colas son idénticas, llegaremos aquí
        return true;
    }

    public static void main(String[] args) {
        // Crear dos colas de ejemplo usando ArrayDeque
        Queue<Integer> cola1 = new ArrayDeque<>();
        Queue<Integer> cola2 = new ArrayDeque<>();

        // Llenar las colas con valores
        cola1.add(1);
        cola1.add(2);
        cola1.add(3);
        cola1.add(4);

        cola2.add(1);
        cola2.add(2);
        cola2.add(3);
        cola2.add(4);

        // Mostrar las colas y verificar si son idénticas
        System.out.println("Contenido de la cola 1: " + cola1);
        System.out.println("Contenido de la cola 2: " + cola2);
        boolean resultado = sonIdenticas(cola1, cola2);
        System.out.println("¿Las colas son idénticas? " + resultado);

    }
}

