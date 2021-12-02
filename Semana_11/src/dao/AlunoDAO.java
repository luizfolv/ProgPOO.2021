/*
Luiz Felipe Oliveira Gonçalves Leitão -> 0050017010
Larissa Perazzo -> 
*/

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Aluno;

public class AlunoDAO {
    public void create(Aluno aluno){
        Connection conexaoBD = null;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO aluno (matricula,nome,telefone) VALUES (?,?,?)";
        try {
            conexaoBD = ConnectionFactory.getConnection();

            stmt = conexaoBD.prepareStatement(sql);
            stmt.setString(1, aluno.getMatricula());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getTelefone());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "[AlunoDAO] Aluno cadastrado com sucesso!");
            //System.out.println("[AlunoDAO] Aluno cadastrado com sucesso!");

        }catch(SQLException e){
            e.printStackTrace();
        }
        
        catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexaoBD, stmt);
        }

        
    }

    public List<Aluno> readAll(){
        Connection conexaoBD = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT matricula, nome, telefone FROM aluno";
        List<Aluno> alunos = new ArrayList<Aluno>();
        try {
            conexaoBD = ConnectionFactory.getConnection();
            stmt = conexaoBD.prepareStatement(sql);
            rs = stmt.executeQuery();



            while(rs.next()){
                Aluno aluno = new Aluno();
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setTelefone(rs.getString("telefone"));
                alunos.add(aluno);
            }
        }catch(SQLException e){
                e.printStackTrace();
        }
        catch (Exception e) {
        }finally{
            ConnectionFactory.closeConnection(conexaoBD, stmt);
        }

        return alunos;
    }

    public void update(Aluno aluno){
        Connection conexaoBD = null;
        PreparedStatement stmt = null;
        String sql = "UPDATE aluno SET nome = ?, telefone = ? WHERE matricula = ?";
        try {
            conexaoBD = ConnectionFactory.getConnection();

            stmt = conexaoBD.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getTelefone());
            stmt.setString(3, aluno.getMatricula());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "[AlunoDAO] Aluno atualizado com sucesso!");
            //System.out.println("[AlunoDAO] Aluno atualizado com sucesso!");
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexaoBD, stmt);
        }
    
    }

    public void delete(Aluno aluno){
        Connection conexaoBD = null;
        PreparedStatement stmt = null;
        String sql = "DELETE FROM aluno WHERE matricula = ?";
        try {
            conexaoBD = ConnectionFactory.getConnection();
            stmt = conexaoBD.prepareStatement(sql);
            stmt.setString(1, aluno.getMatricula());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "[AlunoDAO] Aluno deletado com sucesso!");
        }catch(SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexaoBD, stmt);
        }
    }
}