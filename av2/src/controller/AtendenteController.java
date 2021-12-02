/*
Luiz Felipe Oliveira Gonçalves Leitão -> 0050017010
Larissa Perazzo -> 
*/

package controller;

import java.util.ArrayList;
import java.util.List;

import dao.AtendenteDAO;
import model.Atendente;

public class AtendenteController {

    public void create(Atendente atendente){

        try {
            AtendenteDAO dao = new AtendenteDAO();
            dao.create(atendente);
            
        } catch (Exception e) {
            System.out.println("Erro no controller");
        }
        
    }
    
    public List<Atendente> readAll(){
       List<Atendente> atendentes = new ArrayList<Atendente>();
       try {
           AtendenteDAO dao = new AtendenteDAO();
           atendentes = dao.readAll();

       } catch (Exception e) {
       }
         return atendentes;
    }

    public void update(Atendente atendente){
        try {
            AtendenteDAO dao = new AtendenteDAO();
            dao.update(atendente);
            
        } catch (Exception e) {
            System.out.println("Erro ao atualizar o atendente");
        }
    }
    
    public void delete(Atendente atendente){
        try {
            AtendenteDAO dao = new AtendenteDAO();
            dao.delete(atendente);
            
        } catch (Exception e) {
            System.out.println("Erro ao deletar o atendente");
        }
    }
}
