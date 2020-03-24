package com.CMSL.x00091119;

import java.util.Scanner;

public class Main {

    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Este programa realiza la siguiente secuencia desde 1 hasta n, si n = 3, 1 2 3 2 1" );
        System.out.println("Sabiendo esto, por favor ingrese un número:");
        n = sc.nextInt(); sc.nextLine();

        secuencia(1);
    }
    public static void secuencia(int a){
        System.out.print( a + " ");
        if (a != n) {
            secuencia(a + 1);
            System.out.print(a + " ");
        }
    }
}