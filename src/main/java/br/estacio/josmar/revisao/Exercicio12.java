/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.josmar.revisao;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author josmar
 */
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     float a=0;
        float b=0;
        System.out.println("Hipotenusa: "+hipotenusa(a,b));
        
    }
    public static float hipotenusa(float a, float b){
         float c, h;
        System.out.println("Informe o valor do cateto a: ");
        Scanner catetoA = new Scanner(System.in);
        a = catetoA.nextFloat();
        System.out.println("Informe o valor do cateto b: ");
        Scanner catetoB = new Scanner(System.in);
        b = catetoB.nextFloat();
       
        c = (float) (Math.pow(b,2) + Math.pow(a, 2));
        h = (float) sqrt(c);
        return h;
    
    }
}