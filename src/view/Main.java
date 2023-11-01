package view;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        File file = new File("teste.txt");

        // Criando o arquivo
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException exception){
                System.out.println("Falha ao criar arquivo");
            }
        }

        List<String> lista = List.of("João", "Maria", "Pedro");

        //Escrever no arquivo
        try{
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(file)
            );
            out.writeObject(lista);
        }catch(IOException exception){
            System.out.println("Falha ao escrever no arquivo");
        }

    }
}