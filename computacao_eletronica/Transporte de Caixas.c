#include <stdio.h>

struct Caixa {
    int largura;
    int profundidade;
    int altura;
};

int main() {
    int n;
    scanf("%d", &n);

    struct Caixa caixas[n];

    for (int i = 0; i < n; i++) {
        scanf("%d %d %d", &caixas[i].largura, &caixas[i].profundidade, &caixas[i].altura);
    }

    int tem_caixa = 0;

    for (int i = 0; i < n; i++) {
        if (caixas[i].altura <= 10) {
            printf("%d\n", caixas[i].largura * caixas[i].profundidade * caixas[i].altura);
            tem_caixa = 1;
        }
    }

    if (!tem_caixa) {
        printf("Nenhuma caixa passa pelo tunel!\n");
    }

    return 0;
}
