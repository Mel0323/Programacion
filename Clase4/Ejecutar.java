package Clase4;

import Clase4.Ejerciciomatriz.Ejercicio20;

public class Ejecutar {
    public static void main(String[] args) {
 
        Ejerciciomatriz objMatriz = new Ejerciciomatriz();
 
        int[][] m = objMatriz.llenarMatriz(10, 10);
 
        System.out.println(objMatriz.mostrarMatriz(m));
 
        objMatriz.diagonalCerosMatriz(m);
 
        System.out.println(objMatriz.mostrarMatriz(m));
 
 
 
    }
}
 
    

