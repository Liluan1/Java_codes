import java.awt.*;
import java.awt.event.*;
public class ProgramWithAnonymousListener extends Frame{
     //构造方法
   public ProgramWithAnonymousListener(){
      addWindowListener(new WindowAdapter() // new关键字后带类型名
                      {  public void windowClosing(WindowEvent we)
                           {  System.exit(0); }
                      }); // 整体作为addWindowListener方法的输入参数
      setSize(200,200);
      setVisible(true);
   }
   public static void main(String args[]){
     ProgramWithAnonymousListener p = new ProgramWithAnonymousListener();
}
}
