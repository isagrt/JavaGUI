import javax.swing.*;
import java.awt.*;



public class primeiroApp{
    public static void main(String[] args) {
        System.out.println("Ola mundo GUI");
        JFrame frame = new JFrame("Minha Primeira Janela"); //cria a tela principal
        frame.setSize(400, 300); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerra o programa assim que fecha a janela

        JPanel panel = new JPanel();
        panel.setBackground(Color.pink);
    
        JButton button = new JButton("botao 1"); //cria botão e insere uma label para ele
        JButton button1 = new JButton("botao 2");

        button.setBackground(Color.lightGray);
        button.setForeground(Color.black);
        button.setPreferredSize(new Dimension(200,50));

        
        button1.setBackground(Color.lightGray);
        button1.setForeground(Color.black);
        button1.setPreferredSize(new Dimension(200,50));

        JLabel label = new JLabel("Digite o seu nome: ");
        label.setFont(new Font("Serif", Font.BOLD, 36));
        //adicionar em forma crescente do botão ao frame para nenhum se sobressair
        panel.add(label);
        panel.add(button); //adiciona button dentro de panel
        panel.add(button1);
        frame.add(panel); //adiciona panel dentro do frame

        
        

        frame.setVisible(true); //setVisible sempre localizado no fim do código
        JOptionPane.showMessageDialog(null, "AVISO", "Titulo", 3); // é uma janela pronta de splash, mostra avisos
    }

}