package view;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        ImageIcon imageIcon = new ImageIcon("icone.png");

//        JOptionPane.showMessageDialog(null,
//                "Hello World!", "Mensagem do sistema",
//                JOptionPane.PLAIN_MESSAGE, imageIcon);

//        String nomes[] = {"João", "Maria", "Pedro", "Ana"};
//
//        String nome = (String) JOptionPane.showInputDialog(null,
//                "Informe seu nome:", "Entrada de dados",
//                JOptionPane.QUESTION_MESSAGE, null,nomes,
//                nomes[0]);
//        JOptionPane.showMessageDialog(null,
//                "Bem vindo, "+nome);

        int retorno = JOptionPane.showConfirmDialog(null,
                "Deseja continuar?", "Mensagem do sistema",
                JOptionPane.YES_NO_OPTION);

        if(retorno == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,
                    "Escolheu sim");
        }
        if(retorno == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,
                    "Escolheu não");
        }
        if(retorno == JOptionPane.CLOSED_OPTION){
            JOptionPane.showMessageDialog(null,
                    "Fechou");
        }

    }
}