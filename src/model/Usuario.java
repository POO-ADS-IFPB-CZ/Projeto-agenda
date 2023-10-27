package model;

public class Usuario {

    private String email;
    private String senha;
    private Agenda agenda;

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
        agenda = new Agenda();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Agenda getAgenda() {
        return agenda;
    }

}