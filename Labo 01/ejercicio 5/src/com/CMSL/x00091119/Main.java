package com.CMSL.x00091119;

import java.util.Scanner;

import java.util.ArrayList;

    public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Character> listado = new ArrayList<>();
        char v;
        System.out.println("Si usted desea parar de digitar letras, presione 0, por favor.");

        do{
            System.out.print("Digite la letra que desea: ");
            v = sc.next().charAt(0);
            if((v =='A')||(v=='a')
                    ||(v =='E')||(v =='e')
                    ||(v =='I')||(v =='i')
                    ||(v =='O')||(v =='o')
                    ||(v =='U')||(v =='u'))
            {
                listado.add(v);
            }
        }while(Character.compare(v,'0') != 0);
        System.out.println("Su lista con vocales en mayusculas o minusculas se muestra a continuación:");
        System.out.println(listado);
    }
}