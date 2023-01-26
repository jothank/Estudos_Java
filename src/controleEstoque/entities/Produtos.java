package controleEstoque.entities;

public class Produtos {

    public String nome;
    public double valor;
    public int quantidade;

    public double totalValorEmEstoque() {
        return valor * quantidade;
    }

    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return "Produto " +
                "nome =" + nome +
                ", valor =R$" + String.format("%.2f", valor) +
                ", quantidade =" + quantidade +
                ", Total em estoque =R$" + String.format("%.2f", totalValorEmEstoque());
    }
}
