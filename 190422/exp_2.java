class Vehicle{
    double speed;
    boolean sail;
    boolean capability;
    Vehicle(){
        System.out.println("Vehicle");
    }
    void start(){
        System.out.println("start");
    }
    void travel(){
        System.out.println("travel");
    }
    void stop(){
        System.out.println("stop");
    }
}

class car extends Vehicle{
    car(){
        speed = 10;
        sail = true;
        capability = true;
        System.out.println("car");
    }
    void travel(){
        System.out.println("car travel");
    }
}

class ship extends Vehicle{
    ship(){
        System.out.println("ship");
    }
    void travel(){
        System.out.println("ship travel");
    }
}

class plane extends Vehicle{
    plane(){
        System.out.println("plane");
    }
    void travel(){
        System.out.println("plane travel");
    }
}

public class exp_2 {
    public static void main(String[] args){
        car a = new car();
        a.travel();
        ship b = new ship();
        b.travel();
        plane c = new plane();
        c.travel();
        Vehicle d = new Vehicle();
        d.travel();
        d = a;
        d.travel();
    }
}
