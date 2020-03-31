
import org.hibernate.cfg.DefaultNamingStrategy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class MyNamingStrategy extends DefaultNamingStrategy 
{
    public String classToTableName(String className)
    {
        if (className.equals("entity.MyAccount")) 
            return ("account"); 
        else 
            return ("EMPTY"); 
    } }
