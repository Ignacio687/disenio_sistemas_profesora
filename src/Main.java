import Persona.Persona;
import Persona.Domicilio;
import Equipos.*;

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
        }
    }