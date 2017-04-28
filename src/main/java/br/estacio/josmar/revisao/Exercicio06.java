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
public class Exercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota1, nota2, media;
        System.out.println("Digite a primeira nota: ");
        Scanner av1 = new Scanner(System.in);
        nota1 = av1.nextFloat();

        System.out.println("Digite a seguda nota: ");
        Scanner av2 = new Scanner(System.in);
        nota2 = av2.nextFloat();

        media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.printf("Aluno aprovado com média: %.2f", media);
        } else {
            System.out.printf("Aluno reprovado com média: %.2", media);
        }

    }
    
}