package com.CMSL.x00091119;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sca = new Scanner(System.in);


    public static void main(String[] args) {
        ArrayList<Ticket> ticket = new ArrayList<>();
        String placa;
        int entradaH, entradaM;
        float DineroRecibido = 0;
        int totalDinero = 0;


        int opc = 0;
        int opc2 = 0;

        do {
            opc = Integer.parseInt((JOptionPane.showInputDialog(null, fMenu())));
            JOptionPane.showMessageDialog(null, fmoendasIngresadas());
            switch (opc) {
                case 1:
                    JOptionPane.showMessageDialog(null, "---Ingresando Automovil---");
                    entradaH = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese solamente HORA de entrada, sin minutos:"));
                    entradaM = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese solamente minutos:"));
                    placa = (JOptionPane.showInputDialog(null, "Numero de placa: "));
                    ticket.add(new Ticket(entradaH, entradaM, placa));
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "---Salieno Automovil---");
                    entradaH = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese solamente HORA de entrada, sin minutos:"));
                    entradaM = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese solamente minutos:"));
                    placa = (JOptionPane.showInputDialog(null, "Numero de placa: "));
                    ticket.add(new Ticket(entradaH, entradaM, placa));
                    Automovil auto = new Automovil(entradaH, entradaM);
                    int total = entradaH - entradaM;
                    for (Ticket aux : ticket) {
                        RegistroDeTiempo tiempo = new RegistroDeTiempo(aux.getEntradaH(), aux.getEntradam(), auto.getSalidaH(), auto.getSalidaM());
                        if (aux.getPlaca().equalsIgnoreCase(placa)) {
                            totalDinero = tiempo.calculoValor();
                        }
                    }

                    double valor = 0;
                    if (total <= 30) {
                        JOptionPane.showMessageDialog(null, "Pago total: '$0.0' . Gracias por su preferencia.");
                        JOptionPane.showMessageDialog(null, "¡Vuelva Pronto!");
                        valor = 0.00;
                    } else if (total >= 30 && total < 60) {
                        valor = 0.50;
                        JOptionPane.showMessageDialog(null, "Pago total: '$0.50' . Gracias por su preferencia.");
                        JOptionPane.showMessageDialog(null, "¡Vuelva Pronto!");
                    } else if (total >= 60 && total <= 120) {
                        valor = 1.00;
                        JOptionPane.showMessageDialog(null, "Pago total: '$1.00' . Gracias por su preferencia.");
                        JOptionPane.showMessageDialog(null, "¡Vuelva Pronto!");
                    } else if (total >= 120) {
                        valor = 5.00;
                        JOptionPane.showMessageDialog(null, "Pago total: '$5.00' . Gracias por su preferencia.");
                        JOptionPane.showMessageDialog(null, "¡Vuelva Pronto!");
                    }
                    int centavoCinc = 0;
                    int centavoDiez = 0;
                    int centavoCora = 0;
                    int Dolar = 0;
                    Moneda moneda = new Moneda(centavoCinc, centavoDiez, centavoCora, Dolar);
                    moneda.setPagando(valor);


                case 3: {
                    JOptionPane.showMessageDialog(null, "---Consultar Ticket---");
                    String placasCar = JOptionPane.showInputDialog("Ingrese las placas de su carro: ");
                    Plac = sca.nextLine();
                    String Placas = placasCar;
                    sca.forEach(obj -> {
                        if (obj.getPlaca().equalsIgnoreCase(placas))
                            System.out.println(obj.toString());
                    });
                    break;
                }
                case 4:
                    JOptionPane.showMessageDialog(null, "ingresos obtenido: $" + DineroRecibido);


            }
        }while (opc != 0) ;
    }
    static String fMenu() {
        System.out.println("-----Presione el número de su opción deseada----");
        return "1. Ingresar automóvil \n 2. Salir del parqueo \n3. Consultar ticket \n4. Consultar Monto \n.0   Salir. \n Su opción elegida es: ";
    }

    static String fmoendasIngresadas() {
        System.out.println("-----Presione un número para escoger su moenda----");
        return "1. $0.05 \n 2. $0.10 \n3. $0.25 \n4. $1.00 \n Su Moneda elegida es de: ";
    }
}



