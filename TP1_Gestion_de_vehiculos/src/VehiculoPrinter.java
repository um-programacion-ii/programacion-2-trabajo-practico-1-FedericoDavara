public class VehiculoPrinter {
    public void imprimir(Vehiculo vehiculo) {
        System.out.print("Vehículo: " + vehiculo.getMarca()
                + " | Patente: " + vehiculo.getPatente()
                + " | Año: " + vehiculo.getAnio()
                + " | Carga: " + vehiculo.getCapacidadCargaKg() + " kg");

        if (vehiculo instanceof Camion) {
            Camion camion = (Camion) vehiculo;
            System.out.print(" | Acoplado: " + (camion.isTieneAcoplado() ? "Sí" : "No"));
        }

        System.out.println();
    }
}