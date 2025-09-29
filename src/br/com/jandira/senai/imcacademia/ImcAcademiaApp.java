package br.com.jandira.senai.imcacademia;

import br.com.jandira.senai.imcacademia.model.ProgramaImc;

public class ImcAcademiaApp {

    public static void main (String []args){

        System.out.println("Inciando aplicativo.....");
        System.out.println("------------------------------");
        System.out.println("Calculadora IMC para academia");
        System.out.println("------------------------------");
        System.out.println();

        br.com.jandira.senai.imcacademia.model.ProgramaImc programa = new ProgramaImc();
        programa.obterDadosDoAluno();

    }
}
