/*
Luiz Felipe Oliveira Gonçalves Leitão -> 0050017010
Larissa Perazzo -> 
*/

package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.ClienteController;
import model.Cliente;

public class ClientView extends LoginView {
    
    public void create(JTextField textFieldCPF, JTextField textFieldNome, JTextField textFieldEmail, JTextField textFieldNascimento, JTextField textFieldSenha){
        try {
            Cliente cliente = new Cliente();
            ClienteController controller = new ClienteController();

            
            cliente.setCpf(textFieldCPF.getText());
            cliente.setNome(textFieldNome.getText());
            cliente.setEmail(textFieldEmail.getText());
            cliente.setData_nascimento(textFieldNascimento.getText());
            cliente.setSenha(textFieldSenha.getText());
            controller.create(cliente);
            
        } catch (Exception e) {
        }
    }

    public void readAll(){
        ClienteController controller = new ClienteController();
        
        System.out.println("Listagem de clientes");
        System.out.println("------------------");
        for (Cliente cliente : controller.readAll()) {
            System.out.println(cliente.getCpf() + " - " + cliente.getNome() + " - " + cliente.getEmail() + " - " + cliente.getData_nascimento() + " - " + cliente.getSenha());
        }


    }

    public void update(JTextField textFieldCPF, JTextField textFieldNome, JTextField textFieldEmail, JTextField textFieldNascimento, JTextField textFieldSenha){
        try {
            Cliente cliente = new Cliente();
            ClienteController controller = new ClienteController();
            cliente.setCpf(textFieldCPF.getText());
            cliente.setNome(textFieldNome.getText());
            cliente.setEmail(textFieldEmail.getText());
            cliente.setData_nascimento(textFieldNascimento.getText());
            cliente.setSenha(textFieldSenha.getText());
            controller.update(cliente);
            
        } catch (Exception e) {
        }
    }

    public void delete(JTextField textFieldCPF){
        try {
            Cliente cliente = new Cliente();

            ClienteController controller = new ClienteController();            
            cliente.setCpf(textFieldCPF.getText());
            controller.delete(cliente);                
            
        } catch (Exception e) {
        }
            
    }
    
    public void Tela(){
        ClientView telaCliente = new ClientView();

        JFrame frame = new JFrame("Cliente");
        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        JLabel labelMatricula = new JLabel("CADASTRO DE CLIENTES");
        labelMatricula.setBounds(10, 10, 150, 20);
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
            telaCliente.create(textFieldCPF, textFieldNome, textFieldEmail, textFieldNascimento, textFieldSenha);

        });
        
        buttonRead.addActionListener(e -> {
            telaCliente.readAll();
        });
        buttonUpdate.addActionListener(e -> {
            telaCliente.update(textFieldCPF, textFieldNome, textFieldEmail, textFieldNascimento, textFieldSenha);
        });
        buttonDelete.addActionListener(e -> {
            telaCliente.delete(textFieldCPF);
        });
    }
    
    /*
    public static void main(String[] args) {
        ClientView telaCliente = new ClientView();

        JFrame frame = new JFrame("Cliente");
        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        JLabel labelMatricula = new JLabel("CADASTRO DE CLIENTES");
        labelMatricula.setBounds(10, 10, 150, 20);
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
            telaCliente.create(textFieldCPF, textFieldNome, textFieldEmail, textFieldNascimento, textFieldSenha);

        });
        
        buttonRead.addActionListener(e -> {
            telaCliente.readAll();
        });
        buttonUpdate.addActionListener(e -> {
            telaCliente.update(textFieldCPF, textFieldNome, textFieldEmail, textFieldNascimento, textFieldSenha);
        });
        buttonDelete.addActionListener(e -> {
            telaCliente.delete(textFieldCPF);
        });
    }*/
}
