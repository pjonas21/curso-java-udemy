package com.pjonas.geral;

public class Variavel {

    public static void main(String[] args) {
        String nomeEstudante = "Paulo";
        int idade = 33;
        double salario = 1000.00;

        System.out.println("O nome do estudante eh: " + nomeEstudante + ", sua idade eh " + idade + " e seu salario eh de R$" + salario);

        System.out.println(
                "\nTamanho dos dados: \n" +
                        "\nMinimo Byte: " + Byte.MIN_VALUE +
                        "\nMaximo Byte: " + Byte.MAX_VALUE +
                        "\nMinimo Short: " + Short.MIN_VALUE +
                        "\nMaximo Short: " + Short.MAX_VALUE +
                        "\nMinimo Integer: " + Integer.MIN_VALUE +
                        "\nMaximo Integer: " + Integer.MAX_VALUE +
                        "\nMinimo Long: " + Long.MIN_VALUE +
                        "\nMaximo Long: " + Long.MAX_VALUE +
                        "\nMinimo Float: " + Float.MIN_VALUE +
                        "\nMaximo Float: " + Float.MAX_VALUE +
                        "\nMinimo Double: " + Double.MIN_VALUE +
                        "\nMaximo Double: " + Double.MAX_VALUE
        );
    }
}
