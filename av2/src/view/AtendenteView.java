/*
Luiz Felipe Oliveira Gonçalves Leitão -> 0050017010
Larissa Perazzo -> 
*/

package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.AtendenteController;
import model.Atendente;

public class AtendenteView extends LoginView{
    
    public void create(JTextField textFieldCPF, JTextField textFieldNome, JTextField textFieldEmail, JTextField textFieldNascimento, JTextField textFieldSenha){
        try {
            Atendente atendente = new Atendente();
            AtendenteController controller = new AtendenteController();

            
            atendente.setCpf(textFieldCPF.getText());
            atendente.setNome(textFieldNome.getText());
            atendente.setEmail(textFieldEmail.getText());
            atendente.setData_nascimento(textFieldNascimento.getText());
            atendente.setSenha(textFieldSenha.getText());
            controller.create(atendente);
            
        } catch (Exception e) {
        }
    }

    public void readAll(){
        AtendenteController controller = new AtendenteController();
        
        System.out.println("Listagem de atendentes");
        System.out.println("------------------");
        for (Atendente atendente : controller.readAll()) {
            System.out.println(atendente.getCpf() + " - " + atendente.getNome() + " - " + atendente.getEmail() + " - " + atendente.getData_nascimento() + " - " + atendente.getSenha());
        }


    }

    public void update(JTextField textFieldCPF, JTextField textFieldNome, JTextField textFieldEmail, JTextField textFieldNascimento, JTextField textFieldSenha){
        try {
            Atendente atendente = new Atendente();
            AtendenteController controller = new AtendenteController();
            atendente.setCpf(textFieldCPF.getText());
            atendente.setNome(textFieldNome.getText());
            atendente.setEmail(textFieldEmail.getText());
            atendente.setData_nascimento(textFieldNascimento.getText());
            atendente.setSenha(textFieldSenha.getText());
            controller.update(atendente);
            
        } catch (Exception e) {
        }
    }

    public void delete(JTextField textFieldCPF){
        try {
            Atendente atendente = new Atendente();

            AtendenteController controller = new AtendenteController();            
            atendente.setCpf(textFieldCPF.getText());
            controller.delete(atendente);                
            
        } catch (Exception e) {
        }
            
    }

    public void Tela(){
        AtendenteView telaAtendente = new AtendenteView();

        JFrame frame = new JFrame("Atendente");
        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        JLabel labelMatricula = new JLabel("CADASTRO DE ATENDENTES");
        labelMatricula.setBounds(10, 10, 180, 20);
        frame.add(labelMatricula);

        JLabel labelCPF = new JLabel("CPF: ");
        labelCPF.setBounds(10, 40, 100, 20);
        frame.add(labelCPF);

        JLabel labelNome = new JLabel("Nome: ");
        labelNome.setBounds(10, 70, 100, 20);
        frame.add(labelNome);

        JLabel labelEmail = new JLabel("Email: ");
        labelEmail.setBounds(10, 100, 100, 20);
        frame.add(labelEmail);

        JLabel labelNascimento = new JLabel("Nascimento: ");
        labelNascimento.setBounds(10, 130, 100, 20);
        frame.add(labelNascimento);

        JLabel labelSenha = new JLabel("Senha: ");
        labelSenha.setBounds(10, 160, 100, 20);
        frame.add(labelSenha);

        JTextField textFieldCPF = new JTextField();
        textFieldCPF.setBounds(120, 40, 100, 20);
        frame.add(textFieldCPF);

        JTextField textFieldNome = new JTextField();
        textFieldNome.setBounds(120, 70, 100, 20);
        frame.add(textFieldNome);

        JTextField textFieldEmail = new JTextField();
        textFieldEmail.setBounds(120, 100, 100, 20);
        frame.add(textFieldEmail);

        JTextField textFieldNascimento = new JTextField();
        textFieldNascimento.setBounds(120, 130, 100, 20);
        frame.add(textFieldNascimento);

        JTextField textFieldSenha = new JTextField();
        textFieldSenha.setBounds(120, 160, 100, 20);
        frame.add(textFieldSenha);

        JButton buttonCreate = new JButton("Cadastrar");
        buttonCreate.setBounds(10, 200, 100, 20);
        frame.add(buttonCreate);

        JButton buttonRead = new JButton("Ler");
        buttonRead.setBounds(120, 200, 100, 20);
        frame.add(buttonRead);

        JButton buttonUpdate = new JButton("Atualizar");
        buttonUpdate.setBounds(230, 200, 100, 20);
        frame.add(buttonUpdate);

        JButton buttonDelete = new JButton("Deletar");
        buttonDelete.setBounds(340, 200, 100, 20);
        frame.add(buttonDelete);


        
        buttonCreate.addActionListener(e -> {
            telaAtendente.create(textFieldCPF, textFieldNome, textFieldEmail, textFieldNascimento, textFieldSenha);

        });
        
        buttonRead.addActionListener(e -> {
            telaAtendente.readAll();
        });
        buttonUpdate.addActionListener(e -> {
            telaAtendente.update(textFieldCPF, textFieldNome, textFieldEmail, textFieldNascimento, textFieldSenha);
        });
        buttonDelete.addActionListener(e -> {
            telaAtendente.delete(textFieldCPF);
        });
    }
    /*
    public static void main(String[] args) {
        AtendenteView telaAtendente = new AtendenteView();

        JFrame frame = new JFrame("Atendente");
        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        JLabel labelMatricula = new JLabel("CADASTRO DE ATENDENTES");
        labelMatricula.setBounds(10, 10, 180, 20);
        frame.add(labelMatricula);

        JLabel labelCPF = new JLabel("CPF: ");
        labelCPF.setBounds(10, 40, 100, 20);
        frame.add(labelCPF);

        JLabel labelNome = new JLabel("Nome: ");
        labelNome.setBounds(10, 70, 100, 20);
        frame.add(labelNome);

        JLabel labelEmail = new JLabel("Email: ");
        labelEmail.setBounds(10, 100, 100, 20);
        frame.add(labelEmail);

        JLabel labelNascimento = new JLabel("Nascimento: ");
        labelNascimento.setBounds(10, 130, 100, 20);
        frame.add(labelNascimento);

        JLabel labelSenha = new JLabel("Senha: ");
        labelSenha.setBounds(10, 160, 100, 20);
        frame.add(labelSenha);

        JTextField textFieldCPF = new JTextField();
        textFieldCPF.setBounds(120, 40, 100, 20);
        frame.add(textFieldCPF);

        JTextField textFieldNome = new JTextField();
        textFieldNome.setBounds(120, 70, 100, 20);
        frame.add(textFieldNome);

        JTextField textFieldEmail = new JTextField();
        textFieldEmail.setBounds(120, 100, 100, 20);
        frame.add(textFieldEmail);

        JTextField textFieldNascimento = new JTextField();
        textFieldNascimento.setBounds(120, 130, 100, 20);
        frame.add(textFieldNascimento);

        JTextField textFieldSenha = new JTextField();
        textFieldSenha.setBounds(120, 160, 100, 20);
        frame.add(textFieldSenha);

        JButton buttonCreate = new JButton("Cadastrar");
        buttonCreate.setBounds(10, 200, 100, 20);
        frame.add(buttonCreate);

        JButton buttonRead = new JButton("Ler");
        buttonRead.setBounds(120, 200, 100, 20);
        frame.add(buttonRead);

        JButton buttonUpdate = new JButton("Atualizar");
        buttonUpdate.setBounds(230, 200, 100, 20);
        frame.add(buttonUpdate);

        JButton buttonDelete = new JButton("Deletar");
        buttonDelete.setBounds(340, 200, 100, 20);
        frame.add(buttonDelete);


        
        buttonCreate.addActionListener(e -> {
            telaAtendente.create(textFieldCPF, textFieldNome, textFieldEmail, textFieldNascimento, textFieldSenha);

        });
        
        buttonRead.addActionListener(e -> {
            telaAtendente.readAll();
        });
        buttonUpdate.addActionListener(e -> {
            telaAtendente.update(textFieldCPF, textFieldNome, textFieldEmail, textFieldNascimento, textFieldSenha);
        });
        buttonDelete.addActionListener(e -> {
            telaAtendente.delete(textFieldCPF);
        });
    }
    */
}
