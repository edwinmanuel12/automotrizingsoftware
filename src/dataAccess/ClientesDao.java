package dataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClientesDao
{

    Conexion cn = new Conexion();
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

   

    public int createClientes(ClientesDto objCliente)
    {

        String sql = "Insert Into Clientes (nombre,apellido,direccion,telefono,estatus) values(?,?,?,?,?)";

        try
        {
            conn = cn.conectar();
            ps = conn.prepareStatement(sql);

            ps.setString(1, objCliente.getNombre());
            ps.setString(2, objCliente.getApellido());
            ps.setString(3, objCliente.getDireccion());
            ps.setString(4, objCliente.getTelefono());
            ps.setInt(5, objCliente.getEstatus());
            
            ps.execute();
            return 1;
        } catch (SQLException e)
        {
            return 0;
            //throw e;
        }
    }

    public ArrayList readClientes()
    {
        ArrayList<ClientesDto> listaClientes = new ArrayList<ClientesDto>();

        String sql = "Select * from Clientes";
        //String buscar = "Select * from usuarios where nombre like '%" + valor + "%' or nombre like '%" + valor + "'";
        try
        {
            conn = cn.conectar();

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next())
            {
                ClientesDto objCliente = new ClientesDto();
                objCliente.setIdCliente(rs.getInt("idCliente"));
                objCliente.setNombre(rs.getString("nombre"));
                objCliente.setApellido(rs.getString("apellido"));
                objCliente.setDireccion(rs.getString("direccion"));
                objCliente.setTelefono(rs.getString("telefono"));
                objCliente.setEstatus(rs.getInt("estatus"));

                listaClientes.add(objCliente);
            }

        } catch (SQLException e)
        {
            //System.out.println("Error: " + e.toString());
            return null;
        }
        return listaClientes;
    }

    public int updateClientes(ClientesDto objCliente)
    {
        String sql = "update Clientes set nombre = ?, apellido = ?, direccion = ?, telefono = ?, estatus = ?"
                + " where idCliente = ?";

        try
        {
            conn = cn.conectar();
            ps = conn.prepareStatement(sql);
            //rs = ps.executeQuery();
            ps.setString(1, objCliente.getNombre());
            ps.setString(2, objCliente.getApellido());
            ps.setString(3, objCliente.getDireccion());
            ps.setString(4, objCliente.getTelefono());
            ps.setInt(5, objCliente.getEstatus());
            ps.setInt(6, objCliente.getIdCliente());
            ps.execute();
            return 1;
        } catch (SQLException e)
        {
            return 0;
            //throw e;
        }
    }

    public int deleteClientes(ClientesDto objCliente)
    {
        String sql = "Delete from Clientes where idCliente = ?";

        try
        {
            conn = cn.conectar();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, objCliente.getIdCliente());
            ps.execute();
            return 1;
        } catch (SQLException e)
        {

        }
        return 0;
    }

}
