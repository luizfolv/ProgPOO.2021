package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Cliente;

public class ClienteDAO {
    public void create(Cliente cliente){
        Connection conexaoBD = null;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO cliente (cpf,nome,email,data_nascimento,senha,cod) VALUES (?,?,?,?,?,0);";
        try {
            conexaoBD = ConnectionFactory.getConnection();

            stmt = conexaoBD.prepareStatement(sql);
            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getData_nascimento());
            stmt.setString(5, cliente.getSenha());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "[ClienteDAO] Cliente cadastrado com sucesso!");

        }catch(SQLException e){
            e.printStackTrace();
        }
        
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexaoBD, stmt);
        }        
    }

    public List<Cliente> readAll(){
        Connection conexaoBD = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM cliente";
        List<Cliente> clientes = new ArrayList<Cliente>();
        try {
            conexaoBD = ConnectionFactory.getConnection();
            stmt = conexaoBD.prepareStatement(sql);
            rs = stmt.executeQuery();



            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setData_nascimento(rs.getString("data_nascimento"));
                cliente.setSenha(rs.getString("senha"));
                clientes.add(cliente);
            }
        }catch(SQLException e){
                e.printStackTrace();
        }
        catch (Exception e) {
        }finally{
            ConnectionFactory.closeConnection(conexaoBD, stmt);
        }

        return clientes;
    }
    
    public void update(Cliente cliente){
        Connection conexaoBD = null;
        PreparedStatement stmt = null;
        //String sql = "UPDATE aluno SET nome = ?, telefone = ? WHERE matricula = ?";
        String sql = "UPDATE cliente SET nome = ?, email = ?, data_nascimento = ?, senha = ? WHERE cpf = ?";
        try {
            conexaoBD = ConnectionFactory.getConnection();

            stmt = conexaoBD.prepareStatement(sql);
            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getData_nascimento());
            stmt.setString(5, cliente.getSenha());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "[ClienteDAO] Cliente atualizado com sucesso!");
            //System.out.println("[AlunoDAO] Aluno atualizado com sucesso!");
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexaoBD, stmt);
        }
    
    }

    public void delete(Cliente cliente){
        Connection conexaoBD = null;
        PreparedStatement stmt = null;
        String sql = "DELETE FROM cliente WHERE cpf = ?;";
        try {
            conexaoBD = ConnectionFactory.getConnection();
            stmt = conexaoBD.prepareStatement(sql);
            stmt.setString(1, cliente.getCpf());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "[ClienteDAO] cliente deletado com sucesso!");
        }catch(SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexaoBD, stmt);
        }
    }

}

