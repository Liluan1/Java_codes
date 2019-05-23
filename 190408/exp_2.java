public class Main_2 {
    public static void main(String[] args){
        Tri t = new Tri(2,3,4);
        //直接调用 class Tri 中的 print 函数计算面积
        t.print();

        //调用公共函数在类外计算面积
        double la = t.get_la();
        double lb = t.get_lb();
        double lc = t.get_lc();
        double p = (la+lb+lc)/2;
        double s = Math.sqrt(p*(p-la)*(p-lb)*(p-lc));
        System.out.println(s);
    }
}

class Tri {
    private double la;
    private double lb;
    private double lc;
    Tri(double a, double b, double c){
        la = a;
        lb = b;
        lc = c;
    }
    double get_la(){
        return la;
    }

    double get_lb(){
        return lb;
    }

    double get_lc(){
        return lc;
    }

    void print(){
        double p = (la+lb+lc)/2;
        double s = Math.sqrt(p*(p-la)*(p-lb)*(p-lc));
        System.out.println(s);
    }
}

