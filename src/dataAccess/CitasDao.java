package dataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CitasDao
{

    Conexion cn = new Conexion();
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public int createCitas(CitasDto objCitas)
    {

        String sql = "Insert Into Citas (fechaEntrada,fechaSalida,descripcion,estatus,idVehiculo) values(?,?,?,?,?)";

        try
        {
            conn = cn.conectar();
            ps = conn.prepareStatement(sql);

            ps.setString(1, objCitas.getFechaEntrada());
            ps.setString(2, objCitas.getFechaSalida());
            ps.setString(3, objCitas.getDescripcion());
            ps.setInt(4, objCitas.getEstatus());
            ps.setInt(5, objCitas.getIdVehiculo());

            ps.execute();
            return 1;
        } catch (SQLException e)
        {
            return 0;
            //throw e;
        }
    }

    public ArrayList readCitas()
    {
        ArrayList<CitasDto> listaCitas = new ArrayList<CitasDto>();

        String sql = "Select * from Citas";
        //String buscar = "Select * from usuarios where nombre like '%" + valor + "%' or nombre like '%" + valor + "'";
        try
        {
            conn = cn.conectar();

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next())
            {
                CitasDto citas = new CitasDto();
                citas.setIdCita(rs.getInt("idCita"));
                citas.setFechaEntrada(rs.getString("fechaEntrada"));
                citas.setFechaSalida(rs.getString("fechaSalida"));
                citas.setDescripcion(rs.getString("descripcion"));
                citas.setEstatus(rs.getInt("estatus"));
                citas.setIdVehiculo(rs.getInt("idVehiculo"));

                listaCitas.add(citas);
            }

        } catch (SQLException e)
        {
            //System.out.println("Error: " + e.toString());
            return null;
        }
        return listaCitas;
    }

    public int updateCitas(CitasDto objCitas)
    {
        String sql = "update Citas set fechaEntrada = ?, fechaSalida = ?, descripcion = ?, estatus = ?, idVehiculo = ?"
                + " where idCita = ?";

        try
        {
            conn = cn.conectar();
            ps = conn.prepareStatement(sql);
            //rs = ps.executeQuery();
            ps.setString(1, objCitas.getFechaEntrada());
            ps.setString(2, objCitas.getFechaSalida());
            ps.setString(3, objCitas.getDescripcion());
            ps.setInt(4, objCitas.getEstatus());
            ps.setInt(5, objCitas.getIdVehiculo());
            ps.setInt(6, objCitas.getIdCita());

            ps.execute();
            return 1;
        } catch (SQLException e)
        {
            return 0;
            //throw e;
        }
    }

    public int deleteCitas(CitasDto objCitas)
    {
        String sql = "Delete from Citas where idCita = ?";

        try
        {
            conn = cn.conectar();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, objCitas.getIdCita());
            ps.execute();
            return 1;
        } catch (SQLException e)
        {

        }
        return 0;
    }
}
