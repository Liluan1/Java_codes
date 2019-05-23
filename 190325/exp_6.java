package com;

public class Main_6 {
    public static void main(String[] args){
        String str = "liluan";
        StringBuffer str_2 = new StringBuffer("lxm");
        append(str, str_2, "1234");
    }
    private static void append(String target_1, StringBuffer target_2, String str){
        target_1 += str;
        target_2.append(str);
        System.out.println(target_1);
        System.out.println(target_2);

    }
}
