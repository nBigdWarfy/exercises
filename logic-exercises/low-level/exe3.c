#include <stdio.h>

int main(void) {
    char name[32], city[32];
    int age;

    printf("Digite o seu nome: ");
    scanf("%s", name);
    printf("\nDigite sua idade: ");
    scanf("%d", &age);
    printf("\nDigite a cidade em que voce vive: ");
    scanf("%s", city);

    printf("%s, %d, %s", name, age, city);

    return 0;
}