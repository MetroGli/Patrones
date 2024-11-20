/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SolicitarCarnet;

/**
 *
 * @author coman
 */

public class Carnet {
    private String nombre;
    private String cedula;
    private String facultad;
    private String actividadesExtras;

    public Carnet(String nombre, String cedula, String facultad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.facultad = facultad;
        this.actividadesExtras = "Ninguna";
    }

    public void setActividadesExtras(String actividadesExtras) {
        this.actividadesExtras = actividadesExtras;
    }

    @Override
    public String toString() {
        return "Carnet{" +
               "nombre='" + nombre + '\'' +
               ", cedula='" + cedula + '\'' +
               ", facultad='" + facultad + '\'' +
               ", actividadesExtras='" + actividadesExtras + '\'' +
               '}';
    }
}


