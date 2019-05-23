class Person { // 定义Person类
	protected String name; // 姓名
	protected String sex; // 性别
	protected int age; // 年龄

	public Person() // 构造方法
	{
		System.out.println("调用父类无参构造函数");
	}

	public Person(String n, String s, int a) { // 构造方法
		name = n;
		sex = s;
		age = a;
	}

	public void showMe() { // 显示人员信息
		System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age);
	}
}

class Student extends Person { // 定义Student(学生)类，是Person类的子类
	private String department;// 系别
	private String specialty;// 专业

	public Student(String n, String s, int a, String dep, String spe) { // 定义学生类的构造方法
		//super(n,s,a);
		name = n;
		sex = s;
		age = a;
		department = dep;
		specialty = spe;
	}

	public void showMe() {// 显示学生类数据成员
		System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age + "，系别：" + department + "，专业：" + specialty);
	}
}

public class exp_1 {
	public static void main(String args[]) {
		Person person1 = new Person("王兰", "女", 16);
		person1.showMe();
		Student student1 = new Student("张三", "男", 18, "计算机", "软件开发");
		student1.showMe();
	}
}
