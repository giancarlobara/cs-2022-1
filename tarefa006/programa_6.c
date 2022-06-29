#include <stdio.h>
#include <stdlib.h>

int main(){
    int numero;
    printf("Digite um número inteiro qualquer.\n");
    scanf("%d", &numero);
    int antecessor = numero - 1, sucessor = numero + 1;
    printf("O antecessor desse número é o %d e o sucessor é o %d.", antecessor, sucessor);
}