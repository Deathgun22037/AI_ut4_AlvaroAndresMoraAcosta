package Actividad_Integradora_UT4;

public class Main {
    /**
     * Metodo principal del programa, donde se ejecuta un bucle que se rompe al llegar a un valor de 100,
     * dentro del bucle unas variables realziaran sumas y restas modificandose entre si mismas, guardando todo en
     * una variable total y despues hacinedo un backup del mismo.
     * @param args
     */
        public static void main(final String[] args) {
            int contadorTotal = 0;
            int sumador = 15;
            int registroSumador = 20;
            int valor = 0;
            do {
                registroSumador = 10 + sumador;
                valor = valor + registroSumador;
                valor++;
                if (valor < 10) {
                    contadorTotal = 15;
                    valor = valor -1;
                } else {
                    contadorTotal = 10;
                    valor = valor -1;
                }
                int backUpContadorTotal;
                backUpContadorTotal = valor;
                contadorTotal = backUpContadorTotal;
            } while (valor < 100);
            //Añadimos mejora para que el programa enseñe el resultado final.
            System.out.println("El resultado final del contador es: "+contadorTotal);
        }
}
