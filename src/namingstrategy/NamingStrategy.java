/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namingstrategy;

import entity.MyAccount;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 *
 * @author DELL
 */
public class NamingStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configuration configuration=new Configuration();
        configuration.configure();
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        MyAccount myAccount=(MyAccount) session.load(MyAccount.class, 1);
        System.out.println(myAccount);
        
    }
    
}
