
package br.com.vendas.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Lucas Teixeira
 */
public class ConnectionFactory {
    
    public Connection getConnection(){
        
        try {
            
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdvendas", "usuariocurso", "123");
            
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
        
    }
    
}
