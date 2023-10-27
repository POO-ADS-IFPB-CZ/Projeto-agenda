package model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos;

    public Agenda(){
        contatos = new ArrayList<>();
    }

    public List<Contato> getContatos() {
        return contatos;
    }

}