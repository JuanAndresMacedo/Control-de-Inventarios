package Dominio;
//int caracterNum = 65;
//String.valueOf((char) caracterNum)
//van a ingresar una identificacion que no sea de ningun dron?

import Archivos.ArchivoLectura;
import java.io.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Sistema extends Observable implements Serializable {

    private ArrayList<Articulo> listaArticulos;
    private ArrayList<Dron> listaDrones;
    private ArrayList<Funcionario> listaFuncionarios;
    private ArrayList<Area> listaAreas;

    //Constructor
    public Sistema() {
        listaArticulos = new ArrayList();
        listaDrones = new ArrayList();
        listaFuncionarios = new ArrayList();
        listaAreas = new ArrayList();

        //Crear Areas
        int caracterNum = 65;
        for (int i = 0; i < 5; i++) {
            listaAreas.add(new Area(String.valueOf((char) caracterNum)));
            caracterNum++;
        }
    }

    public ArrayList<Area> getListaAreas() {
        return listaAreas;
    }

    public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public ArrayList<Dron> getListaDrones() {
        return listaDrones;
    }

    public ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void agregarDron(Dron unDron) {
        listaDrones.add(unDron);
        setChanged();
        notifyObservers();
    }

    public void agregarArticulo(Articulo unArticulo) {
        listaArticulos.add(unArticulo);
        setChanged();
        notifyObservers();
    }

    public void agregarFuncionario(Funcionario unFuncionario) {
        listaFuncionarios.add(unFuncionario);
        setChanged();
        notifyObservers();
    }

    //Persistir datos
    public void guardarDatos(Sistema unSistema) {
        try {
            FileOutputStream archivo = new FileOutputStream("datos");
            ObjectOutputStream datos = new ObjectOutputStream(archivo);
            datos.writeObject(unSistema);
            datos.close();
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo");
            System.exit(0);
        }
    }

    //Lectura de Archivos
    public boolean archivoEsValido(String[] datosEnBruto) {
        boolean esValido = true;
        int cantNull = 0;
        for (int i = 0; i < datosEnBruto.length && esValido; i++) {
            if (datosEnBruto[i] == null) {
                cantNull++;
            }
        }

        if (cantNull > 10) {
            esValido = false;
        }

        return esValido;
    }

    public String[] leerArchivo(String nomArchivo) {
        ArchivoLectura al = new ArchivoLectura(nomArchivo);

        String[] datosEnBruto = new String[12];

        String linea;
        int cont = 0;

        while (al.hayMasLineas()) {
            linea = al.linea();
            datosEnBruto[cont] = linea;
            cont++;
        }

        return datosEnBruto;
    }

    public String[] procesarDatos(String[] datosEnBruto) {
        String[] datosProcesados = new String[13];

        String[] zona = datosEnBruto[1].split("#");

        datosProcesados[0] = datosEnBruto[0];//id del dron
        datosProcesados[1] = zona[0];//area
        datosProcesados[2] = zona[1];//fila
        for (int i = 2; i < datosEnBruto.length; i++) {
            datosProcesados[i + 1] = datosEnBruto[i];
        }
        return datosProcesados;
    }

    //Metodos Area
    public Area buscarAreaXLetra(String letra) {
        Area a = null;
        boolean fin = false;
        for (int i = 0; i < listaAreas.size() && !false; i++) {
            if (listaAreas.get(i).getLetraArea().equals(letra)) {
                a = listaAreas.get(i);
                fin = true;
            }
        }
        return a;
    }

    //Metodos registro de Vuelo
    public String[] codCargaVueloManual(String area, String fila) {
        String[] datosManual = new String[10];
        Carga[][] matArea = buscarAreaXLetra(area).getMatArea();
        for (int j = 1; j < matArea[0].length; j++) {
            if (matArea[Integer.parseInt(fila)][j].getA() == null) {
                datosManual[j - 1] = "0";
            } else {
                datosManual[j - 1] = String.valueOf(matArea[Integer.parseInt(fila)][j].getCodCarga());
            }
        }
        return datosManual;
    }

    public String[] arrayCodigosDeCarga(String[] datosProcesados) {
        String[] codCargas = new String[10];
        for (int i = 3; i < datosProcesados.length; i++) {
            codCargas[i - 3] = datosProcesados[i];
        }
        return codCargas;
    }

    public int[] comparacionesConArchivoYManual(String[] codCargaArchivo, String[] codCargaManual) {
        int[] comparaciones = new int[2];// posicion 0 coincidencias y posicion 1 diferencias
        for (int i = 0; i < codCargaManual.length; i++) {
            if (codCargaArchivo[i].equals(codCargaManual[i])) {
                comparaciones[0]++;
            } else {
                comparaciones[1]++;
            }
        }
        return comparaciones;
    }

    public String cantCodigosDeCarga(String[] codCargas) {
        int cant = 0;
        for (int i = 0; i < codCargas.length && codCargas[i] != null; i++) {
            cant++;
        }
        return String.valueOf(cant);
    }

    //Metodos Dron
    public Dron buscarDron(String unId) {
        Dron d = null;
        boolean fin = false;
        for (int i = 0; i < listaDrones.size() && !false; i++) {
            if (listaDrones.get(i).getIdentificacion().equals(unId)) {
                d = listaDrones.get(i);
                fin = true;
            }
        }
        return d;
    }

    //Metodos Estadisticas 
    public ArrayList<String> arrayInformacionVuelosDeDron(String id) {
        ArrayList<String> listaAMostrar = new ArrayList<String>();

        ArrayList<Vuelo> listaVuelosDeDron = buscarDron(id).getListaVuelos();
        for (int i = 0; i < listaVuelosDeDron.size(); i++) {
            if (buscarDron(id).vueloEsExitoso(listaVuelosDeDron.get(i).getCodCarga())) {

                listaAMostrar.add(listaVuelosDeDron.get(i).toString() + " / Coincidencias: " + listaVuelosDeDron.get(i).
                        getCoincidencias() + " / Diferencias: " + listaVuelosDeDron.get(i).getDiferencias());

            } else {

                listaAMostrar.add(listaVuelosDeDron.get(i).toString() + " / Cantidad de codigos: "
                        + cantCodigosDeCarga(listaVuelosDeDron.get(i).getCodCarga()));
            }
        }
        return listaAMostrar;
    }

    public boolean dronExiste(String unId) {
        boolean existe = false;
        for (int i = 0; i < listaDrones.size() && !existe; i++) {
            if (listaDrones.get(i).getIdentificacion().equals(unId)) {
                existe = true;
            }
        }
        return existe;
    }

    //Validaciones
    //Ventana Arrticulo
    public boolean articuloRepetido(String nombre) {
        boolean esValido = false;
        for (int i = 0; i < listaArticulos.size(); i++) {
            if (nombre.equals(listaArticulos.get(i).getNombre())) {
                esValido = true;
            }
        }
        return esValido;
    }

    //Ventana Funcionario
    public boolean funcionarioRepetido(String numero) {
        boolean esValido = false;
        int numeroAValidar = Integer.parseInt(numero);
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            int numeroAComparar = Integer.parseInt(listaFuncionarios.get(i).getNumero());
            if (numeroAValidar == numeroAComparar) {
                esValido = true;
            }
        }
        return esValido;
    }

    //Ventana Dron
    public boolean dronRepetido(String identificacion) {
        boolean esValido = false;
        for (int i = 0; i < listaDrones.size(); i++) {
            if (identificacion.equals(listaDrones.get(i).getIdentificacion())) {
                esValido = true;
            }
        }
        return esValido;
    }

    //Ventana Ingreso/Egreso
    public boolean datosDeListaSinSeleccionar(Object o1, Object o2) {
        boolean sin = false;
        if (o1 == null || o2 == null) {
            sin = true;
        }
        return sin;
    }

    //Ventana Estadisticas
    public ArrayList<Dron> listaDronesConVuelos() {
        ArrayList<Dron> lista = new ArrayList<Dron>();

        for (Dron d : listaDrones) {
            if (d.getListaVuelos().size() != 0) {
                lista.add(d);
            }
        }
        return lista;
    }

    public ArrayList<Dron> listaDronesSinVuelos() {
        ArrayList<Dron> lista = new ArrayList<Dron>();

        for (Dron d : listaDrones) {
            if (d.getListaVuelos().size() == 0) {
                lista.add(d);
            }
        }
        return lista;
    }

    //Validaciones Generales
    public boolean seIngresoInt(String datoAValidar) {
        boolean datoValido;
        try {
            Integer.parseInt(datoAValidar);
            datoValido = true;
        } catch (NumberFormatException e) {
            datoValido = false;
        }
        return datoValido;
    }

    public boolean controlRangoNumerico(String valor, int minimo, int maximo) {
        boolean valido = false;
        if (Integer.parseInt(valor) > minimo
                && Integer.parseInt(valor) < maximo) {
            valido = true;
        }
        return valido;
    }

    public boolean controlEspacioVacioTresCampos(String c1, String c2, String c3) {
        boolean vacio = true;
        if (!c1.equals("") && !c2.equals("") && !c3.equals("")) {
            vacio = false;
        }
        return vacio;
    }

    public boolean controlEspacioVacioDosCampos(String c1, String c2) {
        boolean vacio = true;
        if (!c1.equals("") && !c2.equals("")) {
            vacio = false;
        }
        return vacio;
    }
}
