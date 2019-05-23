package com.company;


import static java.lang.Math.pow;

public class Main_4 {
    public static void main(String[] args){
        int[][] a = {{2,3,4},{4,5,6}};
        int[][] b = {{1,5,2,8},{5,9,10,-3},{2,7,-5,-18}};
        int[][] c = new int[2][4];

        for(int k=0;k<2;++k) {
            for (int i = 0; i < 4; ++i) {
                for (int j = 0; j < 3; ++j) {
                    c[k][i] += a[k][j] * b[j][i];
                }
            }
        }
        for(int i=0;i<2;++i){
            for(int j=0;j<4;++j){
                System.out.printf("%-4d ",c[i][j]);
            }
            System.out.println();
        }
    }
}
