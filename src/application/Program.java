package application;

import java.util.Map;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Entre com a medida do triangulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Entre com a medida do triangulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Area do Triangulo X é: %.4f%n", areaX);
        System.out.printf("Area do Triangulo Y é: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior area é X");
        } else {
            System.out.println("Maior area é Y");
        }

        sc.close();

    }
}
