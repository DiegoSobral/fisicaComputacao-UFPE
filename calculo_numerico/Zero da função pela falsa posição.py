import math

def funcao_raiz(x, A, B, C):
    return A*x + B*x**2 - C*math.cos(x)

def falsa_posicao(A, B, C, a, b, erro=0.05):
    if funcao_raiz(a, A, B, C) * funcao_raiz(b, A, B, C) > 0:
        print("Não há raiz neste intervalo.")
        return None

    iteracao = 0

    while abs(b - a) > erro:
        x_novo = (a * funcao_raiz(b, A, B, C) - b * funcao_raiz(a, A, B, C)) / (funcao_raiz(b, A, B, C) - funcao_raiz(a, A, B, C))
        
        if funcao_raiz(x_novo, A, B, C) == 0:
            print(f"O valor aproximado da raiz é: {x_novo:.6f}")
            return x_novo
        elif funcao_raiz(x_novo, A, B, C) * funcao_raiz(a, A, B, C) < 0:
            b = x_novo
        else:
            a = x_novo

        iteracao += 1

    print(f"O valor aproximado da raiz é: {x_novo:.6f}")
    return x_novo

# Obtenha os valores de entrada do usuário
A = float(input())
B = float(input())
C = float(input())
intervalo_a = float(input())
intervalo_b = float(input())

# Chame a função falsa_posicao com os parâmetros fornecidos
falsa_posicao(A, B, C, intervalo_a, intervalo_b)
