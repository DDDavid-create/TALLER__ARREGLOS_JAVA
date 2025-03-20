import javax.swing.*;

public class Ejercicio_7 {
    public static void main(String[] arg){
        //Cree un algoritmo que pida al usuario que ingrese n números y guárdalos en un arreglo. Luego, mostrar el arreglo, para eso use el ciclo de su preferencia.

        int tam;
        tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros del arreglo"));
        int[] numeros = new int[tam];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero en la posición: " + i));
        }

        for (int i = 0; i < numeros.length ; i++) {
            JOptionPane.showMessageDialog(null, "Posición ("+ i + ") tiene el nuemero "+numeros[i] + " almacenado\n");
        }
    }
}
