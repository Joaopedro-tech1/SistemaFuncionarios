package empresa;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;
    
    public Funcionario(String nome, String cpf, double salarioBase) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSalarioBase(salarioBase);
    }
    public double calcularSalario() {
        return getSalarioBase();
    }
    public void exibirDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salário: " + this.calcularSalario());
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalarioBase() {
        return this.salarioBase;
    }
    public void setSalarioBase(double salario) {
        this.salarioBase = salario;
    }
}
