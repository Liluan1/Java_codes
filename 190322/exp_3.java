package com.company;

import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        int sum = 0, num = 0;
        while(!sc.hasNext("#")){
            str = sc.next();
            sum += str.length();
            num ++;
        }
        System.out.println(sum/num);
    }
}
