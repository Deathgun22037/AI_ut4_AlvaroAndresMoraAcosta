package Actividad_12;

/**
 * Cono.java
 * Clase que representa un cono utilizando composición con la clase Circulo para su base.
 * Contiene atributos para la altura y el color del cono, así como métodos para acceder a ellos e imprimir su información.
 *
 * @author [Tu Nombre]
 * @version 1.0
 */

public class Cono {
    private Circulo base;
    private float altura;
    private String color;
    public Cono (float cX, float cY, float r, float h, String color) { // constructor
        this.base = new Circulo(cX, cY, r);
        this.altura = h;
        this.color = color;
    }

    /**
     * Métodos de acceso para los atributos del cono, incluyendo el objeto Circulo que representa su base, la altura y el color.
     * @return
     */
    public Circulo getBase() {
        return base;
    }

    /**
     * Método para establecer la base del cono utilizando un objeto de la clase Circulo.
     * @param base
     */
    public void setBase(Circulo base) {
        this.base = base;
    }

    /**
     * Métodos de acceso para la altura y el color del cono, permitiendo obtener y modificar estos atributos según sea necesario.
     * @return
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Método para establecer la altura del cono, permitiendo modificar este atributo según sea necesario.
     * @param altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Métodos de acceso para el color del cono, permitiendo obtener y modificar este atributo según sea necesario.
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * Método para establecer el color del cono, permitiendo modificar este atributo según sea necesario.
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método para imprimir la información del cono, incluyendo los detalles de su base (utilizando el método imprimir de la clase Circulo) y sus atributos específicos como la altura y el color.
     */
    public void imprimir () {
        base.imprimir();
        System.out.println(" h=" + altura + " c=" + color);
    }
}
