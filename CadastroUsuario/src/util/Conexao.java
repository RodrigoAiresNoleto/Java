package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
  public static Connection createConnection() throws SQLException{
    
    String url = "jdbc:postgresql://localhost:5432/Aires";
    String user = "postgres";
    String password = "199820";

    Connection conexao = null;
    conexao = DriverManager.getConnection(url, user, password);
    
    return conexao;

  }
}

