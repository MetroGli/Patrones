package SolicitarCarnet;
import java.util.Scanner;
/**
 *
 * @author coman
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> cedulasRegistradas = new HashSet<>();
        boolean continuar = true;

        while (continuar) {
            // Datos de entrada
            System.out.println("Ingrese el nombre del estudiante:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la cedula del estudiante:");
            String cedula = scanner.nextLine();

            // Verificar si la cédula ya está registrada
            if (cedulasRegistradas.contains(cedula)) {
                System.out.println("Error: Este estudiante ya tiene un carnet registrado.");
                System.out.println("No se puede procesar la solicitud nuevamente.\n");
                continue; // Saltar al siguiente ciclo
            }

            System.out.println("Ingrese la facultad del estudiante:");
            String facultad = scanner.nextLine();

            // Crear solicitud básica
            SolicitudCarnet solicitud = new SolicitudEstudianteRegular();

            // Decorar con actividades extracurriculares si es necesario
            System.out.println("Desea agregar actividades extracurriculares al carnet? (si/no):");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                solicitud = new ActividadesExtrasDecorator(solicitud);
            }

            // Crear sistema de solicitud y agregar un observador
            SistemaDeSolicitud sistema = new SistemaDeSolicitud();
            sistema.agregarObservador(new SistemaNotificaciones());

            // Procesar solicitud
            sistema.completarSolicitud(solicitud, nombre, cedula, facultad);

            // Registrar la cédula en el conjunto
            cedulasRegistradas.add(cedula);

            // Preguntar si desea continuar registrando estudiantes
            System.out.println("Desea registrar otro estudiante? (si/no):");
            String continuarRespuesta = scanner.nextLine();
            continuar = continuarRespuesta.equalsIgnoreCase("si");
        }

        System.out.println("Registro finalizado.");
        scanner.close();
    }
}



