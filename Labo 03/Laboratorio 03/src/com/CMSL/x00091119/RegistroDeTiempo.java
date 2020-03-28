package com.CMSL.x00091119;

public class RegistroDeTiempo {

    private static int EntradaH;
    private static int entradaM;
    private static int SalidaH;
    private static int SalidaM;
    int cantidad = 0;


    public RegistroDeTiempo( int entradaH, int entradaM, String salidaH, String salidaM) {

        EntradaH = entradaH;
        RegistroDeTiempo.entradaM = entradaM;
        SalidaH = salidaM;
        SalidaM = salidaM;
    }



    public static int getEntradaH() {
        return EntradaH;
    }

    public static int getEntradaM() {
        return entradaM;
    }

    public static int getSalidaH() {
        return SalidaH;
    }

    public static int getSalidaM() {
        return SalidaM;
    }
    public int calculoValor() {
        cantidad =0;
        cantidad = ((SalidaH * 60 + SalidaM) - (EntradaH * 60 + SalidaM));
        return cantidad;
    }

}
