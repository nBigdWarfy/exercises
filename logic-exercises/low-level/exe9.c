#include <stdio.h>

int main(void) {
    int a;
    double fatorial = 1;

    printf("Digite um numero: ");
    scanf("%d", &a);

    for (int i = 1; i <= a; i++) {
        fatorial *= i;
    }
    printf("O fatorial de %d e: %.0f", a, fatorial);

    return 0;
}