public class Vehiculo {
    private String patente;
    private String marca;
    private int anio;
    private float capacidadCargaKg;

    public Vehiculo(String patente, String marca, int anio, float capacidadCargaKg) {
        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public float getCapacidadCargaKg() {
        return capacidadCargaKg;
    }
    public void setCapacidadCargaKg(float capacidadCargaKg) {
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public void mostrarInformacion() {
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + anio);
        System.out.println("Capacidad de Carga (Kg): " + capacidadCargaKg);
    }

}
