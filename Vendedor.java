public class Vendedor extends Funcionario{
    private double salarioBase;
    private double comissao;

    public Vendedor(double salarioBase, double comissao, String nome){
        this.salarioBase = salarioBase;
        this.comissao = comissao;
        setNome(nome);
    }

    public double calcularSalarioFinal(){
        return salarioBase + comissao;
    }
}
