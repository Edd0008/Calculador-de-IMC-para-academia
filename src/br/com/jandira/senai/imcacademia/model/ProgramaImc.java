package br.com.jandira.senai.imcacademia.model;

import java.util.Scanner;

public class ProgramaImc {

    String nomeDoAluno;
    double pesoDoAluno;
    double alturaDoAluno;
    double imcDoAluno;
    String statusDoAluno;

    public void obterDadosDoAuno(){
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

        alturaDoAluno = (alturaDoAluno * alturaDoAluno);
        imcDoAluno = (pesoDoAluno/ alturaDoAluno);


        definirStatusDoAluno();
    }

    public void definirStatusDoAluno(){

        if (imcDoAluno < 18.6){
            statusDoAluno = "abaixo do peso";

        }else if (imcDoAluno >= 18.6 && imcDoAluno <=24.9){
            statusDoAluno = "peso ideal (parabéns!)";

        }else if (imcDoAluno>= 25.0 && imcDoAluno <=29.9){
            statusDoAluno = "levemente acima do peso";

        }else if (imcDoAluno >= 30.0 && imcDoAluno <=34.9){
            statusDoAluno = "Obesidade garu 1";

        }else if (imcDoAluno >= 35.0 && imcDoAluno <=39.9){
            statusDoAluno = "Obesidade grau 2 (severa)";

        }else{
            statusDoAluno = "Obesidade grau 3 (mórbida)";
        }

        exibirResultados();
    }

    public void exibirResultados(){

        System.out.println("---Resultados---");
        System.out.println("Aluno: " + nomeDoAluno);
        System.out.println("ImcCalculado: " + imcDoAluno);
        System.out.println("Status: " + statusDoAluno);
        System.out.println("----------------");
    }
}
