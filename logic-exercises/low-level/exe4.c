#include <stdio.h>

int main(void) {
    float x = 0.1;
    float y = -0.1;

    while (x != 0 && y != 0) {
        printf("Digite o valor de X: ");
        scanf("%f", &x);
        printf("Digite o valor de Y: ");
        scanf("%f", &y);

        if (x > 0 && y < 0) {
            printf("Quadrante A\n");
        } else if (x > 0 && y > 0) {
            printf("Quadrante B\n");
        } else if (x < 0 && y > 0) {
            printf("Quadrante C\n");
        } else if (x < 0 && y < 0) {
            printf("Quadrante D\n");
        }
    }
    return 0;
}