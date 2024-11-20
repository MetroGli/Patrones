/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;
import Singleton.MatriculaManager;
/**
 *
 * @author coman
 */
public class ReciboMatriculaReal implements ReciboMatricula {
    @Override
    public void generarRecibo(int creditos) {
        double costoPorCredito = 600000; // Valor por crédito
        MatriculaManager manager = MatriculaManager.getInstance();
        double valorTotal = manager.calcularValorTotal(creditos, costoPorCredito);
        System.out.println("=== Recibo de Pago ===");
        System.out.println("Creditos inscritos: " + creditos);
        System.out.println("Costo por crédito: $" + costoPorCredito);
        System.out.println("Total a pagar: $" + valorTotal);
    }
}
