import java.util.*;

class Asiento {
    private String identificador;
    private boolean disponible;

    public Asiento(String identificador) {
        this.identificador = identificador;
        disponible = true;
    }

    public String obtenerIdentificador() {
        return identificador;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void ocupar() {
        disponible = false;
    }
}