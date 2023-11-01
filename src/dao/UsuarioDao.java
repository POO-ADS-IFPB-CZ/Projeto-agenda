package dao;

import java.io.File;
import java.io.IOException;

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

}
