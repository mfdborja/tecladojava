package leerteclado;
import java.io.*;

public class Teclado {
/**
 * @author www.borjaro2000.tk
 */

    //Throws - Eleva la excepción al método que realiza la llamada.
    public static String LeerString() throws IOException {
        //Con esto sacamos cadenas de texto del buffer de teclado.
        BufferedReader flujo = new BufferedReader(new InputStreamReader(System.in));
        //Con esto aparece un cursor esperando a introducir datos.
            return flujo.readLine();
    }

    public static int LeerEntero() throws IOException, NumberFormatException {
        BufferedReader flujo = new BufferedReader(new InputStreamReader(System.in));
        //Pedir por el teclado
        //Con el parse convertimos la cadena de texto al tipo deseado.
            return Integer.parseInt(flujo.readLine());
    }

    public static Double LeerDouble() throws IOException, NumberFormatException {
        BufferedReader flujo = new BufferedReader(new InputStreamReader(System.in));
        //Pedir por el teclado
            return Double.parseDouble(flujo.readLine());
    }

    public static Float LeerFloat() throws IOException, NumberFormatException {
        BufferedReader flujo = new BufferedReader(new InputStreamReader(System.in));
        //Pedir por el teclado
            return Float.parseFloat(flujo.readLine());
    }

    public static Long LeerLong() throws IOException, NumberFormatException {
        BufferedReader flujo = new BufferedReader(new InputStreamReader(System.in));
        //Pedir por el teclado
            return Long.parseLong(flujo.readLine());
    }

    //Con esto la clase no se podrá instanciar. No es necesario.
    private Teclado() {
    }
}
