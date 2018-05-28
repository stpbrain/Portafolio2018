/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosteria;

import gui.Login;

/**
 *
 * @author christianlopez
 */
public class Hosteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login login = new Login();
        login.setBounds(400, 200, 520, 350);
        login.setVisible(true);
    }
    
}
