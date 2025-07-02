def mostrar_tareas(tareas):
    if not tareas:
        print("No hay tareas aún.")
    for i, (nombre, completada) in enumerate(tareas):
        estado = "[✔]" if completada else "[ ]"
        print(f"{i}. {estado} {nombre}")

def main():
    tareas = []

    while True:
        print("\n--- Menú ---")
        print("1. Añadir tarea")
        print("2. Marcar como completada")
        print("3. Eliminar tarea")
        print("4. Mostrar tareas")
        print("5. Salir")

        opcion = input("Elige una opción: ")

        if opcion == "1":
            nombre = input("Nombre de la tarea: ")
            tareas.append((nombre, False))

        elif opcion == "2":
            idx = int(input("Número de tarea a completar: "))
            if 0 <= idx < len(tareas):
                nombre, _ = tareas[idx]
                tareas[idx] = (nombre, True)
            else:
                print("Índice inválido.")

        elif opcion == "3":
            idx = int(input("Número de tarea a eliminar: "))
            if 0 <= idx < len(tareas):
                tareas.pop(idx)
            else:
                print("Índice inválido.")

        elif opcion == "4":
            mostrar_tareas(tareas)

        elif opcion == "5":
            print("¡Hasta luego!")
            break

        else:
            print("Opción no válida.")

if __name__ == "__main__":
    main()
