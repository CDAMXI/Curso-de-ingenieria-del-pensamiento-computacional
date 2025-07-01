def fibonacci(n):
    if n == 0 or n == 1: return n
    else: return fibonacci(n - 1) + fibonacci(n - 2)
n = 10; # Cambia este valor para calcular otros números de Fibonacci
print("El número Fibonacci en la posición " + n + " es: " + fibonacci(n))
