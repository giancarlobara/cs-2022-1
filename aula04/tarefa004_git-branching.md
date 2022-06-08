### Tarefa 004: Git Branching - 03/06/2021

1. Qual o nome do branch padrão do Git?  **main.**
2. O que o comando **<code>git branch nome</code>** realiza? **Cria uma nova branch com título de nome.**

3. Como criar um branch a partir de um commit específico? **Basta passar o commit ID na hora de criar o branch: git checkout -b (nome branch) (id commit).**

4. Em um repositório, qual o efeito do comando **<code>git checkout -b bugfix/234</code>**? **Esse comando o direciona para o branch bugfix/234 se o mesmo já foi criado, caso contrário ele cria uma branch com o nome branch bugfix/234.**

5. Qual o comando para se alternar para um branch de nome **experimento2**? **git checkout experimento2.**

6. Em um repositório com dois branches, **b1** e **b2**, onde b1 é o corrente, qual o efeito do comando **<code>git branch</code>**? **Ele mostrará o branch b1, pois é o corrente no momento.**

7. O que o comando **<code>git checkout -b</code>** nome faz?   **Esse comando cria uma branch nome, caso ela já exista ele se direciona para o branch nome.**

8. Qual a função do <code>**comando git branch -d teste</code>**? **Esse comando deleta o branch teste**

9. Durante o desenvolvimento de um software é comum, por exemplo, utilizar um novo recurso por meio de experimentação. Talvez uma nova tecnologia, uma nova biblioteca que pode ser útil ao que está em desenvolvimento, ou até mesmo uma nova versão de um produto já empregado. Para que o uso deste novo recurso não interfira com o que é considerado pronto, um branch pode ser criado para a experimentação. Código que for criado para a experimentação existirá apenas no branch criado. Se eventualmente o experimento demonstrar um resultado satisfatório, as alterações realizadas no branch poderão ser incorporadas no que é considerado pronto, ou seja, no branch principal (master). Esta última ação é conhecida por merge. Neste item, crie uma sequência de comandos que simula um caso simples de criação e uso seguido de merge empregando um branch para ilustrar uma experimentação conforme acima. A sequência deve incluir, obrigatoriamente: (a) criação de um ou mais branches; (b) chaveamento para pelo menos dois branches e (c) merge.

**a) 
git init teste

git branch nome

git branch mensagem**

**b)
git checkout nome

git commit -m arroz

git checkout mensagem

git commit -m feijao
**

**c) 
git merge nome

git merge mensagem**


</DIV/>
