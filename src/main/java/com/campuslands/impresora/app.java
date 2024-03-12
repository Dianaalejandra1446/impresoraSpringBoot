package com.campuslands.impresora;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {
    public static void main(String[] args) {
        
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Reporte reporteConsola=context.getBean("reporteConsola",Reporte.class);
        Reporte reporteArchivo=context.getBean("reporteArchivo",Reporte.class);
        reporteConsola.generarReporte("Reporte de clientes");
        reporteArchivo.generarReporte("Reporte de inventario");
    
        
        };
    }

