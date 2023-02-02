package calcRetangulo.application;

import calcRetangulo.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Coloque o valor da altura do retangulo: ");
        retangulo.altura = sc.nextDouble();

        System.out.println("Coloque o valor da largura do retangulo: ");
        retangulo.largura = sc.nextDouble();

        System.out.println();
        System.out.println(retangulo);

    }
}
