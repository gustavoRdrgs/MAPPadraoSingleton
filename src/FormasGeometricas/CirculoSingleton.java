package FormasGeometricas;

import java.util.Scanner;

public class CirculoSingleton {

    private static CirculoSingleton circuloSingleton = null;
    private static double raio;


    public CirculoSingleton (double raio) {
        CirculoSingleton.raio = raio;
    }

    
    public static synchronized CirculoSingleton getInstance(Scanner sc) {

        if (circuloSingleton == null) {
            System.out.println("O círculo ainda não foi instanciado, informe o raio do círculo\n");
            circuloSingleton = new CirculoSingleton(sc.nextDouble());
        } else {
            System.out.println("O círculo foi selecionado\n");
        }

        return circuloSingleton;
    }
    

    public static String mostrarArea() {
        if (circuloSingleton == null) {
            return "Esse objeto ainda não foi instanciado";
        }
        return "A área do círculo é de " + (3.1416 * Math.pow(raio, 2));
    }
    
}
