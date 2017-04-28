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
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Abaixo o resultado será falso
        System.out.println(.1+.2==.3);
        
        //Abaixo dará verdadeiro, pois declarei que é float
        float x = .1f, y = .2f, z = .3f;
        System.out.println(x + y == z);
    }
    
}
