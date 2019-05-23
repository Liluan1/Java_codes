package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        for(int i=0;i<str.length()-1;++i){
            if((Character.isDigit(str.charAt(i)) && Character.isLetter(str.charAt(i+1))) || (Character.isLetter(str.charAt(i)) && Character.isDigit(str.charAt(i+1)))){
                str = str.substring(0,i+1)+'_'+str.substring(i+1);
            }
        }
        String[] strs = str.split(" ");
        for(int i=0;i<strs.length;++i){
            if(strs[i].length() > 1 && Character.isLetter(strs[i].charAt(0))) {
                strs[i] = strs[i].substring(0, 1).toLowerCase() + strs[i].substring(1);
            }
        }
        List<String> list = new ArrayList<String>();
        for(int i=0;i<strs.length;++i) {
            if (!strs[i].equals("")) {
                list.add(strs[i]);
                list.add(" ");
            }
        }
        strs = list.toArray(new String[1]);
        String new_str = "";
        for(int i=0;i<strs.length;++i){
            new_str += strs[i];
        }
        System.out.println(new_str);
    }
}
