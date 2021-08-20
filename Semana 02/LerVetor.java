import java.util.Scanner;

public class LerVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[5];

        //ler numero pelo teclado
        for(int i=0;i<num.length;i++){
            //System.out.println("entre com o numero " + (i+1) + ":");

            System.out.printf("Entre com o numero %d:",(i+1));
            num[i] = sc.nextInt();
        }
        //Exibir Vetor
        for (int n : num) {
            System.out.println(n);
        }
        sc.close();
    }
}
