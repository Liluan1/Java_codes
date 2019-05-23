package com;

public class Main_2 {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("liluan");
        str.append("lxm");
        str.replace(0,1,"L");
        str.insert(0,1);
        System.out.println(str);
    }
}
