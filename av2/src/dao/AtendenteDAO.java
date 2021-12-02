package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Atendente;

public class AtendenteDAO {
    public void create(Atendente atendente){
        Connection conexaoBD = null;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO atendente (cpf,nome,email,data_nascimento,senha,cod) VALUES (?,?,?,?,?,1);";
        try {
            conexaoBD = ConnectionFactory.getConnection();

            stmt = conexaoBD.prepareStatement(sql);
            stmt.setString(1, atendente.getCpf());
            stmt.setString(2, atendente.getNome());
            stmt.setString(3, atendente.getEmail());
            stmt.setString(4, atendente.getData_nascimento());
            stmt.setString(5, atendente.getSenha());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "[AtendenteDAO] Atendente cadastrado com sucesso!");
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexaoBD, stmt);
        }        
    }

    public List<Atendente> readAll(){
        Connection conexaoBD = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM atendente";
        List<Atendente> atendentes = new ArrayList<Atendente>();
        try {
            conexaoBD = ConnectionFactory.getConnection();
            stmt = conexaoBD.prepareStatement(sql);
            rs = stmt.executeQuery();



            while(rs.next()){
                Atendente atendente = new Atendente();
                atendente.setCpf(rs.getString("cpf"));
                atendente.setNome(rs.getString("nome"));
                atendente.setEmail(rs.getString("email"));
                atendente.setData_nascimento(rs.getString("data_nascimento"));
                atendente.setSenha(rs.getString("senha"));
                atendentes.add(atendente);
            }
        }catch(SQLException e){
                e.printStackTrace();
        }
        catch (Exception e) {
        }finally{
            ConnectionFactory.closeConnection(conexaoBD, stmt);
        }

        return atendentes;
    }
    public void update(Atendente atendente){
        Connection conexaoBD = null;
        PreparedStatement stmt = null;
        String sql = "UPDATE atendente SET nome = ?, email = ?, data_nascimento = ?, senha = ?, cod = 1 WHERE cpf = ?;";
        try {
            conexaoBD = ConnectionFactory.getConnection();

            stmt = conexaoBD.prepareStatement(sql);
            stmt.setString(1, atendente.getCpf());
            stmt.setString(2, atendente.getNome());
            stmt.setString(3, atendente.getEmail());
            stmt.setString(4, atendente.getData_nascimento());
            stmt.setString(5, atendente.getSenha());
            stmt.executeUpdate();


            JOptionPane.showMessageDialog(null, "[AtendenteDAO] Atendente atualizado com sucesso!");
        }catch(SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexaoBD, stmt);
        }
    
    }

    public void delete(Atendente atendente){
        Connection conexaoBD = null;
        PreparedStatement stmt = null;
        String sql = "DELETE FROM atendente WHERE cpf = ?;";
        try {
            conexaoBD = ConnectionFactory.getConnection();
            stmt = conexaoBD.prepareStatement(sql);
            stmt.setString(1, atendente.getCpf());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "[AtendenteDAO] atendente deletado com sucesso!");
        }catch(SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexaoBD, stmt);
        }
    }

}

