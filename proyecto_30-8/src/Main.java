import observer2.*;

public class Main {
    public static void main(String[] args) {
        AlarmaLibro alarma = new AlarmaLibro();
        Administracion admin = new Administracion();
        Stock st = new Stock();
        Compras comp = new Compras();
        alarma.attach(admin);
        alarma.attach(st);
        alarma.attach(comp);
        Libro li1 = new Libro();
        li1.setEstado("MALO");
        Biblioteca bl1 = new Biblioteca();
        bl1.devuelveLibro(li1);

    }
}