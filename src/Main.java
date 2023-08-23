import Persona.Persona;
import Persona.Domicilio;
import Equipos.*;
import Vehiculo.*;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe", "Honguito", 1234);
        System.out.println("La persona se llama "+p1.getNombre()+" "+p1.getApellido());
        System.out.printf("Su dni es "+p1.getDni());
        p1.caminar();

        Persona p2 = new Persona("Paula", "Sanchez", 4567);

        Persona p3 = new Persona();
        p3.setNombre("Roxana");
        p3.setApellido("Perez");
        p3.setDni(7285);

        Domicilio d1 = new Domicilio("Huarpes", 123);

        p1.setmDomicilio(d1);
        System.out.println(p1.getNombre()+" "+p1.getApellido()+" Vive en "+p1.getmDomicilio().getCalle()+" "+p1.getmDomicilio().getNumero());
        d1.setmPersona(p1);
        System.out.println(d1.getCalle()+" "+d1.getNumero()+" es el domicilio de  "+d1.getmPersona().getNombre()+" "+d1.getmPersona().getApellido());
        Computadora compu1 = new Computadora("HP", 220, "gris", "AMD", "Ryzen");
        Impresora impre1 = new Impresora("recargable", "Epson");
        compu1.agregarImpresora(impre1);
        System.out.println("La compu es "+compu1.getMarca()+" "+compu1.getColor()+" "+compu1.getPrecio()+" y tiene una impresora "+compu1.getImpre().getMarca()+" "+compu1.getImpre().getCartucho());

        Auto auto1 = new Auto("Tesla", 20);
        MP3 mp3_1 = new MP3("Sony", 5);
        Garage garage1 = new Garage("Colon", 1277);
        auto1.setGarage(garage1);
        auto1.agregarMP3(mp3_1);
        System.out.println("El auto marca "+auto1.getMarca()+" esta en el garage de "+auto1.getGarage().getCalle()+" "+auto1.getGarage().getNumero()+" Tiene ruedas de medida "+auto1.getRueda().getMedida()+" y un MP3 "+auto1.getMp3().getMarca()+" con capacidad "+auto1.getMp3().getCapacidad());
        }
    }