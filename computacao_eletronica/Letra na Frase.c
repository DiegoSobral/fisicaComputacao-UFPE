#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    char texto[201], letra;
    int i, count = 0, total = 0;
    double porcentagem;

    fgets(texto, 201, stdin);
    
    scanf(" %c", &letra);

    for (i = 0; i < strlen(texto); i++) {
        if (tolower(texto[i]) == tolower(letra)) {
            count++;
        }

        if (isalpha(texto[i])) {
            total++;
        }
    }

    porcentagem = ((double)count / total) * 100;

    printf("%d \n", count);
    printf("%.2f%% \n", porcentagem);

    return 0;
}
