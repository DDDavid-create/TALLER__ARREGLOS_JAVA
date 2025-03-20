import javax.swing.*;

public class Ejercicio_9 {
    public static void main(String[] arg){
        //Cree un algoritmo que dado un arreglo de 4 números, mostrar solo el primero y el último.

        int[] numeros = {12, 43, 55, 89};

        int primero = numeros[0];
        int ultimo  = numeros[3];

        String msj = "Primer numero del arreglo: " + primero + "\n";
        msj+= "Ultimo numero del arreglo: " + ultimo;
        JOptionPane.showMessageDialog(null, msj);
    }
}
