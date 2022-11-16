package Dominio;

import java.io.Serializable;

public class Articulo implements Serializable{
    private String nombre;
    private String descripcion;
    private int num;
    
    public Articulo (){
        nombre = "Sin nombre";
        descripcion = "Sin descripcion";
    }
    
    public Articulo(String unNombre,String unaDescripcion){
        nombre = unNombre;
        descripcion = unaDescripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String toString(){
        return nombre;
    }   
}   
