def factorial(n):
    if n < 0:
        return -1
    resultado = 1
    for i in range(2, n + 1):
        resultado *= i
    return resultado

def main():
    n = 5
    resultado = factorial(n)
    if resultado == -1:
        print("El número debe ser no negativo.")
    else:
        print(f"El factorial de {n} es {resultado}")

if __name__ == "__main__":
    main()
