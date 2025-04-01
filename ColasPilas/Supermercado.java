import java.util.ArrayDeque;
import java.util.Queue;

public class Supermercado {

    // Número de carritos disponibles y número de cajas
    private static final int NUM_CARROS = 25;
    private static final int NUM_CAJA = 3;

    public static void main(String[] args) {
        // Cola para los carritos de compra
        Queue<Integer> carritos = new ArrayDeque<>();
        // Inicializamos los carritos de la compra (1 a 25)
        for (int i = 1; i <= NUM_CARROS; i++) {
            carritos.add(i);
        }

        // Inicializamos las colas para las 3 cajas
        Queue<Integer>[] cajas = new Queue[NUM_CAJA];
        for (int i = 0; i < NUM_CAJA; i++) {
            cajas[i] = new ArrayDeque<>();
        }

        // Simulamos la llegada de 10 clientes
        for (int cliente = 1; cliente <= 10; cliente++) {
            System.out.println("Cliente " + cliente + " llega al supermercado.");

            // El cliente intenta tomar un carrito
            Integer carrito = tomarCarrito(carritos);
            if (carrito == null) {
                System.out.println("No hay carritos disponibles. El cliente espera.");
                // Si no hay carrito, el cliente espera hasta que haya uno
                while ((carrito = tomarCarrito(carritos)) == null) {
                    // Simulamos un pequeño tiempo de espera
                    try { Thread.sleep(1000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
                }
                System.out.println("Cliente " + cliente + " tomó el carrito " + carrito);
            }

            // El cliente se coloca en la cola de la caja con menos gente
            int cajaElegida = elegirCaja(cajas);
            cajas[cajaElegida].add(cliente);
            System.out.println("Cliente " + cliente + " se coloca en la caja " + (cajaElegida + 1));

            // Simulamos el tiempo de espera mientras el cliente paga
            try { Thread.sleep(2000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }

            // El cliente paga y el carrito se libera
            liberarCarrito(carrito, carritos);
            System.out.println("Cliente " + cliente + " terminó su compra y liberó el carrito " + carrito);

            // Simulamos la atención de la caja
            atenderCaja(cajaElegida, cajas);
        }

        // Imprimimos el estado final
        System.out.println("\nEstado final de los carritos: " + carritos);
        for (int i = 0; i < NUM_CAJA; i++) {
            System.out.println("Caja " + (i + 1) + " tiene los clientes: " + cajas[i]);
        }
    }

    // Método para tomar un carrito disponible
    public static Integer tomarCarrito(Queue<Integer> carritos) {
        return carritos.poll(); // Si hay carritos disponibles, los retiramos de la cola
    }

    // Método para liberar un carrito
    public static void liberarCarrito(Integer carrito, Queue<Integer> carritos) {
        carritos.add(carrito);  // El carrito se vuelve a poner en la cola
    }

    // Método para elegir la caja con menos clientes
    public static int elegirCaja(Queue<Integer>[] cajas) {
        int cajaElegida = 0;
        int clientesEnCaja = cajas[0].size();  // Iniciamos con la caja 1

        for (int i = 1; i < NUM_CAJA; i++) {
            if (cajas[i].size() < clientesEnCaja) {
                cajaElegida = i;
                clientesEnCaja = cajas[i].size();
            }
        }

        return cajaElegida;
    }

    // Método para simular la atención de una caja (se retira un cliente de la cola de la caja)
    public static void atenderCaja(int caja, Queue<Integer>[] cajas) {
        if (!cajas[caja].isEmpty()) {
            Integer clienteAtendido = cajas[caja].poll();
            System.out.println("Caja " + (caja + 1) + " atiende al cliente " + clienteAtendido);
        }
    }
}
