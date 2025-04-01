class Venta {
    private Funcion funcionVenta;
    private String[] listaSillasVendidas;
    private int montoTotalVenta;

    public Venta(Funcion funcion, String[] sillas) {
        funcionVenta = funcion;
        listaSillasVendidas = sillas;
        montoTotalVenta = 0;
        calcularMonto();
        funcionVenta.ocuparAsientos(sillas);
    }

    // Calcular monto basado en el tipo de asiento y si la función es 3D
    private void calcularMonto() {
        int costoGeneral = 8000;
        int costoPreferencial = 12000;
        int costo3D = 10000;

        for (String asiento : listaSillasVendidas) {
            char fila = asiento.charAt(0);
            int asientoPrecio = (funcionVenta.obtenerSala().verificar3D() ? costo3D : costoGeneral);
            if (fila == 'G' || fila == 'H') {
                montoTotalVenta += costoPreferencial;
            } else {
                montoTotalVenta += asientoPrecio;
            }
        }
    }

    public int obtenerMonto() {
        return montoTotalVenta;
    }
}
