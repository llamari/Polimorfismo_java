public class Freelancer extends Funcionario {
    private double diasTrabalhados;
    private double valorPorDia;

    public Freelancer(double diasTrabalhados, double valorPorDia, String nome){
        this.diasTrabalhados = diasTrabalhados;
        this.valorPorDia = valorPorDia;
        setNome(nome);
    }

    public double calcularSalarioFinal(){
        return diasTrabalhados * valorPorDia;
    }
}