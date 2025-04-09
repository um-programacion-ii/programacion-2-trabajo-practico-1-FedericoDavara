public class VehiculoPrinter {
    public void imprimir(Vehiculo vehiculo) {
        System.out.println("Vehículo: " + vehiculo.getMarca()
                + " | Patente: " + vehiculo.getPatente()
                + " | Año: " + vehiculo.getAnio()
                + " | Carga: " + vehiculo.getCapacidadCargaKg() + " kg");
    }
}