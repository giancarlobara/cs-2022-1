### Tarefa 003: Git Exercícios - 03/06/2021.

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git?   **git --version**.

2. Qual o efeito da execução de cada um dos comandos abaixo? 
 	a) git help: **Exibe um resumo do comando git e uma lista de seus comandos mais utilizados**.
 	b) git help checkout: **Exibe uma página de manual do comando checkout**.
  	c) git help merge: **Exibe uma página de manual do comando merge**.
 	d) git init: **Cria um novo repositório**.
  	e) git add --all: **Adiciona todos os arquivos e alterações ao repositório**. 
 	f) git add -u:  **Adiciona todos os arquivos alterados ao repositório**.  
 	g) git config -l: **Lista todas as variáveis ​​definidas no arquivo da configuração, juntamente com seus valores**. 
 	h) git mv a.txt b.txt: **Renomeia o arquivo a.txt para b.txt**.  
 	i) git reset --hard: **Redefine todas alterações de arquivos no repositório desde o commit**.  
	j) git log -27: **Mostra até 27 commits no logs de commits**.

3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo? 
 **git add <arquivo> e git commit -m**.
 
4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
 **git diff**.
 
5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando? **git status**.

6. Qual o comando para efetuar um _commit_? **git commit -m**.

7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo? **git reset teste.txt**.

8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.

9. O que acontece se o seu repositório local for acidentalmente removido? **Enquanto não executar um commit, o repositório local pode ser recuperado, pois os arquivos ainda estarão no repositório remoto**.

10. Como clonar um repositório remoto? **Usando o comando git clone <link do repositório>**

11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?

12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário? **No .gitconfig**.

13. Qual o comando para criar um repositório local? **git init**.

14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?  **.git**.

15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)   **git add-u**.

16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?

17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?

18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_? **Não**.

19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
	**git reset --soft HEAD~1: Reseta a HEAD para o commit.
	git reset --hard : Todos arquivos rastreados desde o commit destacado serão descartados**.

20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?  **git clean -f**.

21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados? **.gitignore**.

22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
__Dentro do arquivo gitignore fazer a chamada para que todos .class sejam ignorados utilizando *.class__.

23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.

24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando **git shortlog -sne**? **Esse comando retornou em ordem decrescente baseado no número de logs, a quantidade de logs, o nome e email do usuário que os efetuou**.

25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**? **Mostra o link do repositório remoto**.

26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado? **git tag**.

27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0? __git tag --list "2.0*__*.

28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**? **Cria uma tag e armazena com a mensagem "minha versão ouro"**.

29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**? **Após executado vai exibir os dados da tag junto com o commit**. 

30. O que o comando **git push origin 3.4-gold** teria como efeito? **Se houver permissão, esse comando atualiza o repositório remoto com o repositório local, sob a tag 3.4-gold**.

31. Após executar um commit, qual o efeito de **git commit --amend**? **Esse comando permite realizar alterações no último commit**.

32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**? **As alterações do arquivo x.txt não serão commitadas**.

33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**? **O comando não trará mudanças pois o commit já foi efetuado**.

34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**? **O primeiro reseta a HEAD do arquivo a.txt e o segundo restaura o arquivo a.txt**.

35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.


</DIV/>
