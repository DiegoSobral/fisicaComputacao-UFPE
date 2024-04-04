def funcao_polinomio(x, A, B, C, D):
    return A * x**3 + B * x**2 + C * x + D

def derivada_polinomio(x, A, B, C):
    return 3 * A * x**2 + 2 * B * x + C

def metodo_newton(A, B, C, D, x0, tolerancia=1e-4, max_iter=100):
    iteracao = 1
    x_atual = x0

    while iteracao < max_iter:
        x_anterior = x_atual
        f_x_atual = funcao_polinomio(x_atual, A, B, C, D)
        f_prime_x_atual = derivada_polinomio(x_atual, A, B, C)

        if abs(f_prime_x_atual) < 1e-15:
            print("O método de Newton não converge - a derivada é próxima de zero.")
            return None

        x_atual = x_atual - f_x_atual / f_prime_x_atual

        if abs(x_atual - x_anterior) < tolerancia:
            print(f"A raiz da função fornecida é: {x_atual:.3f}")
            print(f"Foram necessárias {iteracao} iterações para encontrá-la")
            return x_atual

        iteracao += 1

    print("O método de Newton atingiu o número máximo de iterações sem convergir.")
    return None

# Entradas
A = float(input())
B = float(input())
C = float(input())
D = float(input())
x0 = float(input())

# Chame a função metodo_newton com os parâmetros fornecidos
metodo_newton(A, B, C, D, x0)
