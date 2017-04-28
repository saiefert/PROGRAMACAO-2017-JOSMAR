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
public class Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2, resultado = 0;
        char op;
        System.out.println("Digite o primeiro número: ");
        Scanner numero1 = new Scanner(System.in);
        num1 = numero1.nextDouble();

        System.out.println("Informe a operção que deseja realizar");
        Scanner opera = new Scanner(System.in);
        op = opera.next().charAt(0);
        primeiro:
        do {
            System.out.println("Digite o segundo número: ");
            Scanner numero2 = new Scanner(System.in);
            num2 = numero2.nextDouble();
            if (op == '/' && num2 == 0) {
                System.out.println("Erro");
                continue primeiro;
            }
        } while (op == '/' && num2 == 0);
        switch (op) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            default:
                System.out.println("Operação inválida!");
                break;

        }
        System.out.printf("Resultado é: %.2f ", resultado);
    }
    
}