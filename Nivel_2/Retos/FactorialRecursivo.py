def factorial(n):
    if n < 0:
        return -1
    if n == 0 or n == 1:
        return 1
    return n * factorial(n - 1)

def main():
    try:
        n = int(input("Ingrese un número entero no negativo: "))
        resultado = factorial(n)
        if resultado == -1:
            print("El número debe ser no negativo.")
        else:
            print(f"El factorial de {n} es {resultado}")
    except ValueError:
        print("Entrada inválida. Por favor, ingrese un número entero.")

if __name__ == "__main__":
    main()
