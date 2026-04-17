package Actividad_Integradora_UT4;

import java.util.ArrayList;
import java.util.Collections;

public class GestorCubos {
    private ArrayList<Cubo> listaCubos;

    public GestorCubos() {
        listaCubos = new ArrayList<Cubo>();
    }

    public ArrayList<Cubo> getListaCubos() {
        return listaCubos;
    }

    public void inicializarYPoblar(ArrayList<Cubo> cubosIniciales) {
        listaCubos.clear();
        for (int i = 0; i < cubosIniciales.size(); i++) {
            listaCubos.add(cubosIniciales.get(i));
        }
    }

    public void ordenarCubosporLadoMayorMenor() {
        Collections.sort(listaCubos, Collections.reverseOrder());
    }

    public boolean cabeDentro(Cubo interno, Cubo externo) {
        if(interno.getLado() < externo.getLado()) {
            return true;
        } else {
            return false;
        }
    }
}
