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
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        int num;
        System.out.println("Digite um número inteiro: ");
        Scanner n = new Scanner(System.in);
        num = n.nextInt();
        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("impar");
        }
    }
    
}
