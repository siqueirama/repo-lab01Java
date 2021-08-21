package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       //exec 01
        String apelido = "Gomez";
        int idade = 35;
        boolean comper;
        double saldo = 45857.90d;
        String nome = "Juli"+'\u00e1'+"n";


        //exec 02
        String nomeNome;
        double vlrSaldo;
        String nomeApelido;
        boolean cartMotorista;
        float altPessoa;
        int qtdFilhos;

        // Resolucao Exercicio 3

        System.out.println("Insira a quantidade de Dias:");
        Scanner vDias = new Scanner(System.in);

        int vDiasDigitado = vDias.nextInt();
        int vSoma = 0;
        int resultado = 0;

        resultado = vDiasDigitado * 2;
        System.out.println(resultado);

        //exec 04

        Scanner teclado = new Scanner(System.in) ;
        System.out.println ("insira o valor bruto do premio: ");
        float num = teclado.nextInt();

        double imp01 = num - (0.0245 * num);
        double imp02 = imp01 - (0.15 * imp01);
        double imp03 = imp02 - (0.03 * imp02) ;
        Locale localeBR = new Locale("pt","BR");

        NumberFormat valor = NumberFormat.getCurrencyInstance(localeBR);

        System.out.println("Valor total sobre o imposto 1 de 2,45% : "+valor.format(imp01));
        System.out.println("Valor total sobre o imposto 2 de   15% : "+valor.format(imp02));
        System.out.println("Valor total sobre o imposto 3 de    3% : "+valor.format(imp03));



    }
}
