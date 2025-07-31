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
    
        JButton button = new JButton("OIE CLICA AQUI!"); //cria botão e insere uma label para ele
        JButton button1 = new JButton("oii aqui tambem!");

        button.setBackground(Color.GREEN);
        button.setForeground(Color.MAGENTA);
        button.setPreferredSize(new Dimension(750,50));

        
        button1.setBackground(Color.black);
        button1.setForeground(Color.white);
        button1.setPreferredSize(new Dimension(350,40));

        panel.add(button); //adiciona button dentro de panel
        panel.add(button1);
        frame.add(panel); //adiciona panel dentro do frame

        
        

        frame.setVisible(true); //setVisible sempre localizado no fim do código
    }

}