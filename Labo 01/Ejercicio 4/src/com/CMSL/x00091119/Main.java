package com.CMSL.x00091119;

import java.util.Scanner;

    public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String cadena = sca.nextLine();


        System.out.println("El programa cambio las letras 'a' por la letra 'b' de su cadena ingresada.");
        System.out.println("Su nueva cadena es:):");

        String cambio = cadena.replace('a','b'); //Metodo para cambiar caracteres. oldChar:Caracter a sustituir y newChar:caracter que reemplaza al viejo caracter.
        System.out.println(cambio);
    }
}