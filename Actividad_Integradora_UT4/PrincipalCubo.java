package Actividad_Integradora_UT4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalCubo {
    public static void main(String[] args) {
        GestorCubos gestorCubos = new GestorCubos();
        ArrayList<Cubo> cubosIniciales = new ArrayList<Cubo>();

        Cubo cubo1 = new Cubo(3);
        Cubo cubo2 = new Cubo(5);
        Cubo cubo3 = new Cubo(7);
        cubosIniciales.add(cubo1);
        cubosIniciales.add(cubo2);
        cubosIniciales.add(cubo3);

        gestorCubos.inicializarYPoblar(cubosIniciales);

        gestorCubos.ordenarCubosporLadoMayorMenor();
        for(Cubo cubo : gestorCubos.getListaCubos()) {
            System.out.println("Lado del cubo: " + cubo.getLado());
        }

        Cubo pequeño = cubosIniciales.get(1);
        Cubo grande = cubosIniciales.get(2);
        boolean encaja = gestorCubos.cabeDentro(pequeño, grande);
        if(encaja) {
            System.out.println("El cubo pequeño cabe dentro del cubo grande.");
        } else {
            System.out.println("El cubo pequeño no cabe dentro del cubo grande.");
        }
    }
}

