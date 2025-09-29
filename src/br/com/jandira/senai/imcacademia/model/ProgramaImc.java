package br.com.jandira.senai.imcacademia.model;

import java.util.Scanner;

public class ProgramaImc {

    String nomeDoAluno;
    double pesoDoAluno;
    double alturaDoAluno;
    double imcDoAluno;
    String statusDoAluno;

    public void obterDadosDoAluno(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do aluno(a): ");
        nomeDoAluno = leitor.nextLine();

        System.out.print("Digite o peso (em Kg): ");
        pesoDoAluno = leitor.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        alturaDoAluno = leitor.nextDouble();

        calcularImcDoAluno();

    }

    public void calcularImcDoAluno(){

        imcDoAluno = pesoDoAluno / (alturaDoAluno * alturaDoAluno);


        definirStatusDoAluno();
    }

    public void definirStatusDoAluno(){

        if (imcDoAluno < 18.6){
            statusDoAluno = "abaixo do peso";

        }else if (imcDoAluno >= 18.6 && imcDoAluno <25.0){
            statusDoAluno = "peso ideal (parabéns!)";

        }else if (imcDoAluno>= 25.0 && imcDoAluno <30.0){
            statusDoAluno = "levemente acima do peso";

        }else if (imcDoAluno >= 30.0 && imcDoAluno <35.0){
            statusDoAluno = "Obesidade grau 1";

        }else if (imcDoAluno >= 35.0 && imcDoAluno <40.0){
            statusDoAluno = "Obesidade grau 2 (severa)";

        }else{
            statusDoAluno = "Obesidade grau 3 (mórbida)";
        }

        exibirResultados();
    }

    public void exibirResultados(){

        System.out.println("---Resultados---");
        System.out.println("Aluno: " + nomeDoAluno);
        System.out.printf("IMC calculado: %.2f%n", imcDoAluno);
        System.out.println("Status: " + statusDoAluno);
        System.out.println("----------------");
    }
}
