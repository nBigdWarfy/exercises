#include <stdio.h>

int main(void) {
    double number;
    printf("Digite um valor entre 0 e 1000: ");
    scanf("%lf", &number);

    for (int i; i <= number; i++) {
        if (i%2 != 0) {
            printf("%d \n", i);
        }
    }
}