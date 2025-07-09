def ParImpar(n):
    if n % 2 == 0: print (f"El valor {n} es par.")
    else:  print(f"El valor {n} es impar.") 
        
while True:
    n = int(input("Ingrese un valor: "))
    if n < 0:
        print("El valor es negativo. Finalizando programa.")
        break
    ParImpar(n)
