package Dominio;

import java.io.Serializable;

public class Funcionario implements Serializable{

    private String nombre;
    private String edad;
    private String numero;

    public Funcionario() {
        nombre = "Sin nombre";
        edad = "0";
        numero = "0";
    }

    public Funcionario(String unNombre, String unaEdad, String unNumero) {
        nombre = unNombre;
        edad = unaEdad;
        numero = unNumero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String toString() {
        return nombre;
    }

}
