package SolicitarCarnet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author coman
 */
interface Observador {
    void actualizar(String mensaje);
}

class SistemaNotificaciones implements Observador {
    @Override
    public void actualizar(String mensaje) {
        System.out.println("Notificacion enviada: " + mensaje);
    }
}

class SistemaDeSolicitud {
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void notificarObservadores(String mensaje) {
        for (Observador obs : observadores) {
            obs.actualizar(mensaje);
        }
    }

    public void completarSolicitud(SolicitudCarnet solicitud, String nombre, String cedula, String facultad) {
        solicitud.procesarSolicitud(nombre, cedula, facultad);
        notificarObservadores("Solicitud completada para: " + nombre);
    }
}

