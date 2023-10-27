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

    //Remover um contato - DELETE
    public boolean remover(Contato contato){
        return contatos.remove(contato);
    }

}