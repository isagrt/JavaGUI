import javax.swing.*;
import java.awt.*;



public class primeiroApp{
    public static void main(String[] args) {
        System.out.println("Ola mundo GUI");
        JFrame frame = new JFrame("Minha Primeira Janela"); //cria a tela principal
        frame.setSize(700, 500); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerra o programa assim que fecha a janela

        JPanel panel = new JPanel();
        panel.setBackground(Color.pink);
        panel.setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    
        JButton button = new JButton("botao 1"); //cria botão e insere uma label para ele

        button.setBackground(Color.lightGray);
        button.setForeground(Color.black);
        button.setPreferredSize(new Dimension(200,50));

        //adiciona um Listener no click do botão
        button.addActionListener(e -> { //e recebe o retorno da ação da função
            JOptionPane.showMessageDialog(null, "AVISO", "Titulo", 3);
        });

        JTextArea textArea = new JTextArea("Escreva algo!");
        JTextArea textArea1 = new JTextArea("Escreva algo!");

        JLabel label = new JLabel("Digite o seu nome: ");
        label.setFont(new Font("Serif", Font.BOLD, 36));
        
        JTextField textField = new JTextField(10); //define o tamanho do nosso campo de texto
        textField.setFont(new Font("Serif", Font.BOLD, 36));

        //adicionar em forma crescente do botão ao frame para nenhum se sobressair
        formPanel.add(label);
        formPanel.add(textField);
        
        panel.add(formPanel, BorderLayout.NORTH);
        panel.add(textArea1, BorderLayout.WEST);
        panel.add(textArea, BorderLayout.EAST);
        panel.add(button, BorderLayout.SOUTH); //adiciona button dentro de panel
        frame.add(panel); //adiciona panel dentro do frame
        frame.setLocationRelativeTo(null);

        
        

        frame.setVisible(true); //setVisible sempre localizado no fim do código
        //JOptionPane.showMessageDialog(null, "AVISO", "Titulo", 3); // é uma janela pronta de splash, mostra avisos
    }

}