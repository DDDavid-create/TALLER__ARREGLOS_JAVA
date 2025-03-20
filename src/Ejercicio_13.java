import javax.swing.*;

public class Ejercicio_13 {
    public static void main(String[] arg) {
        //Algoritmo suminstrado por el video en el material de apoyo

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes a procesar"));

        double n1, n2, n3;
        String nombre;
        String[] nombres = new String[n];
        double[] notas = new double[nombres.length];
        int valida = 0, registro = 0;//Banderas

        String menu = "MENU ESTUDIANTES \n\n";
        menu += "1. Registrar información\n";
        menu += "2. Imprimir lista estudiantes\n";
        menu += "3. Imprimir lista notas\n";
        menu += "4. SALIR\n\n";
        menu += "Seleccione una opción\n";

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1://Registar informacion
                    String respuesta;
                    do {
                        if (valida==0){
                            valida = 1;
                            for (int i = 0; i < nombres.length; i++) {
                                nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante " + (i + 1));

                                //Almacena el nombre del estudiante en cada posicion
                                nombres[i] = nombre;
                                System.out.println(nombres[i]);

                                n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1 para el estudiante " + nombres[i]));
                                n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2 para el estudiante " + nombres[i]));
                                n3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3 para el estudiante " + nombres[i]));

                                double promedio = (n1 + n2 + n3) / 3;
                                notas[i] = promedio;
                                System.out.println("n1=" + n1 + ", n2=" + n2 + ", n3=" + n3);
                                System.out.println("(" + n1 + "+" + n2 + "+" + n3 + "/3 = " + promedio);

                                if (promedio >= 3.5) {
                                    System.out.println(nombres[i] + " GANA LA MATERIA");
                                } else {
                                    System.out.println(nombres[i] + " PIERDE LA MATERIA");
                                }
                                registro=1;
                            }
                        }else {
                            JOptionPane.showMessageDialog(null, "Tenga en cuenta que si ingresa nuevos datos, estos reescribirán los anteriores");
                            registro=0;
                        }

                        if (registro==0){
                            respuesta = JOptionPane.showInputDialog("Ingrese 'Si' para continuar");

                            if (respuesta.equalsIgnoreCase("si")){
                                valida=0;
                            }
                        }else {
                            respuesta="no";
                        }
                    }while (respuesta.equalsIgnoreCase("si"));
                    break;
                case 2://Impromir lista estudiantes
                    if (valida!=0){
                        System.out.println();
                        System.out.print("|");
                        for (int i = 0; i < nombres.length ; i++) {
                            System.out.print(nombres[i] + " | ");
                        }
                    }else {
                        System.out.println("Debe registrar datos primero");
                    }
                    break;
                case 3://Imprimir lista notas
                    if (valida!=0){
                        System.out.println();
                        System.out.print("|");
                        for (int i = 0; i < notas.length ; i++) {
                            System.out.print(notas[i] + " | ");
                        }
                    }else {
                        System.out.println("Debe registrar datos primero");
                    }
                    break;
                case 4://SALIR
                    JOptionPane.showMessageDialog(null, "CHAOOO");
                    break;
                default:
                    System.out.print("La opcion no existe");
                    break;
            }
        }while (opcion!=4);

    }
}
