package com.CMSL.x00091119;

import javax.swing.*;


    public class Ticket{
            private int EntradaH, Entradam;
            private String placa;

        public Ticket(int entradaH, int entradam, String placa) {
            EntradaH = entradaH;
            Entradam = entradam;
            this.placa = placa;
        }

        @Override
        public String toString() {
            return "Ticket{" +
                    "EntradaH=" + EntradaH +
                    ", Entradam=" + Entradam +
                    ", placa='" + placa + '\'' +
                    '}';
        }

        public String getPlaca() {
            return placa;
        }

        public int getEntradaH() {
            return EntradaH;
        }

        public int getEntradam() {
            return Entradam;
        }
    }