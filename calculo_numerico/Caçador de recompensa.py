def lagrange_interpolation(x, y, time):
    result = 0.0
    n = len(x)

    for i in range(n):
        term = y[i]
        for j in range(n):
            if j != i:
                term = term * (time - x[j]) / (x[i] - x[j])
        result += term

    return round(result, 3)

def main():
    # Leitura da quantidade de momentos observados
    n = int(input())

    # Leitura dos vetores de tempos
    x = []
    for i in range(n):
        time = float(input())
        x.append(time)

    # Leitura dos vetores de posições
    y = []
    for i in range(n):
        position = float(input())
        y.append(position)

    # Leitura do tempo não tabelado que você quer analisar
    time_to_analyze = float(input())

    # Calcula a posição associada ao tempo informado
    result = lagrange_interpolation(x, y, time_to_analyze)

    # Imprime o resultado
    print(f"A nave está na posição: {result}")

if __name__ == "__main__":
    main()
