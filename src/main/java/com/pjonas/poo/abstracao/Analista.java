package com.pjonas.poo.abstracao;

public class Analista extends Funcionario implements AbonoSalarial{

    private String nivelCargo;
    private Double abono;

    public Analista(String nome, Integer idade, Double salario, String nivelCargo) {
        super(nome, idade, salario);
        this.nivelCargo = nivelCargo;
        this.abono = calculaAbonoSalario(salario);
    }

    @Override
    public String toString() {
        return "Analista{" +
                "nivelCargo='" + nivelCargo + '\'' +
                ", abono=" + abono +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }

    public static void main(String[] args) {
        Analista analista = new Analista("Jonas", 33, 8_000.00, "Pleno");

        System.out.println("Analista: " + analista);
        System.out.println("O abono do analista sera de: R$" + analista.abono);
    }

    @Override
    public Double calculaAbonoSalario(Double salario) {
        return salario + (salario * 0.2);
    }
}
