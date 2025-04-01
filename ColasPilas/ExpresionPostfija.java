import java.util.Stack;

public class ExpresionPostfija {
    
    public static void main(String[] args) {
        String infija = "(x - y) / (z + w) - (z + y) ^ x";
        String postfija = convertirPostfija(infija);
        System.out.println("Expresión Postfija: " + postfija);
    }

    // Método para convertir una expresión infija a postfija
    public static String convertirPostfija(String infija) {
        Stack<Character> pila = new Stack<>();  // Pila para los operadores
        StringBuilder postfija = new StringBuilder();  // Resultado en notación postfija
        
        // Iterar a través de cada caracter en la expresión infija
        for (int i = 0; i < infija.length(); i++) {
            char caracter = infija.charAt(i);
            
            // Si el carácter es un operando, agregarlo directamente a la salida
            if (Character.isLetterOrDigit(caracter)) {
                postfija.append(caracter);
            }
            // Si el carácter es un paréntesis de apertura
            else if (caracter == '(') {
                pila.push(caracter);
            }
            // Si el carácter es un paréntesis de cierre
            else if (caracter == ')') {
                // Extraer operadores hasta encontrar el paréntesis de apertura
                while (!pila.isEmpty() && pila.peek() != '(') {
                    postfija.append(pila.pop());
                }
                pila.pop();  // Eliminar el paréntesis de apertura
            }
            // Si el carácter es un operador
            else if (esOperador(caracter)) {
                // Mientras el operador en la pila tiene mayor o igual precedencia
                // y no es un paréntesis de apertura
                while (!pila.isEmpty() && precedencia(caracter) <= precedencia(pila.peek()) && pila.peek() != '(') {
                    postfija.append(pila.pop());
                }
                pila.push(caracter);
            }
        }

        // Vaciar la pila, agregando los operadores restantes a la salida
        while (!pila.isEmpty()) {
            postfija.append(pila.pop());
        }

        return postfija.toString();
    }

    // Método para determinar si un carácter es un operador
    public static boolean esOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Método para obtener la precedencia de los operadores
    public static int precedencia(char operador) {
        if (operador == '^') return 3;  // Mayor precedencia
        if (operador == '*' || operador == '/') return 2;
        if (operador == '+' || operador == '-') return 1;
        return -1;  // No es un operador
    }
}
