package view;

import dao.UsuarioDao;
import model.Usuario;

public class Main {
    public static void main(String[] args) {

        UsuarioDao dao = new UsuarioDao();

        System.out.println(dao.listarUsuarios());

        Usuario usuario = dao.buscarPorEmail("pedro@gmail.com");
        usuario.setSenha("852741");
        dao.atualizarUsuario(usuario);

        System.out.println(dao.listarUsuarios());

    }
}