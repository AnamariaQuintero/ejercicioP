package com.mycompany.ejerciciop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RegistroActividades {
    private List<Estudiante> estudiantes;
    private List<Actividad> actividades;

    public RegistroActividades() {
        this.estudiantes = new ArrayList<>();
        this.actividades = new ArrayList<>();
    }
    
    //Metodo para agregar estudiantes al registro
    public void agregarEstudiante(Estudiante est){
        estudiantes.add(est);
    }
    
    //Metodo para agregar las actividades al registro
    public void agregarActividad(Actividad actividad){
        actividades.add(actividad);
    }
    
    public List<Estudiante> getEstudiantes(){ //list<Estudiantes> para llamar el array
        return estudiantes;
    }
    public List<Actividad> getActividades(){ //list<Actividades> para llamar el array
        return actividades;
    }
    
    public void guardarDatos(String estudiantesFile, String actividadesFile) throws IOException{
        FileWriter fwEst = new FileWriter(estudiantesFile, true);
        PrintWriter prEst = new PrintWriter(fwEst);
        for(Estudiante estudiante : estudiantes){ //estudiante variable que creo nuevo
            prEst.print(estudiante.getName() + " , " + estudiante.getApellido() + " , "  + " , " + estudiante.getCodigoParticipacion());
        }
        prEst.close();
        FileWriter fwAct = new FileWriter(actividadesFile, true);
        PrintWriter pwAct = new PrintWriter(fwAct);
        for(Actividad actividad : actividades){
            pwAct.print("La actividad: " + actividad.getNombre());
        }
        pwAct.close();
    }
    
    public void cargarDatos(String estudiantesFile, String actividadesFile) throws IOException{
        FileReader frEst = new FileReader(estudiantesFile);
        BufferedReader brEst = new BufferedReader(frEst);
        String line = brEst.readLine();
        while(line != null){
            String[] data = line.split(",");
           // Estudiante estudiante = new Estudiante(data[0],data[1],data[2],data[3]);
           // estudiantes.add(estudiante);              
    }brEst.close();
    
        FileReader frAct = new FileReader(actividadesFile);
        BufferedReader bfAct = new BufferedReader(frAct);
        String lina = bfAct.readLine();
        while(lina != null){
            String[] data = lina.split(",");
        //    Actividad actividad = new Actividad(data[0], Integer.parseInt(data[1]));
        //    actividades.add(actividad);              
    }bfAct.close();
}
    
    
}
