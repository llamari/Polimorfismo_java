import java.util.Scanner;

public class Empresa{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //leitura dos valores para criação do gerente
        System.out.println("Insira o nome do gerente: ");
        String nomeGerente = teclado.nextLine();
        System.out.println("Insira o salário-base do gerente: ");
        Double salarioBaseGerente = teclado.nextDouble();
        teclado.nextLine();

        //leitura dos valores para criação do freelancer
        System.out.println("Insira o nome do freelancer: ");
        String nomeFreelancer = teclado.nextLine();
        System.out.println("Insira o valor por dia do freelancer: ");
        Double valorDiaFreelancer= teclado.nextDouble();
        System.out.println("Insira a quantidade de dias trabalhados pelo freelancer: ");
        Double diasTrabalhadosFreelancer= teclado.nextDouble();
        teclado.nextLine();

        //leitura dos valores para criação do vendedor
        System.out.println("Insira o nome do vendedor: ");
        String nomeVendedor = teclado.nextLine();
        System.out.println("Insira o salario-base do vendedor: ");
        Double salarioBaseVendedor = teclado.nextDouble();
        System.out.println("Insira a comissão do vendedor: ");
        Double comissãoVendedor = teclado.nextDouble();


        //instanciação dos objetos
        Funcionario gerente = new Gerente(salarioBaseGerente, nomeGerente);
        Funcionario freelancer = new Freelancer(diasTrabalhadosFreelancer, valorDiaFreelancer, nomeFreelancer);
        Funcionario vendedor = new Vendedor(salarioBaseVendedor, comissãoVendedor, nomeVendedor);

        //Resultados
        System.out.println("O gerente "+ getNomeFuncionario(gerente) + " tem um salário de R$" + getSalarioFuncionario(gerente));
        System.out.println("O freelancer "+ getNomeFuncionario(freelancer)+ " tem um salário de R$" + getSalarioFuncionario(freelancer));
        System.out.println("O vendedor " + getNomeFuncionario(vendedor) + " tem um salário de R$" + getSalarioFuncionario(vendedor));
    }

    public static String getNomeFuncionario(Funcionario funcionario){
        return funcionario.getNome();
    }

    public static double getSalarioFuncionario(Funcionario funcionario){
        return funcionario.calcularSalarioFinal();
    }
}