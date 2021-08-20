import java.util.Arrays;
import java.util.Scanner;

/*
Aluno: Luiz Felipe Oliveira Gonçalves Leitão
Matricula: 0050017010
*/

public class OrdenaVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        
        for(int i=0;i<vet.length; i++){
            System.out.print("Entre com o numero na posicao " + i + ": ");
            vet[i] = sc.nextInt();
        }
        System.out.println("*** Vetor anterior ***");
        for(int j=0;j<vet.length; j++){
            System.out.print(vet[j]+" ");
        }
        Arrays.sort(vet);
        System.out.println("\n*** Vetor em ordem crescente ***");
        for(int j=0;j<vet.length; j++){
            System.out.print(vet[j]+" ");
        }
        
        sc.close();
    }
}