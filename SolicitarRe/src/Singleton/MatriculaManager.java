/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author coman
 */
public class MatriculaManager {
    private static MatriculaManager instance;

    private MatriculaManager() {
        // Constructor privado para evitar instanciación externa
    }

    public static MatriculaManager getInstance() {
        if (instance == null) {
            instance = new MatriculaManager();
        }
        return instance;
    }

    public double calcularValorTotal(int creditos, double costoPorCredito) {
        return creditos * costoPorCredito;
    }
}
