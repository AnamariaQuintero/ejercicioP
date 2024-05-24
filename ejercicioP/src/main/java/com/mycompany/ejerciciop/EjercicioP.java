package com.mycompany.ejerciciop;

import java.io.*;

public class EjercicioP {

    public static void main(String[] args) throws IOException {
        // Rutas de los archivos
        String estudiantesFile = "estudiantes.txt";
        String actividadesFile = "actividades.txt";
        
        //Creando estudiantes
        
        //Estudiante est1 = new Estudiante("Anamaria", "Quintero", "Voleibol", "aq1008");
        //Actividad act1 = new Actividad("Voleibol",5);
        
        //Enviar la informacion 
        RegistroActividades reg1 = new RegistroActividades();
//        reg1.agregarEstudiante(est1);
//        reg1.agregarActividad(act1);
//        
        reg1.guardarDatos(estudiantesFile, actividadesFile);
        
        reg1.cargarDatos(estudiantesFile, actividadesFile);
        
        // Crear los archivos si no existen
        try {
            File estFile = new File(estudiantesFile);
            File actFile = new File(actividadesFile);

            if (estFile.createNewFile()) {
                System.out.println("Archivo de estudiantes creado: " + estFile.getName());
            } else {
                System.out.println("El archivo de estudiantes ya existe.");
            }

            if (actFile.createNewFile()) {
                System.out.println("Archivo de actividades creado: " + actFile.getName());
            } else {
                System.out.println("El archivo de actividades ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear los archivos: " + e.getMessage());
        }
        
        
        
        
    }
}
