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
public class MatrizExercicio03 {    

    public void imprimirMatriz(int[][] matriz){
        for (int[] matrizUm : matriz) {
            for (int b = 0; b < matrizUm.length; b++) {
                System.out.println("|" + matrizUm[b] + "|");
            }
        }
 	}
 	public int[][] multiplicarMatrizes(int[][] matrizUm, int[][] matrizDois, int qtda, int qtdb){
 		int[][] resultado = new int[qtda][qtdb];
 		for (int i = 0; i < matrizUm.length; i++ ){
 			for (int j = 0; j < matrizUm.length; j++){
 				resultado[i][j] = (matrizUm[i][j] * matrizDois[i][j]);
 			}
 		}
 		return resultado;
 	}
}
