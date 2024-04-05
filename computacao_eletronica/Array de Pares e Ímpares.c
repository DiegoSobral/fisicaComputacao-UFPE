#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    int pares[n], impares[n];
    int indice_pares = 0, indice_impares = 0;

    for (int i = 0; i < n; i++) {
        int numero;
        scanf("%d", &numero);
        
        if (numero % 2 == 0) {
            pares[indice_pares] = numero;
            indice_pares++;
        } else {
            impares[indice_impares] = numero;
            indice_impares++;
        }
    }


        for (int i = 0; i < indice_pares; i++) {
            printf("pares[");
            printf("%d", i);
        if (i < indice_pares-1) {
            printf("] = %d\n", pares[i]);
    }   else {
            printf("] = %d\n", pares[i]);
        }
    }


        for (int i = 0; i < indice_impares; i++) {
            printf("impares[");
            printf("%d", i);
        if (i < indice_impares-1) {
            printf("] = %d\n", impares[i]);
    }   else {
            printf("] = %d\n", impares[i]);
    }
}


    return 0;
}
