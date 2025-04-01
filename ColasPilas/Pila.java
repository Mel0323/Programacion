public class Pila {

    private int[] pila;
    private int tope;

    // Constructor de la pila
    public Pila() {
        pila = new int[10];  // Pila con capacidad para 10 elementos
        tope = -1;  // Inicializamos el tope a -1 para indicar que la pila está vacía
    }

    // Método para insertar un elemento en la pila
    public void insertar(int x) {
        if (tope < pila.length - 1) {
            pila[++tope] = x;
        } else {
            System.out.println("Pila llena");
        }
    }

    // Método para quitar el elemento de la cima de la pila
    public int quitar() {
        if (tope >= 0) {
            return pila[tope--];
        } else {
            System.out.println("Pila vacía");
            return -1;  // Valor indicativo de que la pila está vacía
        }
    }

    // Método para obtener el elemento en la cima de la pila sin quitarlo
    public int cimaPila() {
        if (tope >= 0) {
            return pila[tope];
        } else {
            System.out.println("Pila vacía");
            return -1;  // Valor indicativo de que la pila está vacía
        }
    }

    // Método para verificar si la pila está vacía
    public boolean pilaVacia() {
        return tope == -1;
    }

    public static void main(String[] args) {
        Pila p = new Pila();  // Crear una nueva pila
        int x = 4, y;

        // Insertar un valor en la pila
        p.insertar(x);

        // Mostrar la cima de la pila
        System.out.println("\nCima de la pila: " + p.cimaPila());

        // Quitar un elemento de la pila
        y = p.quitar();

        // Insertar más elementos en la pila
        p.insertar(32);
        p.insertar(p.quitar());  // Se quita el elemento y se vuelve a insertar

        // Extraer elementos de la pila y mostrarlos
        do {
            System.out.println("\nElemento extraído: " + p.quitar());
        } while (!p.pilaVacia());  // Continuar hasta que la pila esté vacía
    }
}

