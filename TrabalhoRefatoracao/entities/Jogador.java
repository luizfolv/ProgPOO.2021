package entities;

public class Jogador {
	
	private String jogadores[] = new String[5];
	

	public String[] getJogadores() {
		return this.jogadores;
	}

	public String toString(int i) {
		return (i+1)+" - "+jogadores[i];
	}

	public void setJogadores(String nome[]) {
		this.jogadores = nome;
	}
	
	
}