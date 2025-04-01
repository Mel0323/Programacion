package Clase3;

public class MetodosArreglos {
    public String nombresSueldos(String[] n, int[] s){
        int suma = 0;
        // calcular promedio
        for (int i = 0; i< s.length; i++) {
            suma += s[i];

        }

        //calcular promedio de los sueldos
        double promedio = suma / s.length;

        String cad = "";
        int contador = 0;
        
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= promedio) {
                cad += n[i] + "\n";
                contador++;

            }
        }

        cad += "Fueron " + contador + " los empleados que tiene sueldo por emcima del promedio: " +promedio;
        
        return cad;
    }
    
}
