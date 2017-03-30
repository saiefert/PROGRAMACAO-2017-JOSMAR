/*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
 */
package br.estacio.terenciani.programacao.Aula8;

import java.io.PrintStream;
import java.util.Arrays;
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
        double primeiroOperando = 0, segundoOperando = 0, resultado = 0;
        String primeiro, segundo, selectOperacao;
        int escolha = 0;
        Object[] operacao = {"+", "-", "*", "/"};

        primeiro:
        do {
        
        primeiro = JOptionPane.showInputDialog(null, "Digite o primeiro operando");
        
            if (primeiro == null) {
                break primeiro;
                
            }
            primeiroOperando = Double.parseDouble(primeiro);

            Object retorno = JOptionPane.showInputDialog(null,
                    "Selecione uma Operação: ", "Operadores", JOptionPane.INFORMATION_MESSAGE,
                    null, operacao, operacao[0]);
            
            selectOperacao = String.valueOf(retorno);
            
            
            terceiro : do{

            segundo = JOptionPane.showInputDialog(null, "Digite o segundo operando");
            segundoOperando = Double.parseDouble(segundo);
            if(selectOperacao.equals("/") && segundoOperando == 0){
               JOptionPane.showMessageDialog(null, "Não pode dividir por zero!");
                
            }else{
                break terceiro;
            }
            }while(true);

               switch (selectOperacao) {
                case "+":
                    resultado = primeiroOperando + segundoOperando;
                    break;
                case "-":
                    resultado = primeiroOperando - segundoOperando;
                    break;
                case "*":
                    resultado = primeiroOperando * segundoOperando;
                    break;
                case "/":
                    resultado = primeiroOperando / segundoOperando;
                    break;
                default:
                    System.out.println("Digite um operador válido!");

            }
            JOptionPane.showMessageDialog(null, "O resultado é " + resultado);
            escolha = JOptionPane.showConfirmDialog(null, "Deseja continuar? ", "Atenção!",
                     JOptionPane.YES_NO_OPTION);
        } while (escolha == 0);
        JOptionPane.showMessageDialog(null, "Obrigado por usar a calculadora!");

    }

}
