/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solicitarre;
import Proxy.ReciboMatricula;
import Proxy.ReciboMatriculaProxy;
/**
 *
 * @author coman
 */
public class SolicitarRe {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Ingrese el numero de creditos inscritos: ");
        int creditos = scanner.nextInt();

        ReciboMatricula recibo = new ReciboMatriculaProxy();
        recibo.generarRecibo(creditos);

        scanner.close();
    }
}
    

