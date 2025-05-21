import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField loginLbl;
   private JPasswordField passwordField;
    private JButton closeButton;
    private JButton loginButton;
    private JPanel JPanel1;

    String user = "admin", password = "admin";

    public LoginForm(){
        super("Login");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, heigth = 300;
        this.setSize(width, heigth);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String userInput = loginLbl.getText();
               String passwordInput = new String(passwordField.getPassword());

               if(userInput.equals(user) && passwordInput.equals(password)){
                   //otwarcie nowego okna
                   dispose();
                   MenuForm menuForm = new MenuForm();
                   menuForm.setVisible(true);


               }
            }
        });
    }




}
