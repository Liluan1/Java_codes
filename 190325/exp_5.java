package com;

public class Main_5 {
    public static void main(String[] args){
        String str = "Hello Java, Java is so cool, I like Java!";
        int length = str.length();
        int cnt = 0;
        int index = 0;
        while(index != -1){
            index = str.indexOf("Java", index);
            if(index != -1){
                cnt++;
                index += 4;
            }
        }
        System.out.println(cnt);
    }
}
