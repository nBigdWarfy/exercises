#include <stdio.h>

int main(void) {
    float num, den;
    int t;
    
    printf("Digite quantas vezes deseja relizar a operacao: ");
    scanf("%d", &t);

    for (int i = 0; i < t; i++) {
        printf("\nDigite o numerador: ");
        scanf("%f", &num);
        printf("Digite o valor do denominador: ");
        scanf("%f", &den);
        printf("Resultado: %.2f\n", (num/den));
    }
    return 0;
}