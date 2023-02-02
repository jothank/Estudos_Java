package calcSalFunc.application;

import calcSalFunc.entities.CalcSalFunc;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CalcSalFunc calcSalFunc = new CalcSalFunc();

        System.out.println("Coloque seu nome: ");
        calcSalFunc.nome = sc.nextLine();

        System.out.println("Coloque salario bruto: ");
        calcSalFunc.salarioBruto = sc.nextDouble();

        System.out.println("Coloque desconto: ");
        calcSalFunc.desconto = sc.nextDouble();

        System.out.println("Empregado: " + calcSalFunc.nome + ", R$ " + calcSalFunc.salarioLiquido());

        System.out.println("Qual porcentagem de aumento? ");
        calcSalFunc.porcentagem = sc.nextDouble();

        System.out.println("Atualizado valor do empregado: " + calcSalFunc.nome + ", R$ " + calcSalFunc.aumentarSalario());


    }

}
