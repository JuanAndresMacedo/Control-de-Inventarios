package Dominio;

import Archivos.ArchivoLectura;
import java.io.Serializable;

public class Vuelo implements Serializable {

    private String id;
    private String area;
    private String fila;
    private String[] codCarga;
    private String nombreArchivo;
    private String coincidencias;
    private String diferencias;

    public Vuelo(String unId, String unArea, String unaFila, String[] unCodCarga,
            String unNombreArchivo, String unasCoincidencias, String unasDiferencias) {
        id = unId;
        area = unArea;
        fila = unaFila;
        codCarga = unCodCarga;
        nombreArchivo = unNombreArchivo;
        coincidencias = unasCoincidencias;
        diferencias = unasDiferencias;
    }

    public String getCoincidencias() {
        return coincidencias;
    }

    public String getDiferencias() {
        return diferencias;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public String[] getCodCarga() {
        return codCarga;
    }

    public void setCodCarga(String[] codCarga) {
        this.codCarga = codCarga;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String toString() {
        return nombreArchivo + " / Area: " + area + " / Fila: " + fila;
    }
}
