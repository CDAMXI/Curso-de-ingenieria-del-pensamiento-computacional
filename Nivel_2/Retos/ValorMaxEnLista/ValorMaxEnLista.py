def MaxValue(lista):
    if not lista:  # más pythonic que lista == []
        return None
    else:
        max_val = lista[0]
        for valor in lista:
            if valor > max_val:
                max_val = valor
        return max_val

lista = [2, 1, 4, 3, 5]
max_value = MaxValue(lista)
if max_value is None:
    print("La lista está vacía.")
else:
    print(f"El valor máximo en la lista es: {max_value}")
