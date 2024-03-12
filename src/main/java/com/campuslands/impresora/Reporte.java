package com.campuslands.impresora;

public class Reporte {
    private Impresora impresora;

    public Reporte(Impresora impresora){
        this.impresora = impresora;
    }
    public void generarReporte(String contenido){
        this.impresora.imprimir(contenido);
    }
}
