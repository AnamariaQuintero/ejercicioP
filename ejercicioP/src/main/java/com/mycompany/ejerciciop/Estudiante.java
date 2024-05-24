package com.mycompany.ejerciciop;

public class Estudiante {
    private String name;
    private String apellido;
    private String codigoParticipacion;

    public Estudiante(String name, String apellido, String codigoParticipacion) {
        this.name = name;
        this.apellido = apellido;
        this.codigoParticipacion = codigoParticipacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getCodigoParticipacion() {
        return codigoParticipacion;
    }

    public void setCodigoParticipacion(String codigoParticipacion) {
        this.codigoParticipacion = codigoParticipacion;
    }
    
    
}
