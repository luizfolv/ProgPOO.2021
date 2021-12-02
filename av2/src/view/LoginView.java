/*
Luiz Felipe Oliveira Gonçalves Leitão -> 0050017010
Larissa Perazzo -> 
*/

package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.LoginController;
import model.Login;

public class LoginView {
    
     
    public void readAll(String cpf, String password){
        LoginController controller = new LoginController();
        boolean ate = false;
        boolean cli = false;
        boolean autenticado = false;

        for (Login login : controller.readAll()) {
            String cod = "3";
            if(cpf.equals(login.getUsername()) && password.equals(login.getPassword())){
                autenticado = true;
                cod = login.getId();
                if(cod.equals("1")){
                    ate = true;
                }
                if(cod.equals("0")){
                    cli = true;
                }
                break;
            }
            else{
                autenticado = false;
            }

        }

        if (autenticado == true){
            if(cli == true){
                ClientView cliente = new ClientView();
                cliente.Tela();
            }
            if(ate == true){
                AtendenteView atendente = new AtendenteView();
                atendente.Tela();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Login e senha incorretos");
        }
    }



    
    public static void main(String[] args) {
        LoginView telaLogin = new LoginView();

        JFrame frame = new JFrame("Login");
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelCpf = new JLabel("CPF");
        labelCpf.setBounds(10, 10, 80, 25);
        frame.add(labelCpf);

        JTextField textCpf = new JTextField(20);
        textCpf.setBounds(100, 10, 160, 25);
        frame.add(textCpf);

        JLabel labelSenha = new JLabel("Senha");
        labelSenha.setBounds(10, 40, 80, 25);
        frame.add(labelSenha);
        
        JTextField textSenha = new JTextField(20);
        textSenha.setBounds(100, 40, 160, 25);
        frame.add(textSenha);

        //login button in the middle
        JButton buttonLogin = new JButton("Login");
        buttonLogin.setBounds(100, 80, 80, 25);
        frame.add(buttonLogin);

        JLabel labelIntegrantes = new JLabel("Integrantes: ");
        labelIntegrantes.setBounds(10, 130, 100, 20);
        frame.add(labelIntegrantes);
        JLabel labelIntegrante1 = new JLabel("Larissa Perazzo - 0050016465");
        labelIntegrante1.setBounds(10, 150, 200, 20);
        frame.add(labelIntegrante1);
        JLabel labelIntegrante2 = new JLabel("Luiz Felipe Oliveira - 0050017010");
        labelIntegrante2.setBounds(10, 170, 200, 20);
        frame.add(labelIntegrante2);

        frame.setVisible(true);

        buttonLogin.addActionListener(e -> {
            telaLogin.readAll(textCpf.getText(), textSenha.getText());
        });
    }
}
