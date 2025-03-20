import javax.swing.*;

public class Ejercicio_12 {
    public static void main(String[] arg){
        //Ejercicio suministrado por video
        //Algorirmo que suma 2 arreglos del mimsmo tamaño y muestre el resultante

        int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
        int[] a = new int[tam];
        int[] b = new int[tam];
        int[] c = new int[tam];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de 'a' en la posición: " + i));
            System.out.print(a[i] + "-");
        }

        System.out.println(); //Salto de linea

        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de 'b' en la posición: " + i));
            System.out.print(b[i] + "-");
        }

        System.out.println(); //Salto de linea

        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
            System.out.print(c[i] + "-");
        }
    }
}
