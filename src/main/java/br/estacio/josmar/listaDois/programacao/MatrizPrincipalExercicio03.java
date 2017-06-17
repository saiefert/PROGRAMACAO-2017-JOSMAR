/*
 * Implementação da classe Matriz
 * Criar uma classe chamada Matrizes
 * Criar um método para imprimir uma matriz recebida por parâmetro
 * Criar um método que tenha como parâmetros duas matrizes e retorne a matriz
 * correspondente a multiplicação delas
 * Declare, construa e inicialize 2 matrizes com números fixos de tamanhos diferentes
 * Imprimir a matriz de resultado na tela
 */
package br.estacio.josmar.listaDois.programacao;

/**
 *
 * @author josmar
 */
public class MatrizPrincipalExercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
 	
 	MatrizExercicio03 matrizes = new MatrizExercicio03();
 		
 	int[][] matrizUm = new int[2][2];
 	matrizUm[0][0] = 1;
 	matrizUm[1][1] = 2;
 	matrizUm[0][1] = 3;
 	matrizUm[1][0] = 4;
       
 		
 	int[][] matrizDois = new int [2][2];
 	matrizUm[0][0] = 1;
 	matrizUm[1][0] = 2;
 	matrizUm[0][1] = 3;
 	matrizUm[1][1] = 4;
        
        System.out.println("Matriz Um");
 	matrizes.imprimirMatriz(matrizUm);        
        System.out.println("\n");
 		
 	System.out.println("Matriz Dois");
 	matrizes.imprimirMatriz(matrizDois); 
        System.out.println("\n");
 		
 	int[][] multiplicacao = new int [2][2];
 	System.out.println("O resultado é: ");
 	multiplicacao = matrizes.multiplicarMatrizes (matrizUm, matrizDois, 2, 2);
 	matrizes.imprimirMatriz(multiplicacao);
 		
 	
 	}
 
 }
