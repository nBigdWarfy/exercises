#include <stdio.h>

int main(void) {
    int n;

    printf("Digite um valor: ");
    scanf("%d", &n);

    for (int i = n; i<= n; i--) {
        if (n % i == 0) {
            printf("%d\n", i);
        }
    }
    return 0;
}