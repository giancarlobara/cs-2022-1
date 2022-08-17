/**
 * nesse exemplo uma variável global foi declarada,
 * em seguida uma função foi criada para manipular
 * essa variável externa a função
 * */ 

const x = 'Global'

function fora() {
    const x = 'Local'
    function dentro() {
        return x
    }
    return dentro
}

const minhaFuncao = fora()
console.log(minhaFuncao())