import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.*;

public class Ejercicio_6 {
    public static void main(String[] arg){
        //Cree un algoritmo que declare un arreglo de 5 números enteros y muestra su contenido en pantalla.
        int numeros[] = {12, 45, 54, 32, 21};

        String msj = "El contenido del arreglo es: \n\n";
        msj+= numeros[0] + "\n";
        msj+= numeros[1] + "\n";
        msj+= numeros[2] + "\n";
        msj+= numeros[3] + "\n";
        msj+= numeros[4] + "\n";
        JOptionPane.showMessageDialog(null, msj);
    }
}
