package com.CSML.x00091119;
/*
//Números quemados
public class Main {

    public static void main(String[] args) {
        int i = 0, a = 0, b = 1;
        int c = 0; //Para guardar la suma.
        for ( i = 0; i <  20 ; i++) {
            if( i < 19 ){
                System.out.print( a + ",");
                c = a + b;
                a =  b;
                b = c;
            } else{
                System.out.print(a + "."); // Al llegar al número 20 se colocara un punto y dejara de salir la ","
            }
        }
    }
}
*/
//Programa con números que desee el usuario



import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int a = 1, b = 0, c = 1;
        int numero;

        System.out.println("Digite la cantidad de números que desea de la serie Fibonacci:");
        numero =  num.nextInt(); num.nextLine();

        System.out.print( a + " ");

        for(int i = 1; i < numero; i++) {
            a = b + c;
            System.out.print(a + " ");
            b = c;
            c = a;
        }
    }

}


