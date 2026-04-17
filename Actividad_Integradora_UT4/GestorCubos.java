package Actividad_Integradora_UT4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Esta clase se encarga de gestionar una lista de cubos, tiene como atributo privado la propia lista de cubos,
 * un constructor vacio que inicializa la lista de cubos, un metodo getter para poder acceder a la lista de cubos desde otra clase,
 * un metodo que inicializa limpia y pobla la lista con los cubos introducidos por el usuario,
 * otro metodo que ordena la lista de cubos por su lado de mayor a menor, y por ultimo un metodo
 * que recibe dos cubos y devuelve un booleano basandose en si caben uno dentro del otro o no.
 */

public class GestorCubos {
    private ArrayList<Cubo> listaCubos;

    /**
     * Constructor vacio que inicializa la lista de cubos.
     */

    public GestorCubos() {
        listaCubos = new ArrayList<Cubo>();
    }

    /**
     * Metodo getter para poder acceder a la lista de cubos desde otra clase.
     * @return
     */

    public ArrayList<Cubo> getListaCubos() {
        return listaCubos;
    }

    /**
     * Metodo que inicializa limpia y pobla la lista con los cubos introducidos por el usuario.
     * @param cubosIniciales
     */

    public void inicializarYPoblar(ArrayList<Cubo> cubosIniciales) {
        listaCubos.clear();
        for (int i = 0; i < cubosIniciales.size(); i++) {
            listaCubos.add(cubosIniciales.get(i));
        }
    }

    /**
     * Metodo que ordena la lista de cubos por su lado de mayor a menor.
     */

    public void ordenarCubosporLadoMayorMenor() {
        Collections.sort(listaCubos, Collections.reverseOrder());
    }

    /**
     * Metodo que recibe dos cubos y devuelve un booleano basandose en si caben uno dentro del otro o no. Gracias a su tamaño de lado, si el lado del cubo interno es menor al externo
     * por logica cabra dentro.
     * @param interno
     * @param externo
     * @return
     */

    public boolean cabeDentro(Cubo interno, Cubo externo) {
        if(interno.getLado() < externo.getLado()) {
            return true;
        } else {
            return false;
        }
    }
}
