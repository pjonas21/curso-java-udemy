package com.pjonas.abstracao;

public class Medico extends Funcionario{

    private String especialidade;
    private String crm;


    public Medico(String nome, Integer idade, Double salario, String especialidade, String crm) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "especialidade='" + especialidade + '\'' +
                ", crm='" + crm + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                "} " + super.toString();
    }

    public static void main(String[] args) {
        Medico medico = new Medico("Jonas", 33, 10_000.00, "clinico geral", "1234");

        System.out.println(medico);
        System.out.println("Decimo terceiro salario: " + medico.calcularDecimoTerceiro(medico.getSalario()));
    }
}
