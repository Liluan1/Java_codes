public class Main_3 {
    public static void main(String[] args){
        Alpha a = new Alpha(1);
        Alpha b = new Alpha(2);
        System.out.println(a.isEqualto(b));
    }
}

class Alpha {
    private int privateVar;
    Alpha(int _privateVar){
        privateVar = _privateVar;
    }
    boolean isEqualto(Alpha another){
        if (this.privateVar == another.privateVar) {
            return true;
        }
        else {
            return false;
        }
    }
}
