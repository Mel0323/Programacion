public class Venta {
    Funcion funcion;
    int cantidadEntradas;
    int total;

    public Venta(Funcion funcion, int cantidadEntradas) {
        funcion = funcion;
        cantidadEntradas = cantidadEntradas;
        total = calcularTotal();
    }

    public int calcularTotal() {
        int precioBase = 8000;
        if (funcion.obtenerSala().esSala3D()) {
            precioBase = 10000;
        }
        return cantidadEntradas * precioBase;
    }

    public int obtenerTotal() {
        return total;
    }
}
