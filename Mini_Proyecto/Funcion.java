public class Funcion {
    Pelicula pelicula;
    Sala sala;
    String horario;

    public Funcion(Pelicula pelicula, Sala sala, String horario) {
        pelicula = pelicula;
        sala = sala;
        horario = horario;
    }

    public Pelicula obtenerPelicula() {
        return pelicula;
    }

    public Sala obtenerSala() {
        return sala;
    }

    public String obtenerHorario() {
        return horario;
    }
}

