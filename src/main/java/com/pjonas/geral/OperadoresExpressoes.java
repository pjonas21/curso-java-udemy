package com.pjonas.geral;

public class OperadoresExpressoes {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int restoDivisao = a % b;

        System.out.println("soma: " + soma);
        System.out.println("subtracao: " + subtracao);
        System.out.println("multiplicacao: " + multiplicacao);
        System.out.println("divisao: " + divisao);
        System.out.println("restoDivisao: " + restoDivisao);

        // Operadores atribuicao
        a += 5;
        System.out.println("a += 5 eh: " + a);

        a -= 5;
        System.out.println("a -= 5 eh: " + a);

        a *= 2;
        System.out.println("a *= 2 eh: " + a);

        a /= 2;
        System.out.println("a /= 2 eh: " + a);
    }
}
