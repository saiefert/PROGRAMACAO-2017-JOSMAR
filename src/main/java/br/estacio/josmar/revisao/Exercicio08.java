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
public class Exercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero;
        String binario;
        System.out.println("Digite um número inteiro: ");
        Scanner numeroDigitado = new Scanner(System.in);
        numero = numeroDigitado.nextInt();
        binario = Integer.toString(numero,2);
        System.out.printf(numero+" em Binário é: %d", binario);
    }
    
}
