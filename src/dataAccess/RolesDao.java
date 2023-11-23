package dataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RolesDao
{

    Conexion cn = new Conexion();
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public int createRoles(RolesDto objRoles)
    {

        String sql = "Insert Into Roles (nombre,descripcion,estatus) values(?,?,?)";

        try
        {
            conn = cn.conectar();
            ps = conn.prepareStatement(sql);

            ps.setString(1, objRoles.getNombre());
            ps.setString(2, objRoles.getDescripcion());
            ps.setInt(3, objRoles.getEstatus());

            ps.execute();
            return 1;
        } catch (SQLException e)
        {
            return 0;
            //throw e;
        }
    }

    public ArrayList readRoles()
    {
        ArrayList<RolesDto> listaRoles = new ArrayList<RolesDto>();

        String sql = "Select * from Roles";
        //String buscar = "Select * from usuarios where nombre like '%" + valor + "%' or nombre like '%" + valor + "'";
        try
        {
            conn = cn.conectar();

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next())
            {
                RolesDto objRoles = new RolesDto();
                objRoles.setIdRol(rs.getInt("idRol"));
                objRoles.setNombre(rs.getString("nombre"));
                objRoles.setDescripcion(rs.getString("descripcion"));
                objRoles.setEstatus(rs.getInt("estatus"));

                listaRoles.add(objRoles);
            }

        } catch (SQLException e)
        {
            System.out.println("Error: " + e.toString());
            return null;
        }
        return listaRoles;
    }

    public int updateRoles(RolesDto objRoles)
    {
        String sql = "update Roles set nombre = ?, descripcion = ?, estatus = ?"
                + " where idRol = ?";

        try
        {
            conn = cn.conectar();
            ps = conn.prepareStatement(sql);
            //rs = ps.executeQuery();
            ps.setString(1, objRoles.getNombre());
            ps.setString(2, objRoles.getDescripcion());
            ps.setInt(3, objRoles.getEstatus());
            ps.setInt(4, objRoles.getIdRol());
            ps.execute();
            return 1;
        } catch (SQLException e)
        {
            return 0;
            //throw e;
        }
    }

    public int deleteRoles(RolesDto objRoles)
    {
        String sql = "Delete from Roles where idRol = ?";

        try
        {
            conn = cn.conectar();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, objRoles.getIdRol());
            ps.execute();
            return 1;
        } catch (SQLException e)
        {
            return 0;

        }
    }
}
