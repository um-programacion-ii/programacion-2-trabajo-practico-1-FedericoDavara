public class Vehiculo {
    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg) {
        if (patente == null || patente.isEmpty())
            throw new IllegalArgumentException("La patente no puede ser nula ni vacía.");
        if (anio < 1900 || anio > java.time.Year.now().getValue())
            throw new IllegalArgumentException("El año debe estar entre 1900 y el actual.");
        if (capacidadCargaKg <= 0)
            throw new IllegalArgumentException("La capacidad de carga debe ser positiva.");

        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public String getPatente() { return patente; }
    public String getMarca() { return marca; }
    public int getAnio() { return anio; }
    public double getCapacidadCargaKg() { return capacidadCargaKg; }

    public void setPatente(String patente) {
        if (patente == null || patente.isEmpty())
            throw new IllegalArgumentException("La patente no puede ser nula ni vacía.");
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        if (anio < 1900 || anio > java.time.Year.now().getValue())
            throw new IllegalArgumentException("El año debe estar entre 1900 y el actual.");
        this.anio = anio;
    }

    public void setCapacidadCargaKg(double capacidadCargaKg) {
        if (capacidadCargaKg <= 0)
            throw new IllegalArgumentException("La capacidad de carga debe ser positiva.");
        this.capacidadCargaKg = capacidadCargaKg;
    }
}