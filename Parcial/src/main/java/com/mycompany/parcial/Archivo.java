package com.mycompany.parcial;

import java.io.*;

public class Archivo {
    public static void crear() throws IOException{
        File file = new File("datos.txt");
        
        file.createNewFile();
        
        if(file.exists() == true){
            System.out.println("El archivo ya existe");
        }else{
            System.out.println("El archivo se ha creado");
        }
    }
    
    public static void escribir(Estudiante estudiante, String codigo) throws IOException{
        File file = new File("datos.txt");
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Nombre: " + estudiante.getName() + ", Apellido: " + estudiante.getLastName() + ", codigo:" + codigo);
        
        pw.close();
    }
    
    
}
