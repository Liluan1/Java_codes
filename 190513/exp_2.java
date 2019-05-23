import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class exp_2 extends Frame implements ActionListener {
    Panel p1 = new Panel();
    Panel p2 = new Panel();
    Button[] b = new Button[]{new Button("7"),new Button("8"),
    new Button("9"),new Button("+"),
    new Button("4"),new Button("5"),new Button("6"),new Button("-"),
    new Button("1"),new Button("2"),new Button("3"),new Button("*"),
    new Button("0"),new Button("."),new Button("="),new Button("/")};
    exp_2(){
        setLayout(new BorderLayout());
        p1.add(new TextField(30));
        add(p1,BorderLayout.NORTH);
        WindowCloser w = new WindowCloser();
        addWindowListener(w);
        p2.setLayout(new GridLayout(4,4,4,4));
        for(int i=0;i<b.length;++i){
            p2.add(b[i]);
        }
        add(p2);
        setSize(500,500);
        setVisible(true);
        for(int i=0;i<b.length;++i){
            b[i].addActionListener(this);
        }
    }
    public static void main(String[] args) {
        new exp_2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

class WindowCloser extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}
