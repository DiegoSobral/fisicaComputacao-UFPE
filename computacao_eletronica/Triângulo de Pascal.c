#include <stdio.h>

int main() {
    int k, i, j;
    scanf("%d", &k);
    int triangle[k][k];
    for (i = 0; i < k; i++) {
        for (j = 0; j <= i; j++) {
            if (j == 0 || j == i) {
                triangle[i][j] = 1;
            } else {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
            printf("%d ", triangle[i][j]);
        }
        printf("\n");
    }
    return 0;
}
