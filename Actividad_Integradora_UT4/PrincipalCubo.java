package Actividad_Integradora_UT4;

import javax.swing.*;
import java.util.ArrayList;

public class PrincipalCubo {
    public static void main(String[] args) {
        ArrayList<Cubo> cubos = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Cubo cubo = new Cubo();
            JOptionPane.showMessageDialog(null, "Registro del cubo numero "+i);
            cubo.solicitarLadoCubo();
            cubos.add(cubo);
        }

        Cubo cuboMayorVolumen = cubos.get(0);
        for (Cubo cubo : cubos) {
            if (cubo.calcularVolumenCubo() > cuboMayorVolumen.calcularVolumenCubo()) {
                cuboMayorVolumen = cubo;
            }
        }

        int cuboMayor = cubos.indexOf(cuboMayorVolumen)+1;

        JOptionPane.showMessageDialog(null, "El cubo con mayor volumen es el cubo numero "+cuboMayor+" con un volumen de "+cuboMayorVolumen.calcularVolumenCubo());
    }
}
