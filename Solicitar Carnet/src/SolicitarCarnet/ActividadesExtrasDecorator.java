/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SolicitarCarnet;



/**
 *
 * @author coman
 */
public class ActividadesExtrasDecorator extends SolicitudCarnetDecorator {
    public ActividadesExtrasDecorator(SolicitudCarnet solicitud) {
        super(solicitud);
    }

    protected void personalizarCarnet() {
        System.out.println("Añadiendo actividades extracurriculares al carnet.");
        solicitud.carnet.setActividadesExtras("Participación en deportes y talleres culturales");
    }


    @Override
    public void procesarSolicitud(String nombre, String cedula, String facultad) {
        super.procesarSolicitud(nombre, cedula, facultad);
        añadirActividadesExtras();
    }

    private void añadirActividadesExtras() {
        System.out.println("Anadiendo actividades extracurriculares al carnet.");
        solicitud.carnet.setActividadesExtras("Participación en deportes y talleres culturales");
    }
}
