package com.CMSL.x00091119;

import javax.swing.*;

public class Moneda {
    private double valor;
    private double centavoCinc = 0.05;
    private double  centavoDiez= 0.10;
    private double centavoCora = 0.25;
    private double  Dolar = 1.0;


    public Moneda(int centavoCinc, int centavoDiez, int centavoCora, int Dolar) {
        this.centavoCinc = centavoCinc;
        this.centavoDiez = centavoDiez;
        this.centavoCora = centavoCora;
        this.Dolar = Dolar;
    }

    public double setPagando(double pagando){
        valor = pagando;
        return pagando;
    }



}

