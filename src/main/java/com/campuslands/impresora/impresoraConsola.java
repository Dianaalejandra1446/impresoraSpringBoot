package com.campuslands.impresora;

public class impresoraConsola implements Impresora{
    @Override
    public void imprimir(String  contenido) {
        System.out.println("Imprimiendo en consola: "+contenido);
    }
}
