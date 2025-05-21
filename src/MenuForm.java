import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuForm extends JFrame {
    private JPanel JPanel1;
    private JButton zadanie1Button;
    private JButton zadanie2Button;
    private JButton wylogujButton;
    private JButton closeButton;

    public MenuForm() {
        this.JPanel1 = JPanel1;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, heigth = 300;
        this.setSize(width, heigth);


        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


    }
}
