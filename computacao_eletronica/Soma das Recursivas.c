#include <stdio.h>

int fatorial(int n) {
    if (n <= 1)
        return 1;
    else
        return n * fatorial(n-1);
}

int soma_fatoriais(int a, int b, int c) {
    return fatorial(a) + fatorial(b) + fatorial(c);
}

int main() {
    int num1, num2, num3, resultado;
    scanf("%d", &num1);
    scanf("%d", &num2);
    scanf("%d", &num3);
    
    resultado = soma_fatoriais(num1, num2, num3);
    
    printf("%d",resultado);
    
    return 0;
}
