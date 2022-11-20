package External;

import java.util.InputMismatchException;
import java.util.Scanner;
import FormasGeometricas.CirculoSingleton;
import FormasGeometricas.Quadrado;
import FormasGeometricas.TrianguloSingleton;

public class Facade {
    
    int option;
    int optTrian;
    Scanner sc = new Scanner(System.in);


    public Facade() {
    }


    public void menu() {

        while (option != -1) {

            System.out.println("FÁBRICA DE FIGURAS GEOMÉTRICAS\n\nDigite 1 para selecionar o círculo\n"+
                "Digite 2 para selecionar um triângulo\nDigite 3 para criar um quadrado\nDigite 4 para "+
                "exibir a área do círculo\nDigite 5 para exibir a área dos triângulos\n"+
                "Digite 6 para exibir a área dos quadrados\n\nDigite qualquer outra coisa para sair\n");

            try {
                option = sc.nextInt();

            } catch(InputMismatchException e) {
                option = -1;

            }

            if (option == 1) {

                CirculoSingleton.getInstance(sc);

            } else if (option == 2) {

                System.out.println("Digite 1 para selecionar o triângulo isósceles\nDigite 2 para selecionar"+
                    " o triângulo equilátero\nDigite 3 para selecionar o triângulo retângulo\n");
                optTrian = sc.nextInt();
                if ((optTrian < 1) || (optTrian > 3)) {
                    System.out.println("Você não digitou uma opção válida");
                } else {
                    TrianguloSingleton.getInstance(optTrian, sc);
                }

            } else if (option == 3) {

                System.out.println("Informe o valor dos lados do quadrado\n");
                Quadrado.addNovoQuadrado(sc.nextDouble());

            } else if (option == 4) {

                System.out.println(CirculoSingleton.mostrarArea()+"\n");

            } else if (option == 5) {

                System.out.println(TrianguloSingleton.mostrarArea());

            } else if (option == 6) {

                Quadrado.mostrarArea();

            } else {
                option = -1;
            }

        }
    }
    
}
