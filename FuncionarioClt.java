package empresa;

public class FuncionarioClt extends Funcionario {
    private double bonus;
    private int horasTrabalhadas;

    public FuncionarioClt(String nome, String cpf, double salarioBase, int horasTrabalhadas) {
        super(nome, cpf, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.bonus = horasTrabalhadas * 5.0; 
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Bônus (R$5 por hora): R$" + bonus);
        System.out.println("Salário total: R$" + calcularSalario());
    }

    public double getBonus() {
        return bonus;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
}
