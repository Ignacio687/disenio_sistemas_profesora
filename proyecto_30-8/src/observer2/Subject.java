package observer2;

public interface Subject {
    void attach(ILibroMalEstado observador);
    void detach(ILibroMalEstado observador);
    void notifyObservers();
}
