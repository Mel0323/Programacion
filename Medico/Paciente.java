package Medico;

public class Paciente {
    String nombre;
    String categoria;
    double cedula;
    double radiografias;
    double consulta = 10000;
    double vradiografia = 15000;
    double costoc;
    double costor;
    double costod;

    // Método para asignar los valores
    public void setDatos(String nombre, String categoria, double cedula, double radiografias) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.cedula = cedula;
        this.radiografias = radiografias;
    }

    // Método para calcular el costo para la categoría cardiovascular
    public void calcularCosto() {
        // Verificamos la categoría y calculamos el costo correspondiente
        if (categoria.equalsIgnoreCase("c")) {
            costoc = (vradiografia * radiografias) + consulta;
        } else if (categoria.equalsIgnoreCase("r")) {
            costor = (vradiografia * radiografias) + consulta;
        } else if (categoria.equalsIgnoreCase("d")) {
            costod = (vradiografia * radiografias) + consulta;
        }
    }

    // Métodos para obtener los costos calculados
    public double getCostoc() {
        return costoc;
    }

    public double getCostor() {
        return costor;
    }

    public double getCostod() {
        return costod;
    }
}
