package Actividad_Integradora_UT4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalCubo {
    public static void main(String[] args) {
        ArrayList<Cubo> cubos = new ArrayList<>();
        Scanner tec = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            Cubo cubo = new Cubo();
            JOptionPane.showMessageDialog(null, "Registro del cubo numero "+i);
            cubo.solicitarLadoCubo();
            cubos.add(cubo);
        }
        //Añadimos interfaz de interaccion entre ver los 3 cubos y sus valores y el cubo con mayor volumen.
        boolean puerta = true;

        do {
            System.out.println("Por favor seleccione una funcion");
            System.out.println("1. Ver los 3 cubos registrados y sus valores");
            System.out.println("2. Ver el cubo con mayor volumen");
            System.out.println("3. Salir del programa");
            int opcion = tec.nextInt();
            switch(opcion) {
                case 1:
                    for (int i = 0; i < cubos.size(); i++) {
                        int numCubo = i+1;
                        System.out.println("Cubo numero "+numCubo);
                        System.out.println("Lado: "+cubos.get(i).getLado());
                        System.out.println("Area de la base: "+cubos.get(i).calcularBaseCubo());
                        System.out.println("Volumen: "+cubos.get(i).calcularVolumenCubo());
                        System.out.println();
                    }
                    break;

                case 2:
                    Cubo cuboMayorVolumen = cubos.get(0);
                    for (Cubo cubo : cubos) {
                        if (cubo.calcularVolumenCubo() > cuboMayorVolumen.calcularVolumenCubo()) {
                            cuboMayorVolumen = cubo;
                        }
                    }

                    int cuboMayor = cubos.indexOf(cuboMayorVolumen)+1;

                    JOptionPane.showMessageDialog(null, "El cubo con mayor volumen es el cubo numero "+cuboMayor+" con un volumen de "+cuboMayorVolumen.calcularVolumenCubo());
                    break;

                case 3:
                    puerta = false;
                    JOptionPane.showMessageDialog(null, "Saliendo del programa gracias por utilizarlo");
                default:
            }
        } while (puerta);

    }
}
