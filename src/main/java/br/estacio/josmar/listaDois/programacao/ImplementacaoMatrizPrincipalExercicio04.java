/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.josmar.listaDois.programacao;

import java.util.Scanner;

/**
 *
 * @author josmar
 */
public class ImplementacaoMatrizPrincipalExercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
 	ImplementacaoMatrizEmpresaExercicio04 empresa = new ImplementacaoMatrizEmpresaExercicio04();
	Scanner sc = new Scanner(System.in);
 	System.out.println("Entre com o número de colaboradores: ");
 	int total = sc.nextInt();
 	empresa.quantidade(total);
 		
            for(int i = 0; i< total; i++ ){
            ImplementacaoMatrizColaboradorExercicio04 novoColaborador = new ImplementacaoMatrizColaboradorExercicio04();
 			
            System.out.println("Nome: ");
            String nome = sc.next();
            novoColaborador.setNome(nome);
 			
            System.out.println("Cargo: ");
            String cargo = sc.next();
            novoColaborador.setCargo(cargo);
 			
            empresa.adicionaColaborador(i, novoColaborador);
 			
            }
 		empresa.mostrarColaboradores();
 		sc.close();
 	}
 }
