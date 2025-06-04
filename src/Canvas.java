import javax.swing.*;
import java.awt.*;
import java.sql.Time;
import java.util.Stack;
import java.util.Timer;

public class Canvas extends JPanel {
    //tablica z kolorami
    final Color[] DiSC_COLOR = {
            new Color(0,255,0),
            new Color(255,0,0),
            new Color(255,255,0),
            new Color(0,0,255),
            new Color(127,0,255),
            new Color(255,0,255),
            new Color(0,255,255),
            new Color(155,155,255)

    };

    Graphics2D g2d;
    Timer t;
    int discs_amount = 5;
    int speed = 500;
    int step = 1;
    boolean is_running = false;
    Stack<Integer> pillars;

    public Canvas(){
        this.setBackground(new Color(255,255,255));
        this.reset();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.g2d = (Graphics2D) g;
        this.drawPillars();
        this.drawDiscs();
    }
    private void drawPillarDisc(int i){

    }

    private void drawDiscs(){
        int w = this.getWidth();
        int h = this.getHeight();

    }

    private void drawPillars(){
        int w = this.getWidth();
        int h = this.getHeight();

        this.g2d.setPaint(new Color(142,51,51));
        this.g2d.fillRect(this.getPillPosition(0),0,w/100,h-1);
        this.g2d.fillRect(this.getPillPosition(1),0,w/100,h-1);
        this.g2d.fillRect(this.getPillPosition(3),0,w/100,h-1);
    }

    //metoda do wzracania pozycji x dla każdej wieży

    private int getPillPosition(int n){
        int w = this.getWidth();

        return switch (n){
            case 0

        }

    }

    
}
