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
public class Exercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota, media, soma = 0;
        int contador = 0;
        System.out.printf("Digite uma nota: ");
        Scanner notaDigitada = new Scanner(System.in);
        nota = notaDigitada.nextDouble();
        while (nota > -1) {
            soma += nota;
            contador++;
            System.out.printf("Digite uma nota: ");
            nota = notaDigitada.nextDouble();

        }
        media = soma / contador;
        System.out.printf("A média é: %.2f ", media);
      
    }

}