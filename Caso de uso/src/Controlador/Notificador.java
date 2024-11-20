package controlador;

import java.util.ArrayList;
import java.util.List;

public class Notificador {
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void notificar(String mensaje) {
        for (Observador observador : observadores) {
            observador.actualizar(mensaje);
        }
    }
}
