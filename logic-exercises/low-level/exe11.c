#include <stdio.h>

int main(void) {
    int n, a[3];
    
    printf("Digite um valor: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++) {
        a[0] = i;
        a[1] = i * i;
        a[2] = i * i * i;
        printf("%d %d %d\n", a[0], a[1], a[2]);
    }
}