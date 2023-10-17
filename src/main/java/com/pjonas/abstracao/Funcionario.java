package com.pjonas.abstracao;

public class Funcionario {
    
    protected String nome;
    protected Integer idade;
    protected Double salario;

    public Funcionario(String nome, Integer idade, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Double getSalario() {
        return salario;
    }

    public Double calcularDecimoTerceiro(Double salario) {
        return salario + (salario * 0.10);
    }

    @Override
    public String toString() {
        return "Funcionário [Nome: " + nome + ", Idade: " + idade + ", Salário: R$" + salario + "]";
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jonas", 33, 5400.00);
//        Double decimoTerceiro = calcularDecimoTerceiro(funcionario.getSalario());

        System.out.println("Funcionário: " + funcionario);
//        System.out.println("Décimo terceiro salário: R$" + decimoTerceiro);
    }
    
    
}
