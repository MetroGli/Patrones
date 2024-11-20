package principal;

import controlador.EstudianteSingleton;
import controlador.Notificador;
import mundo.Estudiante;
import mundo.Materia;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Juan Pérez", "12345");
        Materia matematicas = new Materia("Matemáticas TIC", "MAT101");
        Materia patrones = new Materia("Patrones de diseño", "PAT201");
        Materia fisica = new Materia("Fisica","FIS301");
        estudiante.agregarMateria(matematicas);
        estudiante.agregarMateria(patrones);
        estudiante.agregarMateria(fisica);

        EstudianteSingleton singleton1 = EstudianteSingleton.getInstancia();
        singleton1.setEstudiante(estudiante);

//        EstudianteSingleton singleton2 = EstudianteSingleton.getInstancia();
//        System.out.println("¿Es la misma instancia del singleton? " + (singleton1 == singleton2));
//
//        System.out.println("¿Es el mismo estudiante? " + (singleton1.getEstudiante() == singleton2.getEstudiante()));
        

        System.out.println("\nInformación inicial del estudiante:\n");
        estudiante.mostrarInformacion();

        Notificador notificador = new Notificador();
        notificador.agregarObservador(mensaje -> System.out.println("Notificación: " + mensaje));

        System.out.println("\nCancelando la materia: " + matematicas.getNombre());
        estudiante.cancelarMateria(matematicas);
        notificador.notificar("La materia " + matematicas.getNombre() + " fue cancelada.");

        System.out.println("\nInformación final del estudiante:");
        estudiante.mostrarInformacion();
    }
}
