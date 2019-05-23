import java.awt.*;
import java.awt.event.*;

public class MyCaculator extends Frame {
	private int add = 1, sub = 2, mul = 3, div = 4;
	private int op = 0;		//上一次操作
	boolean ifOp; 		// 是否刚进行了操作
	private String output = "0";	//显示的数
	private Button[] b = new Button[] { new Button("7"), new Button("8"), new Button("9"), new Button("+"),
			new Button("4"), new Button("5"), new Button("6"), new Button("-"), new Button("1"), new Button("2"),
			new Button("3"), new Button("*"), new Button("0"), new Button("."), new Button("="), new Button("/") };
	private Panel pt = new Panel();
	private Panel pb = new Panel();
	private TextField tf = new TextField("");

	private MyCaculator() {
		pt.setLayout(new BorderLayout());
		pt.add(tf);
		this.add(pt, BorderLayout.NORTH);
		pb.setLayout(new GridLayout(4, 4));
		for (int i = 0; i < b.length; i++) {
			pb.add(b[i]);
			if (i == 3 || i == 7 || i == 11 || i == 15 || i == 14)
				b[i].addActionListener(new Operate_Act());
			else
				b[i].addActionListener(new Number_Act());
		}
		this.add(pb, BorderLayout.CENTER);
		this.setSize(400, 400);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	private void operate(String x) {
		double x1 = Double.valueOf(x);		//代表本次一次输入的数
		double y = Double.valueOf(output);	//上一次输入的数
		switch (op) {
		case 0:
			output = x;
			break;
		case 1:
			output = String.valueOf(y + x1);
			break;
		case 2:
			output = String.valueOf(y - x1);
			break;
		case 3:
			output = String.valueOf(y * x1);
			break;
		case 4:
			if (x1 != 0)
				output = String.valueOf(y / x1);
			else
				output = "除数不能为0";
			break;
		}
	}

	public String add(String x) {
		operate(x);
		op = add;
		return output;
	}

	public String subtract(String x) {
		operate(x);
		op = sub;
		return output;
	}

	public String multiply(String x) {
		operate(x);
		op = mul;
		return output;
	}

	public String divide(String x) {
		operate(x);
		op = div;
		return output;
	}

	public String Equals(String x) {
		operate(x);
		op = 0;
		return output;
	}

	public void opClean() {
		op = 0;
		output = "0";
	}

	class Operate_Act implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b[3]) {
				tf.setText(add(tf.getText()));
				ifOp = true;
			} else if (e.getSource() == b[7]) {
				tf.setText(subtract(tf.getText()));
				ifOp = true;
			} else if (e.getSource() == b[11]) {
				tf.setText(multiply(tf.getText()));
				ifOp = true;
			} else if (e.getSource() == b[15]) {
				tf.setText(divide(tf.getText()));
				ifOp = true;
			} else if (e.getSource() == b[14]) {
				tf.setText(Equals(tf.getText()));
				ifOp = true;
			}
		}
	}

	class Number_Act implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Button tempb = (Button) e.getSource();
			if (ifOp) {
				tf.setText(tempb.getLabel()); // 获取此按钮的标签
				ifOp = false;
			} else {
				tf.setText(tf.getText() + tempb.getLabel());
			}
		}
	}

	public static void main(String[] args) {
		new MyCaculator();
	}
}
