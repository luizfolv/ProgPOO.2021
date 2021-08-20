import java.util.Scanner;

public class LerNome{
    public static void main(String[] args) {
        
        String nome = "";
        int idade = 0;
        int i = 0;
        Scanner teclado = new Scanner(System.in);

        //Solicita o nome pelo teclado
        System.out.println("Entre com o nome: ");

        //Ler o nome
        nome = teclado.next();

        //Ler a idade

        System.out.println("Qual a sua idade?");
        //idade = Integer.parseInt(teclado.next());
        idade = teclado.nextInt();

        //Imprime saudação
        System.out.print("Ola " + nome + ", boa noite!");
        System.out.printf("Voce tem %d anos.", idade);

        //testa idade
        if(idade < 18){
            System.out.println("\nNao pode entrar!");
        }
        else{
            System.out.println("\nPode entrar!");
        }

        //for 
        for(i=0;i<10;i++){
            System.out.println(i);
        }

        teclado.close();

    }
}