def interp_por_partes(x_tabelado, y_tabelado, ponto_interesse):
    n = len(x_tabelado)

    # Verifica em qual intervalo se encontra o ponto de interesse
    intervalo = None
    for i in range(n - 1):
        if x_tabelado[i] <= ponto_interesse <= x_tabelado[i + 1]:
            intervalo = (x_tabelado[i], x_tabelado[i + 1])
            break

    if intervalo is None:
        print("O ponto de interesse está fora do intervalo dos dados tabelados.")
        return None

    # Encontra o índice do intervalo
    indice_intervalo = x_tabelado.index(intervalo[0])

    # Calcula o resultado da interpolação por partes
    x1, x2 = intervalo
    y1, y2 = y_tabelado[indice_intervalo], y_tabelado[indice_intervalo + 1]

    # A fórmula da interpolação linear é utilizada para cada intervalo
    resultado = y1 + ((ponto_interesse - x1) / (x2 - x1)) * (y2 - y1)

    return intervalo, resultado

# Entrada de dados
quantidade_dados = int(input())
x_tabelado = []
y_tabelado = []

for i in range(quantidade_dados):
    x = float(input())
    x_tabelado.append(x)
    
for i in range(quantidade_dados):
    y = float(input())
    y_tabelado.append(y)

ponto_interesse = float(input())

# Realiza a interpolação por partes
resultado_interpolacao = interp_por_partes(x_tabelado, y_tabelado, ponto_interesse)

# Apresenta os resultados
if resultado_interpolacao is not None:
    intervalo, resultado = resultado_interpolacao
    print(f"O ponto de interesse está entre {intervalo[0]} e {intervalo[1]}")
    print(f"O valor interpolado em x = {ponto_interesse} é {round(resultado, 3)}")
