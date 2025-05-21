import javax.swing.*;

public class WelcomeForm extends JFrame{
    private JPanel JPanel1;
    private JProgressBar progressBar1;
    private JLabel PleaseWaitLbl;

public WelcomeForm(){
    super("Welcome form");
    this.setContentPane(this.JPanel1);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    int width = 400, heigth = 300;
    this.setSize(width, heigth);
    progression();
    dispose();
    this.setVisible(true);


    //otwarcie nowego formuliarza
    LoginForm loginForm = new LoginForm();
    loginForm.setVisible(true);
}

private void progression(){
    int counter = 0;
    while(counter<=100){
        PleaseWaitLbl.setText("Please wait...");
        progressBar1.setValue(counter);
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        counter += 5;
    }

}


}
