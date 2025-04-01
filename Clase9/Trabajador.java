public class Trabajador {
    // Atributos de la clase
    String cedula;
    String nombre;
    double salario;

    // Constructor de la clase
    public Trabajador(String cedula, String nombre, double salario) {
        cedula = cedula;
        nombre = nombre;
        salario = salario;
    }

    // Método para obtener el salario (pagar)
    public double pagar() {
        return salario;
    }

    // Método para mostrar los detalles del trabajador
    public void mostrarDatos() {
        System.out.println("Datos del trabajador:");
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}
