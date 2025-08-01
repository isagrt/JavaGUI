/* FAZEL UMA TELA DE CADASTRO DE USUaRIO, onde o usuario insere nome, email e data de nascmento(inserir calendario), ao lado insere a foto do usuario no cadastro, 
ou seja, só botar uma imagem qualquer e abaixo um gif do snooppy dançando  com um botão para submitir */

import javax.swing.*;
import java.awt.*;
public class Cadastro {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Usuario");
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel principal = new JPanel();
        principal.setBackground(Color.GRAY);
        principal.setLayout(new BorderLayout(10,10));

        //INFROMAÇÃO DE USUARIO
        JPanel infos = new JPanel();
        infos.setBackground(Color.pink);
        infos.setLayout(new GridBagLayout());
        infos.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        JLabel name = new JLabel();
        name.setText("Nome: ");
        name.setFont(new Font("Verdana", Font.BOLD, 25));

        JTextField nameField = new JTextField();
        nameField.setFont(new Font("Verdana", Font.BOLD, 20));

        JLabel email = new JLabel();
        email.setText("Email: ");
        email.setFont(new Font("Verdana", Font.BOLD, 25));

        JTextField emailField = new JTextField();
        emailField.setFont(new Font("Verdana", Font.BOLD, 20));

        infos.add(name);
        infos.add(nameField);
        infos.add(email);
        infos.add(emailField);

        //Panel que agrupa os outros dois panel a direita
        JPanel right = new JPanel();
        right.setBackground(Color.GRAY);
        right.setLayout(new BoxLayout(right, BoxLayout.Y_AXIS));

        //Foto do usuario
        JPanel picture = new JPanel();
        picture.setPreferredSize(new Dimension(300, 350));
        picture.setMaximumSize(new Dimension(Short.MAX_VALUE, 350));
        picture.setBorder(BorderFactory.createLineBorder(Color.black, 2));

        //Snoopy label 
        JPanel snoopySubmit = new JPanel();
        snoopySubmit.setPreferredSize(new Dimension(300, 350));
        snoopySubmit.setMaximumSize(new Dimension(Short.MAX_VALUE, 350));
        snoopySubmit.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        
        right.add(picture);
        right.add(Box.createVerticalStrut(10));
        right.add(snoopySubmit);

        principal.add(right, BorderLayout.EAST);
        principal.add(infos, BorderLayout.CENTER); //adiciona infos e alinha ao centro
        

        frame.add(principal);
        frame.setVisible(true);
    }
}
