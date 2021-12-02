package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.ConnectionFactory;
import model.Login;

public class LoginDAO {
    
    public List<Login> readAll(){
        Connection conexaoBD = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT cpf,senha,cod FROM cliente UNION SELECT cpf,senha,cod FROM atendente";
        List<Login> logins = new ArrayList<Login>();
        try {
            conexaoBD = ConnectionFactory.getConnection();
            stmt = conexaoBD.prepareStatement(sql);
            rs = stmt.executeQuery();

            while(rs.next()){
                Login login = new Login();
                login.setUsername(rs.getString("cpf"));
                login.setPassword(rs.getString("senha"));
                login.setId(rs.getString("cod"));
                logins.add(login);

            }
        }catch(SQLException e){
                e.printStackTrace();
        }
        catch (Exception e) {

        }finally{
            ConnectionFactory.closeConnection(conexaoBD, stmt);
        }

        return logins;
    }
    

}

