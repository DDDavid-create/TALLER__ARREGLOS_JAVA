import javax.swing.*;

public class Ejercicio_8 {
    public static void main(String[] arg){
        //Cree un algoritmo que declare un arreglo que permita almacenar n cantidad de nombres, para esto llene el arreglo con un ciclo for
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos nombres almacenará"));
        String[] nombres = new String[tam];

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = JOptionPane.showInputDialog("Ingresa un nombre en la posición: " + i);
        }

        for (int i = 0; i < nombres.length ; i++) {
            JOptionPane.showMessageDialog(null, "Posición ("+ i + ") tiene el nombre: "+nombres[i] + " almacenado\n");
        }
    }
}
