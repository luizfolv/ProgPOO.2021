import java.io.FileReader;
import java.util.Scanner;

public class LerTexto {
	public static void main(String[] args) {

        try {
            //criar variavel contadora
            int contador = 0;
            //criar vetor de 10 palavras
            String[] palavras = new String[10];
            //ler um arquivo em texto qualquer
            FileReader arq = new FileReader("src/dados.txt");
            Scanner ler = new Scanner(arq);
            //contar quantas palavras tem no arquivo
            while (ler.hasNext()) {
                String palavra = ler.next();
                
                //verificar se é a primeira palavra digitada
                if (contador == 0){
                    palavras[contador] = palavra;
                }else{
                    if(palavra.length() > palavras[contador-1].length()){
                        palavras[contador] = palavra;
                }
                }
                contador++;


                /*
                //verificar se é a primeira palavra
                if (contador == 1) {
                    palavras[0] = palavra;
                } else {
                    //verificar se a palavra é maior que a anterior
                    if (tamanho > palavras[contador - 2].length()) {
                        palavras[contador - 1] = palavra;
                    } else {
                        palavras[contador - 2] = palavras[contador - 2] + " " + palavra;
                    }
                }*/
            }


            //exibir quantidade total de palavras
            System.out.println("Total de palavras: " + contador);

            //exibir o vetor de palavras
            for (int i = 0; i < contador; i++) {
                System.out.println(palavras[i]);
            }

            //fechar arquivo
            arq.close();

        }catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    
    }
}
