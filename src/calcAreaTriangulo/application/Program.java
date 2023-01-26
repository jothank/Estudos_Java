package calcAreaTriangulo.application;

import calcAreaTriangulo.entities.Triangulo;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre com a medida do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com a medida do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area do Triangulo X é: %.4f%n", areaX);
        System.out.printf("Area do Triangulo Y é: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior area é X");
        } else if (areaX == areaY) {
            System.out.println("Areas com os mesmos tamanhos");
        } else {
            System.out.println("Maior area é Y");
        }

        sc.close();

    }
}
