import java.util.Stack;

public class SecuenciaPila {

    public static void main(String[] args) {
        // Crear un array de 10 números reales (double)
        double[] secuencia = new double[10];
        
        // Llenar el array con 10 números reales
        for (int i = 0; i < secuencia.length; i++) {
            secuencia[i] = Math.random() * 100;  // Generar números aleatorios entre 0 y 100
        }

        // Crear una pila para almacenar los números reales
        Stack<Double> pila = new Stack<>();
        
        // Insertar los números en la pila
        for (double num : secuencia) {
            pila.push(num);
        }

        // Imprimir la secuencia original
        System.out.println("Secuencia original:");
        for (double num : secuencia) {
            System.out.print(num + " ");
        }
        System.out.println();  // Salto de línea

        // Imprimir los elementos de la pila extrayéndolos
        System.out.println("\nElementos de la pila extraídos:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());  // Extraer y mostrar cada elemento de la pila
        }
    }
}

