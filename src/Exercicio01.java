import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite 3 numeros");

        int num01 = sc.nextInt();
        int num02 = sc.nextInt();
        int num03 = sc.nextInt();

        int maior = logicaMaior(num01, num02, num03);

        resultado(maior);

        sc.close();
    }

    private static int logicaMaior(int num01, int num02, int num03) {

        int maior = 0;

        if (num01 > num02 && num01 > num03) {
            maior = num01;
        } else if (num02 > num03) {
            maior = num02;
        } else {
            maior = num03;
        }
        return maior;
    }

    public static void resultado(int valor) {
        System.out.println("Numero maior foi: " + valor);
    }


}
