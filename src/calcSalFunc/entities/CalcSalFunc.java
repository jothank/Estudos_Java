package calcSalFunc.entities;

public class CalcSalFunc {
    public String nome;
    public double salarioBruto;
    public double desconto;
    public double porcentagem;

    public double salarioLiquido() {
        return salarioBruto - desconto;
    }

    public double aumentarSalario() {
        return ((salarioBruto * porcentagem) / 100) + salarioLiquido();
    }
}
