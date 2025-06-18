def fibonacci(n):
    result = 0
    for i in range(n): result = result + i
    return result
    
n = 10 #Cambia este valor para calcular otros números de Fibonacci  
print("El número Fibonacci en la posición " + str(n) + " es: " + str(fibonacci(n)))
