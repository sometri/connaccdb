package connaccdb;

import java.sql.*;

public class ConnectAccess {
  public static void main(String[] args) {
    Connection conn = null;
    try {
      String url = "jdbc:ucanaccess://H:/MsIT_AEU/Java/Practice/connaccdb/T.accdb";
      conn = DriverManager.getConnection(url);
      System.out.println("Connection established.");
    } catch (SQLException e) {
      System.err.println("Cannot connect to database server: " + e.getMessage());
    } finally {
      if (conn != null) {
        try {
          conn.close();
          System.out.println("Connection closed.");
        } catch (SQLException e) {
          System.err.println("Cannot close connection: " + e.getMessage());
        }
      }
    }
  }
}
