/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.josmar.revisao;


/**
 *
 * @author josmar
 */
public class PrincipalExercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlunoExercicio14 aluno = new AlunoExercicio14();
        aluno.nomear("Josmar");
        aluno.gerarRA(2016);
        
        System.out.println("Qual é seu RA?");
        System.out.println(aluno.responderRA());
    }
    
}

