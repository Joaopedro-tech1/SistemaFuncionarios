# Sistema de Funcionários - Java

Este é um projeto simples em Java que simula o cálculo de salário de funcionários de uma empresa, utilizando herança e polimorfismo.

## Estrutura

- **Funcionario** (classe base):
  - Atributos: nome, CPF, salário base
  - Métodos: `calcularSalario()`, `exibirDados()`

- **FuncionarioClt** (herda de Funcionario):
  - Atributos: horas trabalhadas
  - Cálculo do salário: salário base + bônus (R$5 por hora)

- **FuncionarioPj** (herda de Funcionario):
  - Atributos: valor da hora, horas trabalhadas
  - Cálculo do salário: valor da hora * horas trabalhadas

## Exemplo de uso

O sistema pede que o usuário informe:

- Tipo de funcionário (CLT ou PJ)
- Nome, CPF
- Salário base (CLT) ou valor da hora (PJ)
- Horas trabalhadas

Depois exibe os dados e o salário calculado.
