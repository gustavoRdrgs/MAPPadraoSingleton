package FormasGeometricas;

import java.util.Scanner;

public class TrianguloSingleton {

    private static TrianguloSingleton trianguloIsos = null;
    private static TrianguloSingleton trianguloEqui = null;
    private static TrianguloSingleton trianguloRetan = null;
    private static TrianguloSingleton trianguloAtual = null;
    private String nome;
    private double base;
    private double altura;

    public TrianguloSingleton(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    public static synchronized TrianguloSingleton getInstance(int num, Scanner sc) {

        if (num == 1) {

            if (trianguloIsos == null) {

                System.out.println("O triângulo isósceles ainda não foi instanciado\nInforme a base e a altura do triangulo isósceles\n");
                double base = sc.nextDouble();
                double altura = sc.nextDouble();
                trianguloIsos = new TrianguloSingleton(base, altura);
                trianguloIsos.setNome("isósceles");
                trianguloAtual = trianguloIsos;
                System.out.println("O triangulo isósceles foi selecionado\n");
                return trianguloIsos;

            } else {

                System.out.println("O triangulo isósceles foi selecionado\n");
                trianguloAtual = trianguloIsos;
            }
            
        }
        if (num == 2) {

            if (trianguloEqui == null) {

                System.out.println("O triângulo equilátero ainda não foi instanciado\nInforme a base e a altura do triangulo equilátero\n");
                double base = sc.nextDouble();
                double altura = sc.nextDouble();
                trianguloEqui = new TrianguloSingleton(base, altura);
                trianguloEqui.setNome("equilátero");
                trianguloAtual = trianguloEqui;
                System.out.println("O triangulo equilátero foi selecionado\n");
                return trianguloEqui;

            } else {

                System.out.println("O triangulo equilátero foi selecionado\n");
                trianguloAtual = trianguloEqui;
            }
            
        }
        if (num == 3) {

            if (trianguloRetan == null) {

                System.out.println("O triângulo retângulo ainda não foi instanciado\nInforme a base e a altura do triangulo retângulo\n");
                double base = sc.nextDouble();
                double altura = sc.nextDouble();
                trianguloRetan = new TrianguloSingleton(base, altura);
                trianguloRetan.setNome("retângulo");
                trianguloAtual = trianguloRetan;
                System.out.println("O triangulo retângulo foi selecionado\n");
                return trianguloRetan;

            } else {

                System.out.println("O triangulo retângulo foi selecionado\n");
                trianguloAtual = trianguloRetan;
            }
            
        }
        return null;
    }


    public static String mostrarArea() {

        if (trianguloAtual == null) {

            return ("Nenhum triângulo foi selecionado\n");
        }

        return ("A área do triângulo " + trianguloAtual.getNome() + " é de "+
            ((trianguloAtual.getBase() * trianguloAtual.getAltura()) / 2)+"\n");
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getBase() {
        return base;
    }


    public double getAltura() {
        return altura;
    }

}
