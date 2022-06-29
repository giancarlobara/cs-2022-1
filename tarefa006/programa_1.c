#include <stdio.h>
#include <stdlib.h>

int main(){
    int ano = 365, mes = 30;
    int anos, meses, dias, diasTotal;

    printf("Digite sua idade expressa em anos, meses e dias!\nAnos: ");
    scanf("%d", &anos);
    printf("Meses: ");
    scanf("%d", &meses);
    printf("Dias: ");
    scanf("%d", &dias);
    
    if(anos >= 0 && meses >= 0 && meses <= 11 && dias >= 0 && dias <= 29){
        diasTotal = anos * ano + meses * mes + dias;
        printf("Sua idade total em dias é igual %d dias.", diasTotal);
    }
}