import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class primeiroApp{
    public static void main(String[] args) {
        System.out.println("Ola mundo GUI");
        JFrame frame = new JFrame("Minha Primeira Janela"); //cria a tela principal
        frame.setSize(400, 300); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerra o programa assim que fecha a janela

        JPanel panel = new JPanel();
        JButton button = new JButton("OIE, NAMOLINDA<3!"); //cria botão e insere uma label para ele
        
        panel.add(button); //adiciona button dentro de panel
        frame.add(panel); //adiciona panel dentro do frame

        
        

        frame.setVisible(true); //setVisible sempre localizado no fim do código
    }

}