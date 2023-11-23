package dataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion
{

    String bd = "bddautomotriz";
    String url = "jdbc:mysql://localhost:3306/bddautomotriz";
    String user = "root";
    String password = "";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection conn;

    public Conexion()
    {
    }

    public Connection conectar()
    {

        try
        {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa a: "+bd);
        } catch (ClassNotFoundException | SQLException ex)
        {

            //JOptionPane.showMessageDialog(null, "No se conecto Conexion FALLIDA");
        }
        return conn;
    }

    public void desconectar() throws Exception
    {
        try
        {
            conn.close();
        } catch (SQLException e)
        {
            throw e;
        }

    }



}
