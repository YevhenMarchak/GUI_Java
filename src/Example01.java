import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example01 extends JFrame{


    private JPanel JPanel1;
    private JButton okButton;
    private JButton witajButton;
    private JPanel JPanelLabel;
    private JButton klickButton;
    private JButton button1;

    public Example01(){
        super("Moje pierwsze GUI");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       int width = 400, heigth = 300;
        this.setSize(width, heigth);
        //this.pack();

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = JOptionPane.showInputDialog("Podaj imię: ");
              //  JOptionPane.showMessageDialog(null,"Witaj "+ text, "Tytuł",JOptionPane.WARNING_MESSAGE);

                int a = JOptionPane.showConfirmDialog(null,"Wpisano dane: " + text , "To jest moje okno",JOptionPane.YES_NO_OPTION);

            }
        });
        witajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {




            }
        });

    }
}
