/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SolicitarCarnet;

/**
 *
 * @author coman
 */
abstract class SolicitudCarnet {
    protected Carnet carnet;

    // Método plantilla
    public void procesarSolicitud(String nombre, String cedula, String facultad) {
        verificarDocumentos(nombre, cedula, facultad);
        registrarEstudiante(nombre, cedula, facultad);
        emitirCarnet();
        notificar();
    }

    protected abstract void verificarDocumentos(String nombre, String cedula, String facultad);

    protected void registrarEstudiante(String nombre, String cedula, String facultad) {
        carnet = new Carnet(nombre, cedula, facultad);
        System.out.println("Estudiante registrado con exito: " + carnet);
    }

    private void emitirCarnet() {
        System.out.println("Carnet emitido exitosamente: " + carnet);
    }

    protected void notificar() {
        System.out.println("Notificacion enviada al estudiante.");
    }
}


