def funcao(x):
    return 1 / x

def regra_trapezio(a, b, n):
    h = (b - a) / n
    x_values = [a + i * h for i in range(n + 1)]
    y_values = [funcao(x) for x in x_values]

    resultado_aproximado = h * (sum(y_values) - 0.5 * (y_values[0] + y_values[-1]))

    return round(resultado_aproximado, 3)

# Entrada de dados
a = float(input())
b = float(input())
n = int(input())

# Calcula a aproximação numérica da integral usando a regra do trapézio
resultado = regra_trapezio(a, b, n)

# Exibe o resultado
print(f"{resultado}")
