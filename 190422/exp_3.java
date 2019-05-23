abstract class Square{
    void getS(){
    }
}

class Tri extends Square{
    double a, b, c;
    Tri(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void getS(){
        double p = (a+b+c)/2;
        double s = Math.sqrt((p-a)*(p-b)*(p-c));
        System.out.println(s);
    }
}

class  Cir extends Square{
    int r;
    Cir(int r){
        this.r = r;
    }
    void getS(){
        double s = Math.PI*r*r;
        System.out.println(s);
    }
}

public class exp_3{
    public static void main(String[] args){
        Square a = new Tri(2, 2, 3);
        a.getS();
        a = new Cir(1);
        a.getS();
    }
}
