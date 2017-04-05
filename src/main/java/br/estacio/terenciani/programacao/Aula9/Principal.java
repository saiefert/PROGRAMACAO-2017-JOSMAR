/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao.Aula9;
//import br.estacio.terenciani.programacao.Aula9.Aluno;
/**
 *
 * @author josmar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nomear("Josmar");
        aluno.gerarRA(2016);
        
        System.out.println("Qual é seu RA?");
        System.out.println(aluno.responderRA());
    }
    
}
