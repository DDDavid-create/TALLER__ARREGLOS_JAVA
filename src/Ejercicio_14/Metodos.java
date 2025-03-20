package Ejercicio_14;

import javax.swing.*;

public class Metodos {

    int estrato;
    String nombre;
    double sueldo, dcto, porcenDcto;
    double[] listDcto;
    String[] nombres;

    public Metodos(){
        iniciar();
    }

    public void iniciar(){
        String msj = "Estrato social\n\n";
        msj+="1. Estrato 1\n";
        msj+="2. Estrato 2\n";
        msj+="3. Estrato 3\n";
        msj+="4. Estrato 4\n";
        msj+="5. Estrato 5\n";
        msj+="6. Estrato 6\n\n";
        msj+="Ingrese su estrato";

        int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos empleado vas a ingresar"));

        listDcto = new double[cant];
        nombres = new String[cant];

        for (int i = 0; i < cant; i++) {
            solicitarDatos(msj);
            nombres[i] = nombre;
            listDcto[i] = dcto;
        }

        imprimirArreglo();
    }

    private void imprimirArreglo() {
        for (int i = 0; i < listDcto.length ; i++) {
            System.out.println(nombres[i] + " tiene un descuento de: " + listDcto[i]);
        }
    }

    private void solicitarDatos(String msj)
    {
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        estrato = Integer.parseInt(JOptionPane.showInputDialog(msj));
        sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo"));

        imprimirDatos();
        calcularDcto();
    }

    private void calcularDcto() {
        switch (estrato){
            case 1:
            case 2:
                porcenDcto = 0.02;
                break;
            case 3:
            case 4:
                porcenDcto = 0.04;
                break;
            case 5:
                porcenDcto = 0.08;
                break;
            case 6:
                porcenDcto = 0.10;
                break;
            default:
                System.out.println("Estrato no corresponde");
                porcenDcto = 0;
                break;
        }
        dcto = sueldo * porcenDcto;
        System.out.println("El descuento es de: " + dcto);
    }

    private void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Estrato: " + estrato);
    }
}
