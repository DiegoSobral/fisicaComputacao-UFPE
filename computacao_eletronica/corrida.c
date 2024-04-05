#include <stdio.h>

int main() {
    int comprimento, velocidade, tempo;
    
    // Recebe o comprimento da pista, velocidade e tempo
    scanf("%d %d %d", &comprimento, &velocidade, &tempo);

    // Verifica se as entradas são válidas
    if (comprimento <= 100 || comprimento > 10000000 || velocidade <= 0 || velocidade > 40 || tempo <= 0 || tempo > 10000000) {
        printf("algo de errado nao esta certo!\n");
        return 1;
    }

    // Calcula o número de voltas completas e a posição atual
    int voltasCompletas = tempo * velocidade / comprimento;
    int posicaoAtual = tempo * velocidade % comprimento;

    // Imprime os resultados
    printf("voltas completas: %d / posicao atual: %d\n", voltasCompletas, posicaoAtual);

    return 0;
}
