try:
    peso = int(input("Introduce tu peso en kg: "))
    altura = int(input("Introduce tu altura en metros: "))
    imc = peso / (altura ** 2)
    print("Tu IMC es: ", imc)
except ValueError:
    print("Por favor, introduce valores numéricos válidos.")
