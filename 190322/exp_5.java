package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Main_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        double[][] b = new double[4][2];
        for(int i=0;i<2;++i){
            for(int j=0;j<4;++j){
                b[j][i] = a[i][j];
            }
        }
        String str = sc.next();
//        System.out.print(str);
        int num = sc.nextInt();
        double max = 0;
        if(str == "column"){
            max = Arrays.stream(b[num-1]).max().getAsDouble();
        }
        else if(str == "row"){
            max = Arrays.stream(a[num-1]).max().getAsDouble();
        }
        else if(str == "+cross"){
            for(int i=0;i<4;++i){
                if(a[i][i] > max){
                    max = a[i][i];
                }
            }

        }
        else if(str == "-cross"){
            for(int i=0;i<4;++i){
                if(a[i][3-i] > max){
                    max = a[i][3-i];
                }
            }
        }
        else if(str == "all"){
            for(int i=0;i<4;++i) {
                max = Math.max(Arrays.stream(a[0]).max().getAsDouble(),max);
            }
        }
        System.out.println(max);
    }
}
