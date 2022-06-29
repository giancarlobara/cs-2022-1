#include <stdio.h>
#include <stdlib.h>

int main(){
    float saldo;
    printf("Digite seu saldo!\nSaldo: ");
    scanf("%f", &saldo);
    float reajuste = saldo * 0.15;
    printf("Reajuste do saldo: %f", reajuste);
}