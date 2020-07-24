import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private static Scanner scanner = new Scanner(System.in);

    public static void mostrarMenu(){

        OperacionesEstudiante.inicializarLista();

        int opcion = 0;

        do {
            mostrarOpciones();

            opcion = obtenerOpcion();

            switch (opcion) {
                case 1:
                    OperacionesEstudiante.agregarEstudiante();
                    break;
                case 2:
                    OperacionesEstudiante.eliminarEstudiante();
                    break;
                case 3:
                    OperacionesEstudiante.actualizarEstudiante();
                    break;
                case 4:
                    OperacionesEstudiante.mostrarEstudiantes();
                    break;
                case 5:
                    OperacionesEstudiante.mostrarGanadores();
                    break;
                case 6:
                    OperacionesEstudiante.mostrarNumeroDeGanadores();
                    break;
                case 7:
                    OperacionesEstudiante.mostrarEstudiantesConNombreQueEmpiezaConS();
                case 8:
                    OperacionesEstudiante.listToMap().forEach(
                            (id, estudiante) -> System.out.println(id + ". " + estudiante)
                    );
                    break;
                case 9:
                    OperacionesEstudiante.mostrarEstudianteConMenorNota();
                    break;
                case 10:
                    OperacionesEstudiante.mostrarEstudianteConMejorNota();
                    break;
                case 11:
                    OperacionesEstudiante.mostrarEstudiantesOrdenadosPorApellido();
                    break;
                case 12:
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }while(opcion != 12);

        System.out.println("Muchas gracias por usar nuestro sistema");
    }

    private static void mostrarOpciones(){
        System.out.println("\nMenu");
        System.out.println("1. Agregar");
        System.out.println("2. Eliminar");
        System.out.println("3. Actualizar");
        System.out.println("4. Mostrar");
        System.out.println("5. Mostrar Alumnos que ganaron la materia");
        System.out.println("6. Número de alumnos que ganaron la materia");
        System.out.println("7. Mostrar alumnos cuyo nombre empieza por S");
        System.out.println("8. Convertir lista a Mapa");
        System.out.println("9. ");
        System.out.println("10. ");
        System.out.println("11. ");
        System.out.println("12. Salir");
    }

    private static int obtenerOpcion(){

        try {
            return scanner.nextInt();
        }catch(InputMismatchException exception){
            scanner.nextLine();
            return 0;
        }
    }
}
