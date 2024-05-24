package com.mycompany.parcial;

import java.util.Random;

public class Estudiante {
    private String name;
    private String lastName;
    private String codigo;

    public Estudiante(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        generarCodigo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    
    public void generarCodigo(){
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        String randomNumberStr = String.valueOf(randomNumber);
        this.codigo = (this.name.charAt(0) + "" + this.lastName.charAt(0) + "" + this.lastName.charAt(1) + "" + randomNumberStr);
    }
    

    
    
    
    
    
    
}
