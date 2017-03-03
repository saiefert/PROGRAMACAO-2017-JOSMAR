/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao;


/**
 *
 * @author aluno
 */
public class ExercicioAula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte minhaIdade = 23;
        System.out.printf("Idade: %d\n", minhaIdade);
        String meuNome = "Josmar Saiefert\n";
        System.out.printf("Nome: %s", meuNome);
        float meuPeso = 148f;
        System.out.printf("Peso: %.2f Libras\n", meuPeso);
        char tipoSanguineo = 'O';
        System.out.printf("Tipo Sanguineo %s \n", tipoSanguineo);
        String meuAniversario = "26-08-1992";
        System.out.printf("Data de Aniversário %s \n", meuAniversario);
        byte numeroCalcado = 42;
        System.out.printf("Numero do calçado: %d \n", numeroCalcado);
        boolean casado = false;
        System.out.printf("Casado: %b \n\n", casado);
        
        //Esse exemplo aparece false pois o programa não entende qual tipo de variável está sendo declarada.
        System.out.println(.1+.2==.3);
        
        //Abaixo declaramos a variável como float e o programa retornou verdadeiro.
        float x = 0.1f + 0.2f;
        float y = .3f;       
        System.out.println(x);
        System.out.println(x==y);
        
        //Abaixo colocamos o modificador (float) e o programa retornou verdadeiro.
        System.out.println((float).1+(float).2==(float).3);
        
                               
        
    }
    
}
