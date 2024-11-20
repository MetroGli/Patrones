package SolicitarCarnet;

/**
 *
 * @author coman
 */
abstract class SolicitudCarnetDecorator extends SolicitudCarnet {
    protected SolicitudCarnet solicitud;

    public SolicitudCarnetDecorator(SolicitudCarnet solicitud) {
        this.solicitud = solicitud;
    }

    @Override
    protected void verificarDocumentos(String nombre, String cedula, String facultad) {
        solicitud.verificarDocumentos(nombre, cedula, facultad);
    }

    @Override
    protected void registrarEstudiante(String nombre, String cedula, String facultad) {
        solicitud.registrarEstudiante(nombre, cedula, facultad);
    }

    @Override
    public void procesarSolicitud(String nombre, String cedula, String facultad) {
        solicitud.procesarSolicitud(nombre, cedula, facultad);
    }
}






