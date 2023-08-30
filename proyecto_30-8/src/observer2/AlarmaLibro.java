package observer2;

import java.util.ArrayList;

public class AlarmaLibro implements Subject{
    private static ArrayList<ILibroMalEstado> observadores = new ArrayList<>();
    @Override
    public void notifyObservers() {
        for (ILibroMalEstado observador: observadores){
            observador.update();
        }
    }

    @Override
    public void attach(ILibroMalEstado observador) {
        observadores.add(observador);
    }

    @Override
    public void detach(ILibroMalEstado observador) {
    observadores.remove(observador);
    }
}
