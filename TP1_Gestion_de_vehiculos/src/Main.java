public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("ABC123", "Ford", 2020, 1500);
        Vehiculo v2 = new Vehiculo("DEF456", "Chevrolet", 2018, 1300);
        Camion camion = new Camion("CAM789", "Volvo", 2015, 8000, true);

        VehiculoPrinter printer = new VehiculoPrinter();
        printer.imprimir(v1);
        printer.imprimir(v2);
        printer.imprimir(camion);
    }
}