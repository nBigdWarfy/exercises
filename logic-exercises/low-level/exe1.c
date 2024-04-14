#include <stdio.h>
#include <stdbool.h>

int main(void) {
    while(true) {
        int answer;
        printf("Insira a senha: ");
        scanf("%d", &answer);

        if (answer == 2002) {
            printf("Acesso permitido!");
            return 0;
        } else {
            printf("Senha invalida!\n");
        }
    }
    return 0;
}