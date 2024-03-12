package com.campuslands.impresora;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    
    @Bean
    public Impresora impresoraConsola(){
        return new impresoraConsola();
    } 
    @Bean
    public Impresora impresoraArchivo(){
        return new impresoraArchivo();
    }
    @Bean
    public Reporte reporteConsola (@Qualifier ("impresoraConsola")Impresora impresora){
        return new Reporte(impresora);
    }
    @Bean 
    public Reporte reporteArchivo(@Qualifier("impresoraArchivo")Impresora impresora){
        return new Reporte(impresora);
    }
}
