def ParImpar(n): 
    while(True): 
        if n < 0: break 
        elif n % 2 == 0: print(f"El valor {n} es par.")
        else: print(f"El valor {n} es impar.")
ParImpar(int(input("Introduce un número: ")))
