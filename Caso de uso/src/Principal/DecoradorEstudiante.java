package principal;

import mundo.Estudiante;
import mundo.Materia;

public class DecoradorEstudiante {
    private Estudiante estudiante;

    public DecoradorEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void cancelarMateriaConNotificacion(Materia materia) {
        estudiante.cancelarMateria(materia);
        System.out.println("Se canceló la materia: " + materia.getNombre());
    }
}
