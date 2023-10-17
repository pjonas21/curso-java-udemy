package com.pjonas.poo.encapsulamento;

public class ContaCorrenteMain {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("1302", "070-0", 200.00);

        ContaCorrente cc = ContaCorrente.deposita(conta, 200.00);
        System.out.println("Conta com saldo atualizado: " + cc);
    }

}
