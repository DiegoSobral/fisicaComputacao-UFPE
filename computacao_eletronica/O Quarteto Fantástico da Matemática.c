#include <stdio.h>

int fatorial(int n) {
    int resultado = 1;
    for (int i = 2; i <= n; i++) {
        resultado *= i;
    }
    return resultado;
}

int combinacao(int n, int k) {
    return fatorial(n) / (fatorial(k) * fatorial(n - k));
}

int main() {
    int n, k;
    scanf("%d %d", &n, &k);
    int resultado = combinacao(n, k);
    printf("%d\n", resultado);
    return 0;
}
