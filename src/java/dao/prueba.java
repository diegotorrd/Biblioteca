/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


/**
 *
 * @author Diego Torres
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculadorDAO dao = new CalculadorDAO();
        
        System.out.println(dao.suma(5, 5));
        
    }
    
}
