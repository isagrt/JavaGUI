import javax.swing.*;
import java.awt.*;
public class Cadastro {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Usuario");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel infos = new JPanel();
        infos.setBackground(Color.GRAY);
        infos.setLayout(new GridBagLayout());

        JLabel name = new JLabel();
        name.setText("Nome: ");
        name.

        JTextField nameFild = new JTextField();

        frame.add(infos);
        frame.setVisible(true);
    }
}
