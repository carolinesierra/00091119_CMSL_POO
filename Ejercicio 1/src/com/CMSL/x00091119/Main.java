package com.CMSL.x00091119;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        ArrayList<HerramientasMinecraft> nuevo = new ArrayList<>();
        String material, tipo , resistencia;
        int dano, eficiencia;
        byte ops;
        do {
            Menu();
            ops = sca.nextByte(); sca.nextLine();

            switch (ops) {
                case 1:
                    System.out.println("-------Herramientas Disponibles---------");
                    System.out.print("Espada, Pico, Pala, Hacha, Azada");
                    System.out.println(" ");
                    System.out.println("Por favor escribir el nombre de la herramienta que desea: "); tipo = sca.nextLine();
                    System.out.println("-------Materiales Disponibles---------");
                    System.out.println("Madera, Oro, Diamante, Hierro, Piedra");
                    System.out.println("Ingrese el tipo de material, por favor:");material = sca.nextLine();
                    System.out.println("Ingrese el daño:"); dano = sca.nextInt(); sca.nextLine();
                    System.out.println("Ingrese el color: "); resistencia = sca.nextLine();
                    System.out.println("Ingrese la eficiencia: ");eficiencia = sca.nextInt(); sca.nextLine();

                    nuevo.add(new HerramientasMinecraft(tipo, material, dano, resistencia, eficiencia));
                    break;
                case 2:
                    System.out.println("Su lista de herramientas es:");
                    System.out.println(nuevo.toString());
                    break;

                case 3:
                    System.out.print("Digite el nombre de la herramientaa busca su respectiva lista:");
                    tipo = sca.nextLine(); sca.nextLine();
                    String tips = tipo;

                    nuevo.forEach(b -> {
                        if(b.getTipo().equalsIgnoreCase(tips))
                            System.out.println(b.toString());
                    });
                    break;
                case 4:
                    System.out.print("----Materiales de ORO----");
                    System.out.println("Digite oro, luego enter y de nuevo oro:");
                    material = sca.nextLine(); sca.nextLine();
                    String material1 = material;

                    nuevo.forEach(a -> {
                        if(a.getMaterial().equalsIgnoreCase(material1))
                            System.out.println(a.toString());
                    });

                case 5: {

                    nuevo.forEach(s -> s.agregarDano(sca));
                }
            }
        }while(ops != 0);
    }

    public static void Menu() {
        System.out.println("-----Presione el número de su opción deseada----");
        System.out.println("1. Agregar herramienta a la lista.");
        System.out.println("2. Consultar todas las herramientas.");
        System.out.println("3. Consultar herramientas segun su tipo.");
        System.out.println("4. Consultar todas las herramientas de ORO.");
        System.out.println("5. Agregar daño.");
        System.out.println("0. Salir.");
        System.out.print("Su opción elegida es : ");
    }
}