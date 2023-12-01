package view;

import dao.UsuarioDao;
import model.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class TelaLogin extends JFrame {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField campoEmail;
    private JPasswordField campoSenha;
    private JLabel label1;
    private UsuarioDao dao;

    public TelaLogin() {
        try {
            dao = new UsuarioDao();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(contentPane, "Falha ao abrir arquivo",
                    "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
        setContentPane(contentPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Tela de Login");

        ImageIcon icone = new ImageIcon("imagens/iconelogin.png");
        setIconImage(icone.getImage());

        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario usuario = dao.buscarPorEmail(campoEmail.getText());

                if(usuario != null){
                    //Usuário existe
                    String senha = new String(campoSenha.getPassword());

                    if(usuario.getSenha().equals(senha)){
                        JOptionPane.showMessageDialog(contentPane,
                                "Bem vindo!");
                    }else{
                        JOptionPane.showMessageDialog(contentPane, "Senha incorreta",
                                "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    // Usuário não existe
                    JOptionPane.showMessageDialog(contentPane,
                            "Usuário não encontrado", "Mensagem de erro",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaCadastro telaCadastro = new TelaCadastro();
                telaCadastro.pack();
                telaCadastro.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        TelaLogin dialog = new TelaLogin();
        dialog.pack();
        dialog.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        label1 = new JLabel();
        ImageIcon iconeCadeado = new ImageIcon("imagens/cadeado.png");
        label1.setIcon(iconeCadeado);

    }

}
