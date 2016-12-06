package leerteclado;

import java.io.*;

public class LeerTeclado {

    public static void main(String[] args) {
        //Variables
        boolean error = false; //Servirá para que en caso de error se vuelva a pedir un valor.
        
        //Para cadenas de texto.
        System.out.println("Introduzca una cadena de texto.");
        do {//Si se produce un error volveremos a pedir el dato. Además de mostrar el error.
            try {
                System.out.println(Teclado.LeerString()); //Leemos y mostramos.
                error = false; //Si no hay errores.
            } catch (IOException ex) {
                System.err.println("Se ha producido un error al leer el dato. Inténtelo de nuevo.\n" + ex.getMessage());
                error = true; //Si hay errores.
            }
        } while (error); //Si no hay error continua.

        //Para números enteros.
        System.out.println("Introduzca un número entero.");
        do {
            try {
                System.out.println(Teclado.LeerEntero());
                error = false;
            } catch (IOException ex) {
                System.err.println("Se ha producido un error al leer el dato. Inténtelo de nuevo.\n" + ex.getMessage());
                error = true;
            } catch (NumberFormatException ex) {
                System.err.println("Se ha producido un error al leer el dato. Inténtelo de nuevo.\n" + ex.getMessage());
                error = true;
            }
        } while (error);
        
        //Para números enteros largos.
        System.out.println("Introduzca otro número entero.");
        do {
            try {
                System.out.println(Teclado.LeerLong());
                error = false;
            } catch (IOException ex) {
                System.err.println("Se ha producido un error al leer el dato. Inténtelo de nuevo.\n" + ex.getMessage());
                error = true;
            } catch (NumberFormatException ex) {
                System.err.println("Se ha producido un error al leer el dato. Inténtelo de nuevo.\n" + ex.getMessage());
                error = true;
            }
        } while (error);

        //Para números de doble precisión (Double).
        System.out.println("Introduzca un número real.");
        do {
            try {
                System.out.println(Teclado.LeerDouble());
                error = false;
            } catch (IOException ex) {
                System.err.println("Se ha producido un error al leer el dato. Inténtelo de nuevo.\n" + ex.getMessage());
                error = true;
            } catch (NumberFormatException ex) {
                System.err.println("Se ha producido un error al leer el dato. Inténtelo de nuevo.\n" + ex.getMessage());
                error = true;
            }
        } while (error);

        //Para números simple precisión (Float).
        System.out.println("Introduzca otro número real.");
        do {
            try {
                System.out.println(Teclado.LeerFloat());
                error = false;
            } catch (IOException ex) {
                System.err.println("Se ha producido un error al leer el dato. Inténtelo de nuevo.\n" + ex.getMessage());
                error = true;
            } catch (NumberFormatException ex) {
                System.err.println("Se ha producido un error al leer el dato. Inténtelo de nuevo.\n" + ex.getMessage());
                error = true;
            }
        } while (error);
    }
}
