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
        infos.setLayout(new BoxLayout(infos, BoxLayout.Y_AXIS));
        infos.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        JLabel title = new JLabel("Cadastrar:");
        JLabel blank = new JLabel(" ");
        title.setFont(new Font("Verdana", Font.BOLD, 15));
        title.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel name = new JLabel();
        name.setText("Nome: ");
        name.setFont(new Font("Verdana", Font.BOLD, 18));

        JTextField nameField = new JTextField(15);
        nameField.setFont(new Font("Verdana", Font.BOLD, 15));
        Dimension nameSize = new Dimension(150, 25);
        nameField.setMaximumSize(nameSize);
        nameField.setPreferredSize(nameSize);
        nameField.setAlignmentX(Component.LEFT_ALIGNMENT);

        JPanel nomeLinha = new JPanel(new FlowLayout(FlowLayout.LEFT));
        nomeLinha.add(name);
        nomeLinha.add(nameField);

        JLabel email = new JLabel();
        email.setText("Email: ");
        email.setFont(new Font("Verdana", Font.BOLD, 18));

        JTextField emailField = new JTextField(15);
        emailField.setFont(new Font("Verdana", Font.BOLD, 15));
        emailField.setPreferredSize(new Dimension(150, 25));
        emailField.setAlignmentX(Component.LEFT_ALIGNMENT);
        Dimension emailSize = new Dimension(200, 30);
        emailField.setMaximumSize(emailSize);
        emailField.setPreferredSize(emailSize);
        
        JPanel emailLinha = new JPanel(new FlowLayout(FlowLayout.LEFT));
        emailLinha.add(email);
        emailLinha.add(emailField);

        JLabel paises = new JLabel();
        paises.setText("Pais: ");
        paises.setFont(new Font("Verdana", Font.BOLD, 18));

        String [] countries = {"Selecione uma opcao","Alemanha", "Argentina", "Australia", "Brasil", "Canada", "China", "Espanha", "Franca", "India", "Italia"};
        JComboBox<String> countriesList = new JComboBox<>(countries);
        countriesList.setFont(new Font("Verdana", Font.PLAIN, 15));
        countriesList.setPreferredSize(new Dimension(150, 25));
        countriesList.setMaximumSize(new Dimension(150, 25));

        JPanel paisLinha = new JPanel(new FlowLayout(FlowLayout.LEFT));
        paisLinha.add(paises);
        paisLinha.add(countriesList);

        JLabel dataLabel = new JLabel("Nascimento: ");
        dataLabel.setFont(new Font("Verdana", Font.BOLD, 18));

        JSpinner dataSpinner = new JSpinner(new SpinnerDateModel());
        dataSpinner.setFont(new Font("Verdana", Font.PLAIN, 15));
        dataSpinner.setPreferredSize(new Dimension(150, 25));
        dataSpinner.setMaximumSize(new Dimension(150, 25));
        dataSpinner.setAlignmentX(Component.LEFT_ALIGNMENT);

        JSpinner.DateEditor editor = new JSpinner.DateEditor(dataSpinner, "dd/MM/yyyy");
        dataSpinner.setEditor(editor);

        JPanel dataLinha = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        dataLinha.add(dataLabel);
        dataLinha.add(dataSpinner);
        
        JLabel senhaLabel = new JLabel("Senha: ");
        senhaLabel.setFont(new Font("Verdana", Font.BOLD, 18));

        JPasswordField senhaField = new JPasswordField(15);
        senhaField.setFont(new Font("Verdana", Font.PLAIN, 15));
        senhaField.setPreferredSize(new Dimension(200, 30));
        senhaField.setMaximumSize(new Dimension(200, 30));

        JPanel senhaLinha = new JPanel(new FlowLayout(FlowLayout.LEFT));
        senhaLinha.add(senhaLabel);
        senhaLinha.add(senhaField);


        infos.add(title);
        infos.add(blank);
        infos.add(nomeLinha);
        infos.add(emailLinha);
        infos.add(paisLinha);
        infos.add(dataLinha);
        infos.add(senhaLinha);

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
