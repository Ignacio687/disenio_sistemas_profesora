package Persona;

public class Domicilio {
    private String calle;
    private int numero;
    private Persona mPersona;

    public Domicilio() {
    }

    public Domicilio(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public Persona getmPersona() {
        return mPersona;
    }

    public void setmPersona(Persona mPersona) {
        this.mPersona = mPersona;
    }

    public void setNumero(int numero) {
        this.numero = numero;

    }
}
