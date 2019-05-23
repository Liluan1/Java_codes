import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class exp_3 extends Frame {
    class WindowCloser extends WindowAdapter {      //内部类
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }
    Label l = new Label("Label");
    TextArea t = new TextArea();
    Button b = new Button("Yo,bro");
    exp_3(){
        setSize(400,200);
        setVisible(true);
        setLayout(new GridLayout());
        addWindowListener(new WindowCloser());
        add(t);
        add(b);
        add(l);
        b.addActionListener(new ActionListener() {      //匿名内部类
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!t.getText().equals("")) {
                    l.setText(t.getText());
                }
                else{
                    l.setText("Label");
                }
            }
        });
    }
    public static void main(String[] args){
        exp_3 e = new exp_3();
    }
}
