package ListaDeTareas;

import java.util.*;

public class ListaDeTareas {
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        List<String> tareas = new ArrayList<>();
        List<Boolean> completadas = new ArrayList<>();

        while(true){
            System.out.println("\n--- Menú ---");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Mostrar tareas");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            int opcion = kbd.nextInt();
            kbd.nextLine(); // Limpiar el buffer

            switch(opcion){
                case 1:
                    System.out.print("Introduce la tarea a añadir: ");
                    String tarea = kbd.nextLine();
                    tareas.add(tarea);
                    completadas.add(false); // estado inicial: no completada
                    System.out.println("Tarea añadida.");
                    break;

                case 2:
                    System.out.print("Introduce el número de la tarea a marcar como completada: ");
                    int pos = kbd.nextInt();
                    if(pos >= 0 && pos < tareas.size()){
                        completadas.set(pos, true); // cambiar estado a true
                        System.out.println("Tarea marcada como completada.");
                    } else {
                        System.out.println("Número de tarea inválido.");
                    }
                    break;

                case 3:
                    System.out.print("¿Qué número de tarea quieres eliminar?: ");
                    int pos2 = kbd.nextInt();
                    if (pos2 >= 0 && pos2 < tareas.size()) {
                        tareas.remove(pos2);
                        completadas.remove(pos2);
                        System.out.println("Tarea eliminada.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    System.out.println("\nTareas:");
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas registradas.");
                    } else {
                        for (int i = 0; i < tareas.size(); i++) {
                            String estado = completadas.get(i) ? "[✔]" : "[ ]";
                            System.out.println(i + ". " + estado + " " + tareas.get(i));
                        }
                    }
                    break;

                case 5:
                    System.out.println("¡Hasta luego!");
                    kbd.close();
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
