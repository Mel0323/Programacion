import java.util.Stack;

public class Pilas9_2 {  
    public static void main(String[] args) {
        // Crear una pila de cadenas de caracteres
        Stack<String> pila = new Stack<>();

        // Insertar elementos en la pila
        pila.push("Pedro");
        pila.push("Juan");
        pila.push("Maria");
        pila.push("Camila");
        pila.push("Daniel");

        // Mostrar los elementos de la pila
        System.out.println("Elementos de la pila:");
        mostrarPila(pila);

        // Al final, la pila estará restaurada a su estado original
        System.out.println("\nPila restaurada:");
        System.out.println(pila);
    }

    // Método para mostrar los elementos de la pila utilizando sólo las operaciones básicas y una pila auxiliar
    public static void mostrarPila(Stack<String> pila) {
        Stack<String> auxiliar = new Stack<>();  // Pila auxiliar para almacenar los elementos temporalmente

        // Mostrar los elementos de la pila
        while (!pila.empty()) {
            String elemento = pila.pop();  // Quitamos un elemento de la pila original
            System.out.println(elemento);  // Lo mostramos
            auxiliar.push(elemento);  // Lo insertamos en la pila auxiliar
        }

        // Restauramos los elementos a la pila original
        while (!auxiliar.empty()) {
            pila.push(auxiliar.pop());  // Quitamos los elementos de la pila auxiliar y los insertamos en la pila original
        }
    }
}
