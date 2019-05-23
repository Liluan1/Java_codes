package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int n;
        n = sc.nextInt();
        for(int i=0;i<n;++i){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a,0,n);
        System.out.println(a[0]+" "+a[n-1]);
//        System.out.print(a[n-1]+" ");
        for(int i=0;i<n;++i){
            System.out.print(a[i]+" ");
        }
    }
}
