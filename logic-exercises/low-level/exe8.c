#include <stdio.h>

int main(void) {
    int n;
    float x, y, z;
    printf("Digite a quantidade de vezes: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        printf("Digite os valores: ");
        scanf("%f", &x);
        scanf("%f", &y);
        scanf("%f", &z);

        float result = (x*2 + y*3 + z*5)/10;
        printf("Resultado: %.1f\n", result);
    }
    return 0;
}