/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinnote;

import java.sql.Connection;

/**
 *
 * @author USER
 */
public class PinNote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        database cock = new database();
        Connection reg = cock.getConnection();
        new pinnotelogin(reg).setVisible(true);
    }
    
}
