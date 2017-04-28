/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.josmar.revisao;
import java.util.Scanner;

/**
 *
 * @author josmar
 */
public class Exercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int quant, numero=1;
        System.out.println("Digite um número inteiro: ");
        Scanner num = new Scanner(System.in);
        quant = num.nextInt();
        int[][] matriz = new int[quant][quant];
        for(int i=0;i<matriz.length;i++){ 
            for(int j=0;j<matriz[i].length;j++){
                   matriz[i][j]=numero++;
                   System.out.printf("\t%d",matriz[i][j]);
                   
               }
            System.out.println();

            }
    
    }
    
}
