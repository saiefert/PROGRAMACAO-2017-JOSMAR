/*
 * Escreva uma classe que represente um país. Um país tem como atributos o seu
 * nome, o nome da capital, sua dimensão em Km 2 e uma lista de países com os quais
 * ele faz fronteira. Represente a classe e forneça os seguintes construtores e método:
 * a) Construtor que inicialize o nome, capital e a dimensão do país;
 * b) Métodos de acesso (obter/get) para as propriedades indicadas no item (a);
 * c) Um método que permita verificar se dois países são iguais. Dois países são iguais se
 * tiverem o mesmo nome e a mesma capital. A assinatura deste método deve ser:
 * d) public boolean equals(final Pais outro);
 * e) Um método que define quais outros países fazem fronteira (note que um país não pode
 * fazer fronteira com ele mesmo);
 * f) Um método que retorne a lista de países que fazem fronteira;
 * g) Um método que receba um outro país como parâmetro e retorne uma lista de vizinhos
 * comuns aos dois países.
 */
package br.estacio.josmar.listaDois.programacao;

/**
 *
 * @author josmar
 */
public class PaisExercicio01 {
    private String nome, capital;
	private double dimensao;
	private PaisExercicio01[] fronteiras;

	public PaisExercicio01(String nome, String capital, double dimensao) {
		this.nome = nome;
		this.capital = capital;
		this.dimensao = dimensao;
	}

	
	public boolean equals(PaisExercicio01 outro) {
		return this.nome.equals(outro.getNome())
				&& this.capital.equals(outro.getCapital());
	}

	public void setFronteiras(PaisExercicio01... paises) {
		
		int quantidadePaisesIguais = 0;
		for(int i = 0; i < paises.length; i++) {
			if(this.equals(paises[i])) {
				quantidadePaisesIguais++;
			}
		}
		
		this.fronteiras = new PaisExercicio01[paises.length - quantidadePaisesIguais];
		int idxFronteira = 0;
		for(int i = 0; i < paises.length; i++) {
			if(!this.equals(paises[i])) {
				this.fronteiras[idxFronteira] = paises[i];
				idxFronteira++;
			}
		}
		
	}
	
	public PaisExercicio01[] getFronteiras() {
		return this.fronteiras;
	}
	
	public PaisExercicio01[] vizinhosEmComum(PaisExercicio01 outro) {
		int totaisIguais = 0;
		for(PaisExercicio01 fronteiraPais: this.fronteiras) {
			for(PaisExercicio01 fronteiraOutro: outro.fronteiras) {
				if(fronteiraPais.equals(fronteiraOutro)) {
					totaisIguais++;
				}
			}
		}
		
		if(totaisIguais > 0) {
			int idxVizinhos = 0;
			PaisExercicio01[] mesmosVizinhos = new PaisExercicio01[totaisIguais];
			for(PaisExercicio01 fronteiraPais: this.fronteiras) {
				for(PaisExercicio01 fronteiraOutro: outro.fronteiras) {
					if(fronteiraPais.equals(fronteiraOutro)) {
						mesmosVizinhos[idxVizinhos] = fronteiraOutro;
						idxVizinhos++;
					}
				}
			}
			
			return mesmosVizinhos;
		}
		
		return null;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

}        
