package exception;

public class UsuarioExisteException extends Exception {

    public UsuarioExisteException(String mensagem){
        super(mensagem);
    }

}