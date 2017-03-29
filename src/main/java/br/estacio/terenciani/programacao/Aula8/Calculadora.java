/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao.Aula8;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author josmar
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double primeiroOperando, segundoOperando, resultado=0;
        String operacao;
        
        System.out.print("Digite o primeiro operando: ");
        primeiroOperando = scan.nextDouble();
        
        System.out.print("Informe o operador: ");
        operacao = scan.next();
                
        System.out.print("Digite o segundo operando: ");
        segundoOperando = scan.nextDouble();
        
        if(operacao.equals("*")){
            resultado = primeiroOperando * segundoOperando;
        }
        
        if(operacao.equals("/")){
            resultado = primeiroOperando / segundoOperando;
        }
        
        if(operacao.equals("+")){
            resultado = primeiroOperando + segundoOperando;
        }
        
        if(operacao.equals("-")){
            resultado = primeiroOperando - segundoOperando;
        }
        if(operacao.equals("-")){
            resultado = primeiroOperando - segundoOperando;
        }
        else{
            JOptionPane.showMessageDialog(null, "Digita certo!");
        }
        
        System.out.printf("O resultado é: %.2f", resultado);
    }
    
}
