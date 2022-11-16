package Prueba;

import Dominio.Sistema;
import Interfaz.Menu;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class Prueba {

    public static void main(String[] args) {
        Sistema sistema = leerDatos();
        Menu menu = new Menu(sistema);
        menu.setVisible(true);
    }

    private static Sistema leerDatos() {
        Sistema sistema;
        try {
            ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get("datos")));
            sistema = (Sistema) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Error al intentar recuperar el archivo, no se ha podido deserializar correctamente", "Error", JOptionPane.YES_OPTION);
            sistema = new Sistema();
        }
        return sistema;
    }
}
