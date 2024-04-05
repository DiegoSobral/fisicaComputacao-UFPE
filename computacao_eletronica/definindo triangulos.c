#include <stdio.h>

int main() {
    int lado1, lado2, lado3;

    // Recebe as medidas dos lados do triângulo
    scanf("%d %d %d", &lado1, &lado2, &lado3);

    // Verifica se o triângulo é válido
    if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
        // Verifica o tipo de triângulo
        if (lado1 == lado2 && lado2 == lado3) {
            printf("Equilatero\n");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            printf("Isosceles\n");
        } else {
            printf("Escaleno\n");
        }
    } else {
        printf("Nao existe\n");
    }

    return 0;
}
