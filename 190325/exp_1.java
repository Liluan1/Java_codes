package com;

import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "Hello, Java!";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.lastIndexOf("Java"));
        System.out.println(str.replace("Java","World"));

    }
}
