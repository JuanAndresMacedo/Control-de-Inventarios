package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Dron implements Serializable {

    private String identificacion;
    private String modelo;
    private String camara;
    private ArrayList<Vuelo> listaVuelos;

    public Dron() {
        identificacion = "Sin identificacion";
        modelo = "Sin modelo";
        camara = "0";
        listaVuelos = new ArrayList<Vuelo>();
    }

    public Dron(String unaIdentificacion, String unModelo, String unaCamara) {
        identificacion = unaIdentificacion;
        modelo = unModelo;
        camara = unaCamara;
        listaVuelos = new ArrayList<Vuelo>();
    }

    public boolean vueloEsExitoso(String[] codCargas) {
        boolean esExitoso = true;
        for (int i = 0; i < codCargas.length && esExitoso; i++) {
            if (codCargas[i] == null) {
                esExitoso = false;
            }
        }
        return esExitoso;
    }

    public void agregarVuelo(Vuelo v) {
        listaVuelos.add(v);
    }

    public ArrayList<Vuelo> getListaVuelos() {
        return listaVuelos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String toString() {
        return "Identificacion: " + identificacion + " y Camara: " + camara;
    }
}
