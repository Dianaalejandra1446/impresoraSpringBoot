package com.campuslands.impresora;

public class impresoraArchivo implements Impresora {
    @Override
    public void imprimir(String contenido){
        System.out.println("Imprimiendo en un archivo: "+contenido);
    }   
}
