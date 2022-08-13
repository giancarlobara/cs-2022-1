function validar(login) {
    let regex = /^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[@#$%^&+=])(?=\\S+$).{5,30}$/;
    if (regex.test(login)) {
        console.log(login, '= login válido');
    } else {
        console.log(login, '= login inválido');
    }
}

function valida(senha) {
    let regex = /^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[@#$%^&+=])(?=\\S+$).{8,12}$/;
    if (regex.test(senha)) {
        console.log(senha, '= senha válida');
    } else {
        console.log(senha, '= senha inválida');
    }
}
['banana123'].forEach(s => validar(s));
['123456aA@'].forEach(s => valida(s));