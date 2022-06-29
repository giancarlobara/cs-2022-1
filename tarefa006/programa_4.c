#include <stdio.h>
#include <stdlib.h>

int main(){
    int cod1, cod2, valor1, valor2, quant1, quant2;
    float ipi,valorPagar;
    printf("Preencha os seguintes dados das peças.\nCódigo da peça 1: ");
    scanf("%d", &cod1);
    printf("Valor da peça 1: ");
    scanf("%d", &valor1);
    printf("Quantidade de peças 1 : ");
    scanf("%d", &quant1);
    printf("Código da peça 2: ");
    scanf("%d", &cod2);
    printf("Valor da peça 2: ");
    scanf("%d", &valor2);
    printf("Quantidade de peças 2: ");
    scanf("%d", &quant2);
    printf("IPI: ");
    scanf("%f", &ipi);
    
    valorPagar = (valor1 * quant1 + valor2 * quant2) * ((ipi / 100) + 1);
    printf("O valor a pagar é %.2f", valorPagar);
}