import java.util.Scanner;

public class ComparaString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String senha = "semana2";
        String resposta = "";

        //pedir senha
        System.out.println("Digite a senha: ");
        resposta = sc.next();

        //compara string
        /*if(resposta.equals(senha)){
            System.out.println("Permissao concedida.");
        }*/
        if(resposta.equalsIgnoreCase(senha)){
            System.out.println("Permissao concedida.");
        }
        else{
            System.out.println("Permissao negada.");
        }

        sc.close();
    }
}
