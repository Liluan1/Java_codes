class ex1
{
	public static void main(String[] args){
		A a = new A(1,2,3,4);
		//System.out.println(a.a);
		System.out.println(a.geta());
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
	}
}

class A
{
	private int a;
	public int b;
	protected int c;
	int d;
	A(int a, int b, int c, int d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	int geta(){
		return a;
	}
}
