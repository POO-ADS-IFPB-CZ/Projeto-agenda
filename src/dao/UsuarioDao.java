package dao;

import model.Usuario;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

    private File file;

    public UsuarioDao(){
        file = new File("Usuarios");

        // Criando o arquivo
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException exception){
                System.out.println("Falha ao criar arquivo");
            }
        }
    }

    public List<Usuario> listarUsuarios(){
        if(file.length()>0){
            try{
                ObjectInputStream in = new ObjectInputStream(
                        new FileInputStream(file)
                );
                List<Usuario> lista = (List<Usuario>) in.readObject();
                return lista;
            }catch (IOException exception){
                System.out.println(exception);
            }catch (ClassNotFoundException exception) {
                System.out.println(exception);
            }
        }
        return new ArrayList<>();
    }

}
