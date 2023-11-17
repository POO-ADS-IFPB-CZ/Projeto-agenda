package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel label1;

    public TelaLogin() {
        setContentPane(contentPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Tela de Login");

        ImageIcon icone = new ImageIcon("imagens/iconelogin.png");
        setIconImage(icone.getImage());

        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou em ok");
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou em criar conta");
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
