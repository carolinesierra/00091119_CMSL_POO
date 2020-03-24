package com.CMSL.x00091119;


import java.util.Scanner;

public class HerramientasMinecraft {


    public String material;
    private String tipo;
    private int dano;
    private String resistencia;
    private int eficiencia;


    public HerramientasMinecraft(String tipo, String material, int dano, String reistencia, int eficiencia) {
        this.tipo = tipo;
        this.material = material;
        this.dano = dano;
        this.resistencia = reistencia;
        this.eficiencia = eficiencia;
    }

    public void agregarDano(Scanner scanner){
        System.out.println("Tome en cuenta que aparecerá cada herramienta según el orden en que usted las registro a la lista.");
        System.out.print("Su arma " + tipo + " con daño de " + dano + " se le  agregara un daño de: ");
        dano = + scanner.nextInt();scanner.nextLine();

    }
    @Override
    public String toString() {
        return "HerramientasMinecraft {" +
                "Material ='" + material + '\'' +
                ", Herramienta =" + tipo +
                ", Daño =" + dano +
                ", Resistencia =" + resistencia +
                ", Eficiencia =" + eficiencia +
                '}';
    }

    public String getMaterial() {
        return material;
    }

    public String getTipo() {
        return tipo;
    }

}



