package model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos;

    public Agenda(){
        contatos = new ArrayList<>();
    }

    //Adicionar contato à agenda - CREATE
    public boolean adicionar(Contato contato){
        return contatos.contains(contato)?false:contatos.add(contato);
    }

    //Listar os contatos - READ
    public List<Contato> getContatos() {
        return contatos;
    }

    //Atualizar um contato - UPDATE
    public boolean atualizar(Contato atual, Contato novo){
        int posicao =contatos.indexOf(atual);
        if(posicao>=0){
            contatos.set(posicao, novo);
            return true;
        }else{
            return false;
        }
    }

    //Remover um contato - DELETE
    public boolean remover(Contato contato){
        return contatos.remove(contato);
    }

}