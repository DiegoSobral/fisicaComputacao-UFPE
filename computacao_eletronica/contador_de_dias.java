#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

int main() {
    char data_str[11];
    int dias;

    printf("Digite a data no formato DD/MM/AAAA: ");
    scanf("%s", data_str);
    printf("Digite a quantidade de dias a esperar: ");
    scanf("%d", &dias);

    struct tm data;
    memset(&data, 0, sizeof(data)); 
    data.tm_mday = strtol(strtok(data_str, "/"), NULL, 10); 
    data.tm_mon = strtol(strtok(NULL, "/"), NULL, 10) - 1; 
    data.tm_year = strtol(strtok(NULL, "/"), NULL, 10) - 1900; 
    time_t segundos = mktime(&data) + dias * 24 * 60 * 60;

    struct tm data_final;
    memset(&data_final, 0, sizeof(data_final));
    localtime_r(&segundos, &data_final);

    printf("Data final do dating: %02d/%02d/%04d\n", data_final.tm_mday, data_final.tm_mon + 1, data_final.tm_year + 1900);

    return 0;
}
