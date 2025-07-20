package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        evenNumbers(20);
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

}