public class Main_4 {
    public static void main(String[] args){
        AnIntegerNamedX myX = new AnIntegerNamedX();
        AnIntegerNamedX anotherX = new AnIntegerNamedX();
        myX.setX(1);
        anotherX.x = 2;
        System.out.println(myX.x());
        System.out.println(anotherX.x());
    }
}

class AnIntegerNamedX {
    static int x;
    public int x(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
}
