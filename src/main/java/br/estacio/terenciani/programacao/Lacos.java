/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Lacos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float nota = 0, media = 0, soma = 0;
        int contador = 0;

        System.out.print("Digite uma nota: ");
        Scanner n = new Scanner(System.in);
        nota = n.nextFloat();
        while (nota > -1) {
            soma += nota;
            contador++;
            System.out.print("Digite uma nota: ");
            nota = n.nextFloat();
        }
                
        media = soma / contador;
        System.out.printf("\nA Contador: %d", contador);
        System.out.printf("\nA média das notas é %.2f", media);
        System.out.printf("\nA Soma: %f", soma);

    }
}