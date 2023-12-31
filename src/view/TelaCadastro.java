package view;

import dao.UsuarioDao;
import exception.UsuarioExisteException;
import model.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Arrays;

public class TelaCadastro extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField campoEmail;
    private JPasswordField campoSenha1;
    private JPasswordField campoSenha2;
    private JLabel label1;
    private UsuarioDao dao;

    public TelaCadastro() {
        try {
            dao = new UsuarioDao();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(contentPane, "Falha ao abrir arquivo",
                    "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Arrays.equals(campoSenha1.getPassword(), campoSenha2.getPassword())){
                    Usuario usuario = new Usuario(campoEmail.getText(),
                            new String(campoSenha1.getPassword()));
                    try {
                        if (dao.addUsuario(usuario)) {
                            JOptionPane.showMessageDialog(contentPane,
                                    "Salvo com sucesso");
                            dispose();
                        }
                    }catch (UsuarioExisteException exception) {
                        JOptionPane.showMessageDialog(contentPane, exception.getMessage(),
                                "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(contentPane, "As senhas precisam ser iguais",
                            "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        label1 = new JLabel();
        ImageIcon icon = new ImageIcon("imagens/perfil.png");
        label1.setIcon(icon);

    }
}
