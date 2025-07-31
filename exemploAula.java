import javax.swing.*;
import java.awt.*;

public class exemploAula {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Swing");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(new GridBagLayout());

        JLabel label = new JLabel();
        label.setText("O que voce acha sobre Java Swing? ");

        JTextArea textArea = new JTextArea(5,20);
        
        JButton button = new JButton("OK");
        button.addActionListener(e -> JOptionPane.showMessageDialog(null, "Botão clicado!"));

        
        panel.add(label);
        panel.add(textArea);
        panel.add(button);

        
        frame.add(panel);
        frame.setVisible(true);
    }

}
