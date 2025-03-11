public class Sala {
    int numero;
    char[] filasGenerales = {'A', 'B', 'C', 'D', 'E', 'F'};
    char[] filasPreferenciales = {'G', 'H'};
    int asientosPorFilaGeneral = 12;
    int asientosPorFilaPreferencial = 9;
    boolean[][] asientos;
    boolean es3D;

    public Sala(int numero, boolean es3D) {
        numero = numero;
        es3D = es3D;
        asientos = new boolean[8][12]; // 6 filas generales + 2 preferenciales
    }

    public int obtenerNumero() {
        return numero;
    }

    public boolean esSala3D() {
        return es3D;
    }

    public boolean verificarDisponibilidad(int fila, int columna) {
        return !asientos[fila][columna];
    }

    public void ocuparAsiento(int fila, int columna) {
        asientos[fila][columna] = true;
    }
}
