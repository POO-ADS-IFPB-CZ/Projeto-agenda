package model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos;

    public Agenda(){
        contatos = new ArrayList<>();
    }

    //Adicionar contato à agenda
    public boolean adicionar(Contato contato){
        return contatos.contains(contato)?false:contatos.add(contato);
    }

    //Listar os contatos
    public List<Contato> getContatos() {
        return contatos;
    }

}