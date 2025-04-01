class Funcion {
    private Pelicula peliculaFuncion;
    private Sala salaFuncion;
    private String horarioFuncion;
    private boolean[][] asientosReservados;  // Usaremos una matriz booleana para los asientos

    public Funcion(Pelicula pelicula, Sala sala, String horario) {
        peliculaFuncion = pelicula;
        salaFuncion = sala;
        horarioFuncion = horario;
        // Inicializar la matriz de asientos (6 filas x 12 columnas para 35mm, 8 filas x 9 columnas para 3D)
        asientosReservados = salaFuncion.verificar3D() ? new boolean[8][9] : new boolean[6][12];
    }

    public Pelicula obtenerPelicula() { return peliculaFuncion; }
    public Sala obtenerSala() { return salaFuncion; }
    public String obtenerHorario() { return horarioFuncion; }

    // Mostrar asientos disponibles (Ocupados marcados con X)
    public void mostrarAsientos() {
        char[] filas = salaFuncion.verificar3D() ? new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'} : new char[]{'A', 'B', 'C', 'D', 'E', 'F'};
        int asientosPorFila = salaFuncion.verificar3D() ? 9 : 12;

        System.out.println("Sillas disponibles (Ocupadas marcadas con X):");
        for (int i = 0; i < filas.length; i++) {
            for (int j = 0; j < asientosPorFila; j++) {
                System.out.print(asientosReservados[i][j] ? "[X] " : "[ ] ");
            }
            System.out.println(" " + filas[i]);
        }
    }

    // Verificar disponibilidad de un asiento
    public boolean revisarDisponibilidad(String asiento) {
        char fila = asiento.charAt(0);
        int filaIndex = fila - 'A';
        int asientoNum = Integer.parseInt(asiento.substring(1)) - 1;
        return !asientosReservados[filaIndex][asientoNum];
    }

    // Marcar los asientos como ocupados
    public void ocuparAsientos(String[] asientos) {
        for (String asiento : asientos) {
            char fila = asiento.charAt(0);
            int filaIndex = fila - 'A';
            int asientoNum = Integer.parseInt(asiento.substring(1)) - 1;
            asientosReservados[filaIndex][asientoNum] = true;
        }
    }
}
