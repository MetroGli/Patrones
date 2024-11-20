/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;
/**
 *
 * @author coman
 */
public class ReciboMatriculaProxy implements ReciboMatricula {
    private ReciboMatriculaReal reciboReal;

    public ReciboMatriculaProxy() {
        this.reciboReal = new ReciboMatriculaReal();
    }

    @Override
    public void generarRecibo(int creditos) {
        if (creditos <= 0 || creditos >=24) {
            System.out.println("Error: El numero de creditos debe ser mayor a cero, y menor o igual a 24");
            return;
        }
        reciboReal.generarRecibo(creditos);
    }
}
