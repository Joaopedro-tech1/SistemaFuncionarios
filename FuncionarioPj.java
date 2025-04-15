package empresa;

public class FuncionarioPj extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    public FuncionarioPj(String nome, String cpf, double valorHora, int horasTrabalhadas) {
        super(nome, cpf, 0); // Salário base = 0 para PJ
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Valor da hora: R$" + valorHora);
        System.out.println("Salário total: R$" + calcularSalario());
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
