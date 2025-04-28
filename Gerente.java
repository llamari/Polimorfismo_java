public class Gerente extends Funcionario{
    private double salarioBase;
    private double bonus = 1000;

    public Gerente(double salarioBase, String nome){
        this.salarioBase = salarioBase;
        setNome(nome);
    }

    public double calcularSalarioFinal(){
        return salarioBase + bonus;
    }
}
