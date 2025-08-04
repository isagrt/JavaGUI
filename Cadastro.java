/* FAZEL UMA TELA DE CADASTRO DE USUaRIO, onde o usuario insere nome, email e data de nascmento(inserir calendario), ao lado insere a foto do usuario no cadastro, 
ou seja, só botar uma imagem qualquer e abaixo um gif do snooppy dançando  com um botão para submitir */

import javax.swing.*;
import java.awt.*;
public class Cadastro {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Usuario");
        frame.setSize(800, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
        JPanel principal = new JPanel();
        principal.setBackground(new Color(214, 208, 214));
        principal.setLayout(new BorderLayout(10, 10));

        JPanel infos = new JPanel();
        infos.setBackground (new Color(199, 171, 199));
        infos.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        infos.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 1, 15, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;

        //Titulo
        JLabel title = new JLabel("Cadastrar");
        title.setFont(new Font("Verdana", Font.BOLD, 20));
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridwidth = 2;
        infos.add(title, gbc);
        gbc.gridy++;
        gbc.gridwidth = 1;

        //Nome
        JLabel name = new JLabel("Nome: ");
        name.setFont(new Font("Verdana", Font.BOLD, 18));
        JTextField nameField = new JTextField(15);
        nameField.setFont(new Font("Verdana", Font.PLAIN, 15));
        nameField.setPreferredSize(new Dimension(150, 25));

        infos.add(name, gbc);
        gbc.gridx = 1;
        infos.add(nameField, gbc);
        gbc.gridy++;
        gbc.gridx = 0;

        //Email
        JLabel email = new JLabel("Email: ");
        email.setFont(new Font("Verdana", Font.BOLD, 18));
        JTextField emailField = new JTextField(15);
        emailField.setFont(new Font("Verdana", Font.PLAIN, 15));
        emailField.setPreferredSize(new Dimension(150, 25));

        infos.add(email, gbc);
        gbc.gridx = 1;
        infos.add(emailField, gbc);
        gbc.gridy++;
        gbc.gridx = 0;

        //Pais
        JLabel paises = new JLabel("Pais: ");
        paises.setFont(new Font("Verdana", Font.BOLD, 18));
        String[] countries = {"Selecione uma opcao", "Alemanha", "Argentina", "Australia", "Brasil", "Canada", "China", "Espanha", "Franca", "India", "Italia"};
        JComboBox<String> countriesList = new JComboBox<>(countries);
        countriesList.setFont(new Font("Verdana", Font.PLAIN, 15));
        countriesList.setPreferredSize(new Dimension(150, 25));

        infos.add(paises, gbc);
        gbc.gridx = 1;
        infos.add(countriesList, gbc);
        gbc.gridy++;
        gbc.gridx = 0;

        //Data de nascimento
        JLabel dataLabel = new JLabel("Nascimento: ");
        dataLabel.setFont(new Font("Verdana", Font.BOLD, 18));
        JSpinner dataSpinner = new JSpinner(new SpinnerDateModel());
        dataSpinner.setFont(new Font("Verdana", Font.PLAIN, 15));
        dataSpinner.setPreferredSize(new Dimension(150, 25));
        JSpinner.DateEditor editor = new JSpinner.DateEditor(dataSpinner, "dd/MM/yyyy");
        dataSpinner.setEditor(editor);

        infos.add(dataLabel, gbc);
        gbc.gridx = 1;
        infos.add(dataSpinner, gbc);
        gbc.gridy++;
        gbc.gridx = 0;

        //Telefone
        JLabel telefoneLabel = new JLabel("Telefone: ");
        telefoneLabel.setFont(new Font("Verdana", Font.BOLD, 18));
        JTextField telefoneField = new JTextField();
        telefoneField.setFont(new Font("Verdana", Font.PLAIN, 15));
        telefoneField.setPreferredSize(new Dimension(150, 25));

        infos.add(telefoneLabel, gbc);
        gbc.gridx = 1;
        infos.add(telefoneField, gbc);
        gbc.gridy++;
        gbc.gridx = 0;

        //Senha
        JLabel senhaLabel = new JLabel("Senha: ");
        senhaLabel.setFont(new Font("Verdana", Font.BOLD, 18));
        JPasswordField senhaField = new JPasswordField(15);
        senhaField.setFont(new Font("Verdana", Font.PLAIN, 15));
        senhaField.setPreferredSize(new Dimension(150, 25));

        infos.add(senhaLabel, gbc);
        gbc.gridx = 1;
        infos.add(senhaField, gbc);
        gbc.gridy++;


        //Panel que agrupa os outros dois panel a direita
        JPanel right = new JPanel();
        right.setBackground(new Color(214, 208, 214));
        right.setLayout(new BoxLayout(right, BoxLayout.Y_AXIS));

        //Foto do usuario
        JPanel picture = new JPanel();
        picture.setPreferredSize(new Dimension(300, 350));
        picture.setBackground(new Color(199, 171, 199));
        picture.setMaximumSize(new Dimension(Short.MAX_VALUE, 350));
        picture.setBorder(BorderFactory.createLineBorder(Color.black, 2));

        ImageIcon origialImage = new ImageIcon("C:\\RepositórioIsadora\\JavaGUI\\JavaGUI\\midia\\gato.jpg"); 
        Image img = origialImage.getImage();
        Image imgRedimensionada = img.getScaledInstance(290, 340, Image.SCALE_SMOOTH);

        ImageIcon image = new ImageIcon(imgRedimensionada);

        JLabel imagemLabel = new JLabel(image); 

        picture.add(imagemLabel, BorderLayout.CENTER);
        //Snoopy panel 
        JPanel snoopySubmit = new JPanel();
        snoopySubmit.setPreferredSize(new Dimension(300, 350));
        snoopySubmit.setBackground(new Color(199, 171, 199));
        snoopySubmit.setMaximumSize(new Dimension(Short.MAX_VALUE, 350));
        snoopySubmit.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        
        JLabel gifLabel = new JLabel();
        ImageIcon icon = new ImageIcon("C:\\RepositórioIsadora\\JavaGUI\\JavaGUI\\midia\\dancing-snoopy.gif");
        gifLabel.setIcon(icon);

        

        snoopySubmit.add(gifLabel);

        right.add(picture);
        right.add(Box.createVerticalStrut(10));
        right.add(snoopySubmit);

        principal.add(right, BorderLayout.EAST);
        principal.add(infos, BorderLayout.CENTER);//adiciona infos e alinha ao centro
        

        frame.add(principal);
        frame.setVisible(true);
    }
}
