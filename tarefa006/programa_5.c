#include <stdio.h>
#include <stdlib.h>

int main(){
    float salarioUsuario, salarioMinimo = 1045;
    printf("Digite o salario do usuario: ");
    scanf("%f", &salarioUsuario);
    float quantSalarioMinimo = salarioUsuario / salarioMinimo;
    printf("O usuário ganha %.2f salarios.",quantSalarioMinimo);
}