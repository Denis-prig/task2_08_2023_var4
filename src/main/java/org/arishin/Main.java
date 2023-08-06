package org.arishin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число n");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int  n = Integer.valueOf(number);
        System.out.println("====");
        for(int x =1; x<=n; x++){
            if((x % 3 ==0) && (x % 5==0)){
                System.out.println("FooBar");
            }else if(x % 3 ==0){
                System.out.println("Foo");
            }else if(x % 5 ==0){
                System.out.println("Bar");
            }else{
                System.out.println(x);
            }
        }
    }
}






