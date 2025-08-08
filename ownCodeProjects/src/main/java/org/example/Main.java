package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        compairString();
    }
    private static void printOneToTen(){
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }
    private static void evenNumbers(int n){
        for(int i = 0; i <= n; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    private static String joinWords(String [] words){
        StringBuilder builder = new StringBuilder();
        for (String w : words){
            builder.append(w);
        }
        return builder.toString();
    }

    private static boolean isPermutation(String s, String t){

        if ( s.length() != t.length()){
            return false;
        }

        return sort(s).equals(sort(t));

    }

    private static String sort(String s){
        char [] words = s.toCharArray();
        Arrays.sort(words);
        return new String(words);
    }

    private static void compairString (){
        String fullName = new String("Ranajit khandual");
        System.out.println(fullName.lines().toString());
    }

}

