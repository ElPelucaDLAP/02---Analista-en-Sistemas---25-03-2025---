import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Desafío: Desarrolla unaaplicación para gestionar tareas pendientes. Crea una clase Tarea
        // con atributos como descripción y estado (completada o no). Luego, permite al usuario agregar
        // nuevas tareas y marcarlas como completadas.
        Scanner sc = new Scanner(System.in);
        ArrayList<Tarea> tareasDisponibles = new ArrayList<>();
        System.out.println("Ingrese una nueva tarea: ");
        tareasDisponibles.add(new Tarea("Ordenar Archivos", "Los archivos de la biblioteca" +
                " estan desorganizados", 1));
        tareasDisponibles.add(new Tarea("Organizar Cuentas", "Las cuentas del negocio se" +
                "encuentran desordenadas", 1));
        System.out.println("Las tareas actuales son: ");
        for (int i = 0; i < tareasDisponibles.size(); i++) {
            System.out.println(tareasDisponibles.get(i).toString());
        }
        System.out.println("Ingrese cuantas tareas desea añadir: ");
        int numTareas = sc.nextInt();
        int contador = 0;
        do {
            System.out.println("Ingrese una nueva tarea: ");
            System.out.println("Nombre: ");
            String nombre = sc.nextLine(); sc.nextLine();
            System.out.println("Descripcion: ");
            String descripcion = sc.nextLine(); sc.nextLine();
            System.out.println("Estado: ");
            int estado = sc.nextInt(); sc.nextLine();
            tareasDisponibles.add(new Tarea(nombre, descripcion, estado));
            contador++;
        } while (contador != numTareas);
        System.out.println("Cambia estado de las tareas a:");
        for (int i = 0; i < tareasDisponibles.size(); i++) {
            System.out.println("1.Sin hacer");
            System.out.println("2.En Proceso");
            System.out.println("3.Completa");
            System.out.println(tareasDisponibles.get(i).toString());
            int estadoTarea = sc.nextInt();sc.nextLine();
            tareasDisponibles.get(i).setEstado(estadoTarea);
        }
        for (int i = 0; i < tareasDisponibles.size(); i++) {
            System.out.println(tareasDisponibles.get(i).toString());
        }
    }
}
