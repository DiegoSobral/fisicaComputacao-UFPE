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

    # Leitura dos vetores de intensidades radioativas
    y = []
    for i in range(n):
        intensity = float(input())
        y.append(intensity)

    # Leitura do tempo não tabelado que você quer analisar
    time_to_analyze = float(input())

    # Calcula a intensidade associada ao tempo informado
    result = lagrange_interpolation(x, y, time_to_analyze)

    # Verifica se o material é seguro para a pesquisa
    if result <= 60:
        print(f"O objeto tem {result} de material radioativo, é seguro conduzir a pesquisa.")
    else:
        print(f"O objeto tem {result} de material radioativo, ainda não é seguro conduzir a pesquisa.")

if __name__ == "__main__":
    main()
