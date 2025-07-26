def factorial(n):
    if n < 0:
        return -1
    if n == 0 or n == 1:
        return 1
    return n * factorial(n - 1)

def main():
    n = 5  # Cambia este valor para calcular otros números
    resultado = factorial(n)
    if resultado == -1:
        print("El número debe ser no negativo.")
    else:
        print(f"El factorial de {n} es {resultado}")

if __name__ == "__main__":
    main()
