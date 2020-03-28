package com.CMSL.x00091119;

public class Automovil {
    private String placa;
    private String EntradaH, EntradaM;
    private String SalidaH;
    private String SalidaM;




    public Automovil(String placa, String entradaH, String entradaM, String salidaH, String salidaM) {
        this.placa = placa;
        EntradaH = entradaH;
        EntradaM = entradaM;
        SalidaH = salidaH;
        SalidaM = salidaM;
    }

    public Automovil(int EntradaH, int EntradaM) {
    }

    public String getPlaca() {
        return placa;
    }

    public String getEntradaH() {
        return EntradaH;
    }

    public String getEntradaM() {
        return EntradaM;
    }


    public String getSalidaH() {
        return SalidaH;
    }

    public String getSalidaM() {
        return SalidaM;
    }
}