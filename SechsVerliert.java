import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class SechsVerliert implements ActionListener{

    JFrame frame;
    JTextField text_wurf, text_amZug, text_Leben_S1, text_Leben_S2, textErgebnis;
    JButton naechsterWurf, beenden;
    JLabel label;
    JPanel panel;

    Font wurf_font = new Font("Rubik", Font.BOLD, 150);
    Font text = new Font("Rubik", Font.ITALIC, 36);

    int leben_S1 = 3;
    int leben_S2 = 3;

    SechsVerliert(){

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(400, 150);
        frame.setSize(500, 750);
        frame.setLayout(null);
        frame.setTitle("6 verliert!");
        frame.setBackground(Color.DARK_GRAY);
        frame.getContentPane().setBackground(Color.DARK_GRAY);


        //Textfeld für die Würfelzahl
        text_wurf = new JTextField("-");
        text_wurf.setBounds(200, 50, 200, 280);
        text_wurf.setFont(wurf_font);
        text_wurf.setEditable(false);


        label = new JLabel("Spieler 1 ist an der Reihe.");
        label.setBounds(10, 400, 200, 50);
        text_amZug = new JTextField("Hi");
        text_amZug.setBounds(10, 400, 600, 50);
        text_amZug.setFont(text);
        text_amZug.setEditable(false);

        panel = new JPanel();
        panel.setBounds(25, 25, 440, 650);
        panel.setLayout(new GridLayout(4, 3, 10, 10));
        panel.setBackground(Color.gray);
        
        panel.add(text_wurf);
        panel.add(label);
        panel.add(text_amZug);
        //panel.add(text_Leben_S1);
        //panel.add(text_Leben_S2);

        //panel.add(naechsterWurf);
       //panel.add(beenden);

        frame.add(panel);
        frame.setVisible(true);
        frame.setResizable(false);


        
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