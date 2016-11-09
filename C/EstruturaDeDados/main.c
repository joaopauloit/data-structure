#include <stdio.h>
#include <stdlib.h>

#define bool int
#define true 1
#define false 0

int main(void)
{
    printf("Hello world!\n");

    printf("Exibição FIFO, sequencia de inserção array (1,2,3,4,5,6,7,8,9,10)\n");

    fifo();

    return 0;
}

void fifo(){

    //Declarando um array e adicionando numeros inteiros de 1 a 10
    int fila[10] = {1,2,3,4,5,6,7,8,9,10};

    //Exibindo dados do array em FIFO
    while(existeDados(fila)){
        printf(recuperarProximoDaFila(fila));
    }

}

int recuperarProximoDaFila(int fila[]){
    int proximoDaFila = fila[0];

    for(int i=0; i< sizeof(fila); i++){

        if(fila[i+1] == NULL){
            fila[i] = NULL;
        }
        else{
            fila[i] = fila[i+1];
        }
    }
}

bool existeDados(int fila[]){

    bool possuiDados = false;

    for(int i=0; i< sizeof(fila); i++){

        if(fila[i] != NULL){
            possuiDados = true;
            break;
        }

    }

    return possuiDados;
}
