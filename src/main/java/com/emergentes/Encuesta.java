package com.emergentes;

public class Encuesta {
    private String nombre;
    private String lenguajes[];

    public Encuesta(String nombre, String[] lenguajes) {
        this.nombre = nombre;
        this.lenguajes = lenguajes;
    }

    public Encuesta() {
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }
    
    
    
    
}
