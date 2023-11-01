package view;

import dao.UsuarioDao;
import model.Usuario;

public class Main {
    public static void main(String[] args) {

        UsuarioDao dao = new UsuarioDao();

//        if(dao.addUsuario(new Usuario("pedro@gmail.com", "123456"))){
//            System.out.println("Salvo com sucesso");
//        }else{
//            System.out.println("Falha ao salvar");
//        }

        System.out.println(dao.listarUsuarios());

    }
}