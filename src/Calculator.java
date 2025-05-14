import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends  JFrame {
    private JPanel Jpanel2;
    private JButton sumaButton;
    private JButton roznicaButton;
    private JButton wyjscieButton;
    private JTextField inputA;
    private JTextField inputB;
    private JLabel wynikLbl;

    public Calculator (){
        super("Prosty kalkulator");
        this.setContentPane(this.Jpanel2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, heigth = 300;
        this.setSize(width, heigth);
      String textA = inputA.getText().trim() ;
        String textB = inputB.getText().trim() ;
      sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(inputA.getText());
                valueB = Double.parseDouble(inputB.getText());
                score  = valueA + valueB;
                wynikLbl.setText(" Suma "+ String.valueOf(valueA) + "+"
                + String.valueOf(valueB) + "=" + String.valueOf(score));


            }
        });
        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }


}
