#include <stdio.h>

int main(void){
    int value = 1;
    while (value != 0) {
        printf("Digite um valor: ");
        scanf("%d", &value);

        if (value >= 10 && value <= 20) {
            printf("%d in\n", value);
        } else if (value < 10 || value > 20) {
            printf("%d out\n", value);
        }
    }
    return 0;
}