package Tarea;

public class Ejercicio15 {
    public String Ejercicio15(String[] n, int[] s) {
        int suma = 0;
        for (int i = 0; i < s.length; i++) {
            suma += s[i];
        }
        double promedio = (double) suma / s.length; // Cast suma to double for precise division
        String cad = ""; // Use String instead of string
        int contador = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= promedio) { // Fix the syntax error (>= instead of > =)
                cad += n[i] + "\n"; // Use n[i] instead of n [i]
                contador++; // Fix the typo (contador++ instead of cont ++)
            }
        }
        cad += "fueron " + contador + " los emp.";
        return cad; // Return the string result
    }
public static void main(String[] args) {
    Ejercicio15 ejercicio = new Ejercicio15();
    String[] n = {"Ana", "Luis", "Pedro", "María", "Jorge"};
    int[] s = {5, 3, 4, 2, 6};
    String resultado = ejercicio.Ejercicio15(n, s);
    System.out.println(resultado);
}
}

    

