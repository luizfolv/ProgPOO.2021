/*
Luiz Felipe Oliveira Gonçalves Leitão -> 0050017010
Larissa Perazzo -> 
*/

package controller;

import java.util.ArrayList;
import java.util.List;

import dao.LoginDAO;
import model.Login;

public class LoginController {
   
    public List<Login> readAll(){
       List<Login> logins = new ArrayList<Login>();
       try {
           LoginDAO dao = new LoginDAO();
           logins = dao.readAll();

       } catch (Exception e) {
       }
         return logins;
    }

}
