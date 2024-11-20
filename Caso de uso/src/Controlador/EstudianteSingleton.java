package controlador;

import mundo.Estudiante;

public class EstudianteSingleton {
    private static EstudianteSingleton instancia;
    private Estudiante estudiante;

    private EstudianteSingleton() {}

    public static EstudianteSingleton getInstancia() {
        if (instancia == null) {
            instancia = new EstudianteSingleton();
        }
        return instancia;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
}
