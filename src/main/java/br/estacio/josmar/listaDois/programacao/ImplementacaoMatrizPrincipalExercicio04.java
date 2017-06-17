/*
 * Implementação da classe Matriz
 * Criar uma classe Funcionario com as variáveis de instância: nome, cargo e superior
 * (chefe)
 * Criar uma classe Empresa que contém um Array de funcionários
 * Criar um método “listarFuncionarios” que imprima todos os funcionários de uma
 * empresa
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
