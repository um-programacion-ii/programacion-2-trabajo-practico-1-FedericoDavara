import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Vehiculo("ABC123", "Ford", 2020, 1500));
        vehiculos.add(new Vehiculo("DEF456", "Chevrolet", 2018, 1300));
        vehiculos.add(new Camion("CAM789", "Volvo", 2015, 8000, true));
        vehiculos.add(new Auto("AUT456", "Peugeot", 2021, 500, 5));

        VehiculoPrinter printer = new VehiculoPrinter();

        System.out.println("=== LISTA DE VEHÍCULOS ===");
        for (Vehiculo v : vehiculos) {
            printer.imprimir(v);
        }

        // (Opcional) Buscar por patente dentro de la lista.
        System.out.println("\n🔍 Buscando por patente 'CAM789'...");
        Vehiculo encontrado = buscarPorPatente(vehiculos, "CAM789");
        if (encontrado != null) {
            printer.imprimir(encontrado);
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    }

    public static Vehiculo buscarPorPatente(ArrayList<Vehiculo> lista, String patenteBuscada) {
        for (Vehiculo v : lista) {
            if (v.getPatente().equalsIgnoreCase(patenteBuscada)) {
                return v;
            }
        }
        return null;
    }
}