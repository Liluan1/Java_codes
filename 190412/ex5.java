class List{
    int curr_len;
    int max_len;
    Object[] obj;
    List(int n, Object[] a){
        this.curr_len = n;
        max_len = 65535;
        obj = new Object[max_len];
        for(int i=0;i<n;++i){
            obj[i] = a[i];
        }
    }
    void Insert(int index, Object a){
        if(curr_len+1>max_len){
            return ;
        }
        for(int i=curr_len-1;i>=index-1;--i){
            obj[i+1] = obj[i];
        }
        obj[index-1] = a;
        curr_len++;
    }
    void Delete(int index){
        if(curr_len-1<0){
            return ;
        }
        for(int i=index-1;i<curr_len-1;++i){
            obj[i] = obj[i+1];
        }
        curr_len--;
    }
    void print(){
        for(int i=0;i<curr_len;++i){
            System.out.println(obj[i]);
        }
    }
}

class ex5{
    public static void main(String[] args){
        int n = 5;
        Object[] obj = new Object[n];
        obj[0] = 'c';
        obj[1] = "liluan";
        obj[2] = 1314;
        obj[3] = 1.234;
        obj[4] = 121212121;
        List l = new List(n, obj);
        l.print();
        System.out.println();
        l.Insert(1, 1234);
        l.print();
        System.out.println();
        l.Delete(3);
        l.print();
    }
}
