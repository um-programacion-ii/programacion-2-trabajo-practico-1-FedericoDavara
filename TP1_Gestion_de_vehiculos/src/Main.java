public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("ABC123", "Ford", 2020, 1500);
        Vehiculo v2 = new Vehiculo("DEF456", "Chevrolet", 2018, 1300);
        Vehiculo v3 = new Vehiculo("GHI789", "Toyota", 2022, 1000);

        v1.mostrarInformacion();
        v2.mostrarInformacion();
        v3.mostrarInformacion();
    }
}