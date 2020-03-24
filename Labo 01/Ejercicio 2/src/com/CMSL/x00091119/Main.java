package com.CMSL.x00091119;


import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite la frase que desea verificar: ");
        String frase = sc.nextLine();
        if (funPalindroma(frase)) {
            System.out.println("Siu, la frase es palindroma");
        } else {
            System.out.println("La frase no es plaindroma:(");
        }

    }

    public static boolean funPalindroma(String frase) {
        StringBuilder b = new StringBuilder();
        int n = frase.length();

        int i;
        for(i = 0; i < n; ++i) {
            if (!frase.substring(i, i + 1).equals(" ") && !frase.substring(i, i + 1).equals(",") && !frase.substring(i, i + 1).equals("?") && !frase.substring(i, i + 1).equals(".") && !frase.substring(i, i + 1).equals("!") && !frase.substring(i, i + 1).equals("¡") && !frase.substring(i, i + 1).equals("¿")) {
                b.append(frase, i, i + 1);
            }
        }

        n = b.length();

        for(i = 0; i < n / 2; ++i) {
            if (!b.substring(i, i + 1).equals(b.substring(n - i - 1, n - i))) {
                return false;
            }
        }

        return true;
    }
}
