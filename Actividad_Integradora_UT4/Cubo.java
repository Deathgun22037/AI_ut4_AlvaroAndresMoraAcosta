package Actividad_Integradora_UT4;

import javax.swing.*;

/**
 * Esta clase representa un cubo, tiene un atributo lado float privado, un constructor vacio y otro que genera el objeto cubo con el valor del lado dado por el usuario,
 * tambine posee los metodos getter y setter para poder interactuar con la variable lado desde otra clase,
 * ademas tiene un metodo para calcular la area de la base del cubo, otro para su volumen, otro para solicitar al usuario el lado del cubo
 * el cual cuenta con un control de errores en caso de que introduzca algo contrario a un numero o un numero negativo o 0, por ultimo
 * dos metodos que muestran un mensaje con el area de la base del cubo y otro con el volumen del cubo.
 */

public class Cubo {
    private float lado;

    /**
     * Constructor vacio no hace nada pero sirve para crear un cubo sin necesidad de valor, ademas buena praxis.
     */
    public Cubo() {
    }

    /**
     * Constructor el cual genera el objeto cubo gracias al valor dado por el usuario, siendo este el lado.
     * @param lado
     */

    public Cubo(float lado) {
        this.lado = lado;
    }

    /**
     * Metodos getter y setter para poder interactuar con la variable lado desde otra clase.
     * @return
     */

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    /**
     * Metodo para calcular el area de la base del cubo.
     * @return
     */

    public float calcularBaseCubo() {
        return lado * lado;
    }

    /**
     * Metodo para calcular el volumen del cubo.
     * @return
     */

    public float calcularVolumenCubo() {
        return lado * lado * lado;
    }

    /**
     * Metodo que solicita al usuario el lado del cubo, el cual cuenta con un control de errores que evitara que introduzca algo
     * contrario a un numero, o un numero negativo o 0.
     */

    public void solicitarLadoCubo() {
        while (true) {
            String num;
            num = JOptionPane.showInputDialog(null, "Por favor ingrese un lado del cubo");
            if (num == null) {
                JOptionPane.showMessageDialog(null, "No se ha ingresado un valor terminando el programa");
                break;
            }

            try {
                float lado = Float.parseFloat(num.replace(',','.')); //Añado este replace para que si el usuario introduce el lado en comas algo normal lo cambie a lenguaje java por un punto ya que procesa las comas igual.
                if (lado > 0) {
                    this.lado = lado;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: el lado introducido no puede ser negativo ni 0");
                }
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: el lado introducido no es un numero valido, por favor ingrese un numero");
                continue;
            }
        }
    }

    /**
     * Metodos que muestran un mensaje con el area de la base del cubo y otro con el volumen del cubo.
     */

    public void mensajeAreaBaseCubo() {
        JOptionPane.showMessageDialog(null, "El area de la base del cubo es: "+calcularBaseCubo());
    }

    public void mensajeVolumenCubo() {
        JOptionPane.showMessageDialog(null, "El volumen del cubo es: "+calcularVolumenCubo());
    }
}
