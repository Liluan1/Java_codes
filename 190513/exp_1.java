import java.awt.*;
import java.awt.event.*;

public class exp_1 extends Frame implements WindowListener{
    public exp_1(){
        addWindowListener(this);
        setSize(400,400);
        setVisible(true);
        setLayout(new GridLayout());
        Label a = new Label("");
        a.setBackground(Color.RED);
        Label b = new Label("");
        b.setBackground(Color.BLUE);
        Label c = new Label("");
        c.setBackground(Color.YELLOW);
        add(a);
        add(b);
        add(c);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    public void windowClosing(WindowEvent e){
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String[] args){
        exp_1 e = new exp_1();
    }
}
