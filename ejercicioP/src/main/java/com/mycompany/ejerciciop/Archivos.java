package com.mycompany.ejerciciop;

import java.io.*;

public class Archivos {
    //Metodo para crear archivo
    public static void crear() throws IOException{
        File file = new File("archivo.txt");
        
        if(file.exists()==true){
            System.out.println("Archivo existente");
        }else{
            System.out.println("No se creo el archivo");
        }
    }
    
    //Metodo para escribir
    public static void escribir(String nombre, int edad) throws IOException{
        File file = new File("./archivo.txt");
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.print(nombre);
        pw.println(edad);
        
        pw.close();
        
    }
    
    //Metodo para leer el archivo
    public static void leer() throws FileNotFoundException, IOException{
        String contenido;
        
        File file = new File("./archivo.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        
        contenido = br.readLine();
    }
}
