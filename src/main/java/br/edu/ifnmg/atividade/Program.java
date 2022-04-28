package br.edu.ifnmg.atividade;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

       
        int n = 1;


        switch (n) {

            case 1:
                Teste teste1 = new Teste();
                teste1.testeUm();
                break;
            case 2:
                Teste teste2 = new Teste();
                teste2.testeDois();
                break;
            case 3:
                Teste teste3 = new Teste();
                teste3.testeTres();
                break;
            case 4:
                Teste teste4 = new Teste();
                teste4.testeQuatro();
                break;
            case 5:
                Teste teste5 = new Teste();
                teste5.testeCinco();
                break;
            default:
                System.out.println("Operação inválida!");
        }
    }

}
