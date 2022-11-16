package Dominio;

import java.io.Serializable;

public class Area implements Serializable{

    private String letraArea;
    private Carga[][] matArea;

    public Area(String unaLetra) {
        letraArea = unaLetra;
        matArea = new Carga[13][11];
        for (int i = 1; i < matArea.length; i++) {
            for (int j = 1; j < matArea[i].length; j++) {
                matArea[i][j] = new Carga();
            }
        }
    }

    public String getLetraArea() {
        return letraArea;
    }

    public Carga[][] getMatArea() {
        return matArea;
    }

    public boolean areaVacia(String coordenada, Carga[][] matrizArea) {
        boolean estaVacia = false;
        String[] arrayCoord = coordenada.split(":");
        if (matrizArea[Integer.parseInt(arrayCoord[0])][Integer.parseInt(arrayCoord[1])].getA() == null) {
            estaVacia = true;
        }
        return estaVacia;
    }
    
    public void egresarCarga(int coord1,int coord2, Carga[][] matArea){
        matArea[coord1][coord2]= new Carga();
    }
    
}
