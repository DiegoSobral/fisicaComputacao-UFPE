def calcular_coeficientes_A_B(x, y):
    n = len(x)
    
    soma_x = sum(x)
    soma_y = sum(y)
    soma_x_quadrado = sum(xi ** 2 for xi in x)
    soma_xy = sum(xi * yi for xi, yi in zip(x, y))

    a = (n * soma_xy - soma_x * soma_y) / (n * soma_x_quadrado - soma_x ** 2)
    b = (soma_y - a * soma_x) / n

    return a, b

def ajuste_linear(x, a, b):
    return a * x + b

# Entrada de dados
n = int(input())
x = []
y = []

for i in range(n):
    xi = float(input())
    x.append(xi)
    
for i in range(n):
    yi = float(input())
    y.append(yi)

# Calcular coeficientes da curva de ajustamento
a, b = calcular_coeficientes_A_B(x, y)

# Exibir valores previstos de y para cada x fornecido
print("Valores ajustados:")
for i in range(n):
    valor_previsto = ajuste_linear(x[i], a, b)
    print(f"{valor_previsto:.2f}")
