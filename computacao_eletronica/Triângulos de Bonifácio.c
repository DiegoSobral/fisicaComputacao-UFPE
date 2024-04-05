#include <stdio.h>
#include <stdlib.h>
#include <math.h>

typedef struct {
    int a, b, c;
    double area;
} Triangulo;

void calculaArea(int a, int b, int c, double *area) {
    double p = (a + b + c) / 2.0;
    *area = sqrt(p * (p - a) * (p - b) * (p - c));
}

int comparaTriangulos(const void *t1, const void *t2) {
    Triangulo *tri1 = (Triangulo*) t1;
    Triangulo *tri2 = (Triangulo*) t2;
    if (tri1->area < tri2->area) {
        return -1;
    } else if (tri1->area > tri2->area) {
        return 1;
    } else {
        return 0;
    }
}

int main() {
    int n;
    scanf("%d", &n);

    Triangulo triangulos[n];
    for (int i = 0; i < n; i++) {
        scanf("%d %d %d", &triangulos[i].a, &triangulos[i].b, &triangulos[i].c);
        if (triangulos[i].a + triangulos[i].b > triangulos[i].c &&
            triangulos[i].a + triangulos[i].c > triangulos[i].b &&
            triangulos[i].b + triangulos[i].c > triangulos[i].a) {
            calculaArea(triangulos[i].a, triangulos[i].b, triangulos[i].c, &triangulos[i].area);
        } else {
            triangulos[i].area = -1.0;
        }
    }

    qsort(triangulos, n, sizeof(Triangulo), comparaTriangulos);

    for (int i = 0; i < n; i++) {
        if (triangulos[i].area >= 0.0) {
            printf("%d %d %d\n", triangulos[i].a, triangulos[i].b, triangulos[i].c);
        }
    }
    return 0;
}
