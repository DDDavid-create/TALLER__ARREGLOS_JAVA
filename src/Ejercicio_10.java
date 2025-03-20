import javax.swing.*;
import javax.swing.text.Element;

public class Ejercicio_10 {
    public static void main(String[] arg){
        //Cree un algoritmo que dado un arreglo fijo de 4 números, verificar si contiene el número 10 y mostrar un mensaje.

        int[] numeros = {188, 5, 28, 10};

        for (int i = 0; i < numeros.length ; i++) {
            if (numeros[i]==10){
                JOptionPane.showMessageDialog(null, "Hay un 10 en el arreglo, posición: " + i);
            }
        }

    }
}
