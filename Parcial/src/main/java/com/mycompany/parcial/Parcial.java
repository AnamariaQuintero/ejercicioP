package com.mycompany.parcial;

import java.io.*;

public class Parcial {

    public static void main(String[] args) throws IOException {
        Archivo.crear();
        
        Estudiante est1 = new Estudiante("Anamaria", "Quintero");
        est1.generarCodigo();
        
        Estudiante est2 = new Estudiante("Juan", "Moreno");
        est2.generarCodigo();
        
        //Escribir en el archivo de texto
        Archivo.escribir(est1, est1.getCodigo());
        
        
    }
}
