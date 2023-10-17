package com.pjonas.encapsulamento;

public class ContaCorrente {

    private String agencia;
    private String numConta;
    private Double saldo;

    public ContaCorrente(String agencia, String numConta, Double saldo) {
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public static ContaCorrente deposita(ContaCorrente contaCorrente, Double valor) {
        if (valor <= 0.00) {
            System.out.println("O valor de deposito deve ser maior que zero.");
            return null;
        }
        Double valorAtualizado = contaCorrente.getSaldo() + valor;

        System.out.println("Deposito realizado com sucesso");
        ContaCorrente cc = new ContaCorrente(contaCorrente.getAgencia(), contaCorrente.getNumConta(), valorAtualizado);
        return cc;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia='" + agencia + '\'' +
                ", numConta='" + numConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
