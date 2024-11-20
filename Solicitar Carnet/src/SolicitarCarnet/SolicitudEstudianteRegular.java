package SolicitarCarnet;

/**
 *
 * @author coman
 */
class SolicitudEstudianteRegular extends SolicitudCarnet {
    @Override
    protected void verificarDocumentos(String nombre, String cedula, String facultad) {
        System.out.println("Verificando documentos estandar para el estudiante:");
        System.out.println("- Nombre: " + nombre);
        System.out.println("- Cedula: " + cedula);
        System.out.println("- Facultad: " + facultad);
    }
}

