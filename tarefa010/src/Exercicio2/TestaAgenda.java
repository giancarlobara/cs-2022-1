package Exercicio2;

public class TestaAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contato c1 = new Contato("Sherlock Holmes", "detetivedobom@outlook.com");
        Contato c2 = new Contato("Moriarty", "lunatico@hotmail.com");
        Contato c3 = new Contato("John Watson", "drwatson@gmail.com");

        agenda.adicionaContato(c1);
        agenda.adicionaContato(c2);
        agenda.excluiContato("Moriarty");
        agenda.adicionaContato(c3);
    }
}
