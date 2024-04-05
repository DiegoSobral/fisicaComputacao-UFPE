#include <stdio.h>

float calcular_imc(float peso, float altura) {
    float imc = peso / (altura * altura);
    return imc;
}

char* classificar_imc(float imc) {
    if (imc < 18.5) {
        return "Baixo peso";
    } else if (imc < 25) {
        return "Peso normal";
    } else if (imc < 30) {
        return "Sobrepeso";
    } else if (imc < 35) {
        return "Obesidade grau I";
    } else if (imc < 40) {
        return "Obesidade grau II";
    } else {
        return "Obesidade grau III";
    }
}

int main() {
    int n;
    scanf("%d", &n);

    char nomes[n][50];
    float pesos[n];
    float alturas[n];
    char classificacoes[n][20];

    for (int i = 0; i < n; i++) {
        scanf(" %[^\n]s", nomes[i]);
        scanf("%f", &pesos[i]);
        scanf("%f", &alturas[i]);
        float imc = calcular_imc(pesos[i], alturas[i]);
        char* classificacao = classificar_imc(imc);
        sprintf(classificacoes[i], "%s", classificacao);
    }

    for (int i = 0; i < n; i++) {
        printf("%s: \n", nomes[i]);
        printf("%s \n \n", classificacoes[i]);
    }

    return 0;
}
