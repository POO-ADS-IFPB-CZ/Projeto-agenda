package view;

import model.Contato;
import model.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("joao@gmail.com", "123456");

        Contato maria = new Contato("Maria",
                "maria@gmai.com", "83 99999-9999");
        usuario.getAgenda().adicionar(maria);

        Contato pedro = new Contato("Pedro",
                "pedro@gmai.com", "84 98888-8888");
        usuario.getAgenda().adicionar(pedro);

        usuario.getAgenda().adicionar(new Contato("Ana",
                "ana@gmai.com", "83 97777-7777"));

        System.out.println(usuario.getAgenda().getContatos());

        //Chamar os métodos de deletar e atualizar
        usuario.getAgenda().remover(maria);

        usuario.getAgenda().atualizar(pedro, new Contato(
                "Pedro da Silva", "pedrosilva@gmail.com",
                "84 99999-9999"));

        System.out.println(usuario.getAgenda().getContatos());



    }
}