import javax.swing.*;

public class Ejercicio_11 {
    public static void main(String[] arg){
        //Crear un programa que almacene 8 números en un arreglo y cuente cuántos son pares y cuántos son impares.
        int pares = 0, impares = 0;
        int[] numeros = {12, 44, 21, 83, 32, 7, 15, 24};

        for (int i = 0; i < numeros.length ; i++) {
            if (numeros[i]%2 == 0){
                pares++;
            }else {
                impares++;
            }
        }
        String msj = "Cantidad pares: " + pares + "\n";
        msj+= "Cantidad impares: " + impares;

        JOptionPane.showMessageDialog(null, msj);
    }
}
