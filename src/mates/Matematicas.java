package mates;

public class Matematicas{
    /**
     * * Genera una aproximación al número Pi mediante el método de
     * * Montecarlo. El parámetro `pasos` indica el número de puntos
     * * generado.
     * */
    public static double generarNumeroPiIterativo(long pasos){
        double x = 0;
        double y = 0;
        
        int i = 0;
        double PuntosDentro = 0;

        while (i < pasos) {
            x = Math.random();
            y = Math.random();
            double rango = x * x + y * y;

            if (rango <= 1){
                PuntosDentro++;
            }
            i++;
        }
         
        return 4.0 * (PuntosDentro/pasos);
    }
}
