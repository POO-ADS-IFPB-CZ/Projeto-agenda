package view;

import dao.UsuarioDao;
import model.Usuario;

public class Main {
    public static void main(String[] args) {

        UsuarioDao dao = new UsuarioDao();

        System.out.println(dao.listarUsuarios());

        if(dao.addUsuario(new Usuario("ana@gmail.com", "123456"))){
            System.out.println("Adicionado");
        }else{
            System.out.println("Falha");
        }

        System.out.println(dao.listarUsuarios());

    }
}