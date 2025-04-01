class Sala {
    private int numeroSala;
    private boolean esSala3D;

    public Sala(int numero, boolean es3D) {
        numeroSala = numero;
        esSala3D = es3D;
    }

    public int obtenerNumero() {
        return numeroSala;
    }

    public boolean verificar3D() {
        return esSala3D;
    }
}
