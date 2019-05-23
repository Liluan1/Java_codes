package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;++i){
            a[i] = sc.nextInt();
        }
        List l = new ArrayList();
        for(int i=0;i<n;++i){
            if(!l.contains(a[i])){
                l.add(a[i]);
            }
        }
        for(int i=0;i<l.size();++i){
            System.out.print(l.get(i)+" ");
        }
    }
}
