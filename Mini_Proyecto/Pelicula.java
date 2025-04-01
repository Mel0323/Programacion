class Pelicula {
    private String nombrePelicula;
    private String idiomaPelicula;
    private String tipoPelicula;
    private int duracionPelicula;

    public Pelicula(String nombre, String idioma, String tipo, int duracion) {
        nombrePelicula = nombre;
        idiomaPelicula = idioma;
        tipoPelicula = tipo;
        duracionPelicula = duracion;
    }

    public String obtenerNombre() {
        return nombrePelicula;
    }

    public String obtenerIdioma() {
        return idiomaPelicula;
    }

    public String obtenerTipo() {
        return tipoPelicula;
    }

    public int obtenerDuracion() {
        return duracionPelicula;
    }
}
