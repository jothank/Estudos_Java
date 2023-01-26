package controleEstoque.application;

import controleEstoque.entities.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produtos produtos = new Produtos();
        System.out.println("Coloque as informações do produto");
        System.out.println("Nome do Produto: ");
        produtos.nome = sc.nextLine();
        System.out.println("Valor do Produto: ");
        produtos.valor = sc.nextDouble();
        System.out.println("Quantidade do Produto: ");
        produtos.quantidade = sc.nextInt();

        System.out.println(produtos);

        sc.close();
    }
}
