n = int(input("Introduce un valor: "))
if n < 0:
	print("El valor es negativo. Finalizando programa.")
elif n % 2 == 0:
	print("El valor " + str(n) + " es par.")
else:
	print("El valor " + str(n) + " es impar.")
