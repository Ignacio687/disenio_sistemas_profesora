package Vehiculo;

public class MP3 {
    private String marca;
    private int capacidad;

    public MP3() {
    }

    public MP3(String marca, int capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
