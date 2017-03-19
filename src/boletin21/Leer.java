package boletin21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Leer {

    String[] lista = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..."};
 File fichero = new File("boletin21.txt");
    Scanner s = null;

    public void escribir() {

        FileWriter fw = null;
        try {

            fw = new FileWriter("boletin21.txt");

            for (String listas : lista) {
                fw.write(lista + "\n");
            }

            fw.close();

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }

   

    public void leer() {
        try {
            System.out.println("... Leemos el contenido del fichero ...");
            s = new Scanner(fichero);

            while (s.hasNextLine()) {
                String linea = s.nextLine();
                System.out.println(linea);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {

            s.close();
        }

    }
}
