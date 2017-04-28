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
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = "Josmar";
        int idade = 24;
        float peso = 70;
        String tipoSanguineo = "O";
        String aniversario ="26/08/92";
        int numeroCalcado = 42;
        boolean civil = false;
                
        System.out.printf("Nome: %s", nome);
        System.out.printf("\nIdade: %d", idade);
        System.out.printf("\nPeso: %.2f", peso);
        System.out.printf("\nTipo Sanguineo: %s", tipoSanguineo);
        System.out.printf("\nAniversário: %s", aniversario);
        System.out.printf("\nNúmero do Calçado: %d", numeroCalcado);
        
        if(civil == false){       
            System.out.println("\nSolteiro!");        
        }else{
            System.out.println("\nCasado!"); 
        }
    }
    
}
