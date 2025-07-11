def main():
    estudiantes = ["Ana", "Luis", "Pedro", "Marta"]
    
    try:
        indice = int(input("Introduce el número de estudiante (0 a 3): "))
        print(f"El estudiante seleccionado es: {estudiantes[indice]}")
        
    except IndexError:
        print(f"Error: El índice está fuera de rango. Solo hay {len(estudiantes)} estudiantes.")
    except ValueError:
        print("Error: Debes introducir un número entero.")
    finally:
        print("Programa finalizado.")

if __name__ == "__main__":
    main()
