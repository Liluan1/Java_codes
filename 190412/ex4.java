class Rec extends Object{
    double l;
    double w;
    Rec(double l, double w){
        this.l = l;
        this.w = w;
    }
    double S(){
        return l*w;
    }
}

class Cir extends Object{
    double x,y;
    double r;
    Cir(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    double S(){
        return Math.PI*r*r;
    }
}

class Arr{
    double l;
    double w;
    double x;
    double y;
    double r;
    int i;
    Rec _r;
    Cir _c;
    Arr(double l ,double w, double x, double y, double r, int i){
        this.l = l;
        this.w = w;
        this.x = x;
        this.y = y;
        this.r = r;
        this.i = i;
        _r = new Rec(l, w);
        _c = new Cir(x, y, r);
    }

}

class ex4{
    public static void main(String[] args){
        Arr a = new Arr(1.0, 1.0, 1.0, 1.0, 1.0, 1);
        System.out.println(a.l);
        System.out.println(a._r.S());
        System.out.println(a._c.S());
        System.out.println(a.i);
    }
}
