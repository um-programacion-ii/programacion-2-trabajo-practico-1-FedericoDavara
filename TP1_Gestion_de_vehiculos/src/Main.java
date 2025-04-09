public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("ABC123", "Ford", 2020, 1500);
        Vehiculo v2 = new Vehiculo("DEF456", "Chevrolet", 2018, 1300);
        Vehiculo v3 = new Vehiculo("GHI789", "Toyota", 2022, 1000);

        VehiculoPrinter printer = new VehiculoPrinter();
        printer.imprimir(v1);
        printer.imprimir(v2);
        printer.imprimir(v3);
    }
}