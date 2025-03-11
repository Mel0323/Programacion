public class Pelicula {
    String nombre;
    String idioma;
    String tipo; // 35mm o 3D
    int duracion; // En minutos

    public Pelicula(String nombre, String idioma, String tipo, int duracion) {
        nombre = nombre;
        idioma = idioma;
        tipo = tipo;
        duracion = duracion;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerIdioma() {
        return idioma;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public int obtenerDuracion() {
        return duracion;
    }
}
