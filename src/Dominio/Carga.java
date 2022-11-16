package Dominio;

import java.io.Serializable;

public class Carga implements Serializable{

    private Articulo a;
    private Funcionario f;
    private int cantUnidades;
    private int codCarga;

    public Carga(Articulo unA, Funcionario unF, int unaCantUnidades, int unCodCarga) {
        a = unA;
        f = unF;
        cantUnidades = unaCantUnidades;
        codCarga = unCodCarga;
    }

    public Carga() {
        a = null;
        f = null;
        cantUnidades = 0;
        codCarga = 0;
    }

    public Articulo getA() {
        return a;
    }

    public void setA(Articulo a) {
        this.a = a;
    }

    public Funcionario getF() {
        return f;
    }

    public void setF(Funcionario f) {
        this.f = f;
    }

    public int getCantUnidades() {
        return cantUnidades;
    }

    public void setCantUnidades(int cantUnidades) {
        this.cantUnidades = cantUnidades;
    }

    public int getCodCarga() {
        return codCarga;
    }

    public void setCodCarga(int codCarga) {
        this.codCarga = codCarga;
    }
}
