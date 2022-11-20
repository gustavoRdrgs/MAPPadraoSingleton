package FormasGeometricas;

import java.util.ArrayList;

public class Quadrado {

    private double lado;
    private static ArrayList<Quadrado> arrQuadr = new ArrayList<>();


    public Quadrado(double lado) {
        this.lado = lado;
    }


    public static void addNovoQuadrado(double lado) {

        arrQuadr.add(new Quadrado(lado));
    }


    public static void mostrarArea() {

        if (arrQuadr.size() == 0) {

            System.out.println("Nenhum quadrado ainda foi instanciado\n");

        } else {

            for (Quadrado qdrd: arrQuadr) {

                System.out.println("A área do quadrado " + (arrQuadr.indexOf(qdrd) + 1)+
                    " é de " + (qdrd.getLado() * qdrd.getLado()));
            }

        }

    }


    public double getLado() {
        return lado;
    }
    
}

