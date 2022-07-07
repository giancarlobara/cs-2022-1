package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos = new ArrayList<Contato>();

    public void adicionaContato(Contato contato) {
        contatos.add(contato);
    }

    public Contato buscaContato(String nome) {
        Contato contato = new Contato();
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)) {
                contato = contatos.get(i);
            }
        }
                return contato;
    }

    public void excluiContato(String nome){
        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).getNome().equals(nome)){
                contatos.remove(contatos.get(i));
            }
        }
    }

    public void listaAgenda() {

    }

}
