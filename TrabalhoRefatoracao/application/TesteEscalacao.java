package application;


import java.util.Scanner;
import entities.Escalacao;
import entities.Jogador;
import entities.Time;
/*
	Alunos: Luiz Felipe Oliveira Gonçalves Leitão
			Larissa Perazzo
*/

public class TesteEscalacao {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String nome[] = new String[5];
    	Jogador jog = new Jogador();
    	Time t = new Time();
    	Escalacao esc = new Escalacao();
    	
    	//Pegar nome do time
    	System.out.print("Digite o nome do time: ");
    	t.setNome(sc.nextLine());
    	
    	
    	//Pegar nomes dos jogadores
    	for(int i=0;i<5;i++) {
			System.out.print("Digite o nome do jogador: ");
			nome[i] = sc.nextLine();
			jog.setJogadores(nome);
		}
    	
    	//Pegar data do jogo
    	System.out.print("Digite o dia do jogo: ");
    	int dia = sc.nextInt();
    	System.out.print("Digite o mês do jogo: ");
    	int mes = sc.nextInt();

    	//imprimir data
    	System.out.println("Data do jogo: "+dia+"/"+mes);
    	
    	//Chamar imprimir()
    	esc.imprimir(t,jog); //retorna null (Why god?)
    	
    	sc.close();
     }
    
}
