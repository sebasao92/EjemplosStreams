import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperacionesEstudiante {

    private static final List<Estudiante> listaEstudiantes = new ArrayList<>();

    public static void inicializarLista(){

        listaEstudiantes.add(new Estudiante("Diego", "Melo", 1, 2.0));
        listaEstudiantes.add(new Estudiante("Wilson", "Calderón", 2, 3.0));
        listaEstudiantes.add(new Estudiante("Dayana", "Ovalle", 10, 5.0));
        listaEstudiantes.add(new Estudiante("Sebastián", "Alarcón", 4, 2.1));
        listaEstudiantes.add(new Estudiante("Julián", "Muñoz", 11, 4.1));
        listaEstudiantes.add(new Estudiante("santiago", "Goyes", 15, 3.5));
    }

    public static void agregarEstudiante(){
        System.out.println("Opción de agregar");
    }

    public static void eliminarEstudiante(){
        System.out.println("Opción de elminar");
    }

    public static void mostrarEstudiantes(){
        System.out.println("Opción de mostrar");
    }

    public static void actualizarEstudiante(){
        System.out.println("Opción de actualizar");
    }

    public static void mostrarGanadores() {
        System.out.println("\nAlumnos que ganaron la materia");
        filtrarEstudiantesGanadores()
                        .sorted(Comparator.comparing(Estudiante::getNota, Comparator.reverseOrder()))
                        .forEach(System.out::println);
    }

    public static void mostrarNumeroDeGanadores() {
        System.out.print("\nNúmero de alumnos que ganaron la materia: " + filtrarEstudiantesGanadores().count());
    }

    private static Stream<Estudiante> filtrarEstudiantesGanadores(){
        return listaEstudiantes.stream()
                               .filter(estudiante -> estudiante.getNota() >= 3.0);
    }

    public static void mostrarEstudiantesConNombreQueEmpiezaConS(){
        listaEstudiantes.stream()
                        .filter(estudiante -> estudiante.getNombre().toUpperCase().startsWith("S"))
                        .forEach(System.out::println);
    }

    public static Map<Integer, Estudiante> listToMap(){
        return listaEstudiantes.stream()
                               .collect(Collectors.toMap(
                                       estudiante -> estudiante.getId(),
                                       estudiante -> estudiante
                               ));
    }

    public static void mostrarEstudianteConMenorNota() {
        System.out.println(listaEstudiantes.stream()
                        .min(Comparator.comparing(Estudiante::getNota))
                        .map(estudiante -> estudiante.toString())
                        .orElse("No hay estudiantes"));
    }

    public static void mostrarEstudianteConMejorNota() {
    }

    public static void mostrarEstudiantesOrdenadosPorApellido() {
    }
}
