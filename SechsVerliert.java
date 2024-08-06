import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SechsVerliert implements ActionListener {

    JFrame jframe;
    JTextField textField, textField2, textField3;
    JButton weiter, stop;
    JPanel jpanel;

    Font myFont_textField = new Font("Rubik", Font.BOLD, 20);
    Font myFont_Button = new Font("Rubik", Font.BOLD, 20);

    SechsVerliert() {

        jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setSize(600, 500);
        jframe.setLayout(null);
        jframe.setTitle("6 verliert");
        jframe.setVisible(true);
        jframe.setResizable(false);

    }

    public static void main(String[] args) {

        new SechsVerliert();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
