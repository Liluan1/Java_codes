package com;

import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str_reverse = new StringBuffer(str).reverse().toString();
        System.out.println(str.equals(str_reverse));
    }
}
