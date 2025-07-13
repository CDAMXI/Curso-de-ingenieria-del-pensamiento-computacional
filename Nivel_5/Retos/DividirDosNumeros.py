num1 = int(input("Ingrese un número entero: "))
num2 = int(input("Ingrese otro número entero: "))
try:
    resultado = num1 / num2  # División
    print(f"El resultado de la división es: {resultado}")
except ZeroDivisionError: print("Error: División por cero no permitida.")
except ValueError: print("Error: Debes introducir un número entero.")
finally:
    print("Programa finalizado.")
