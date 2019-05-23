public class Main_1 {
    public static void main(String[] args){
        Address a = new Address("liluan", "liluan@123.com");
        a.print();
    }
}

class Address {
    String name;
    String email;

    Address(String n, String e){
        name = n;
        email = e;
    }
    void print(){
        System.out.printf("%s %s", name, email);
    }
}
