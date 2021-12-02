/*
Luiz Felipe Oliveira Gonçalves Leitão -> 0050017010
Larissa Perazzo -> 
*/

package controller;

import java.util.ArrayList;
import java.util.List;

import dao.ClienteDAO;
import model.Cliente;

public class ClienteController {

    public void create(Cliente cliente){

        try {
            ClienteDAO dao = new ClienteDAO();
            dao.create(cliente);
            
        } catch (Exception e) {
            System.out.println("Erro no controller");
        }
        
    }
    
    public List<Cliente> readAll(){
       List<Cliente> clientes = new ArrayList<Cliente>();
       try {
           ClienteDAO dao = new ClienteDAO();
           clientes = dao.readAll();

       } catch (Exception e) {
       }
         return clientes;
    }

    public void update(Cliente cliente){
        try {
            ClienteDAO dao = new ClienteDAO();
            dao.update(cliente);
            
        } catch (Exception e) {
            System.out.println("Erro ao atualizar o cliente");
        }
    }
    
    public void delete(Cliente cliente){
        try {
            ClienteDAO dao = new ClienteDAO();
            dao.delete(cliente);
            
        } catch (Exception e) {
            System.out.println("Erro ao deletar o cliente");
        }
    }
}
