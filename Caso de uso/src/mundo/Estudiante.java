package mundo;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String id;
    private List<Materia> materias;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.materias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public void cancelarMateria(Materia materia) {
        materias.remove(materia);
    }

    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre + " (ID: " + id + ")");
        if (materias.isEmpty()) {
            System.out.println("No tiene materias registradas.");
        } else {
            System.out.println("Materias registradas:");
            for (Materia materia : materias) {
                System.out.println("- " + materia.toString());
            }
        }
    }
}
