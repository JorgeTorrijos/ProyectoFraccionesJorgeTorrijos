package clases;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        /*
         * Ejemplo de uso del método CalculosMatematicos.divisores
         * Este método descompone un número en factores primos
         * Retornando un mapa con los factores primos
         */
        int num = 180;
        SortedMap<Integer, Integer> divisores = new TreeMap<>();
        divisores = CalculosMatematicos.divisores(num);
        for (Map.Entry<Integer, Integer> entrada : divisores.entrySet()) {
            int divisor = entrada.getKey();
            int numeroVeces = entrada.getValue();
            for (int i = 1; i <= numeroVeces; i++) {
                System.out.println(num + "\t|\t" + divisor);
                num = num / divisor;
            }
        }

        System.out.println("\nHecho con Streams\n");
        AtomicInteger num2 = new AtomicInteger(180);
        divisores.forEach((k, v) -> {
            for (int i = 1; i <= v; i++) {
                System.out.println(num2 + "\t|\t" + k);
                num2.set(num2.get() / k);
            }
        });
        Fraccion ejempoFraccion = new Fraccion(3, 100);
        System.out.println("\n\nPara ver como funciona toString en Fraccion:\t" + ejempoFraccion);

    }
}
