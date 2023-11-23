
package dataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VehiculosDao
{
    
    Conexion cn = new Conexion();
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;


    public int createVehiculo(VehiculosDto objVehiculo)
    {

        String sql = "Insert Into Vehiculos (marca,modelo,matricula,motor,diagnostico,idCliente) values(?,?,?,?,?,?)";

        try
        {
            conn = cn.conectar();
            ps = conn.prepareStatement(sql);

            ps.setString(1, objVehiculo.getMarca());
            ps.setString(2, objVehiculo.getModelo());
            ps.setString(3, objVehiculo.getMatricula());
            ps.setString(4, objVehiculo.getMotor());
            ps.setString(5, objVehiculo.getDiagnostico());
            ps.setInt(6, objVehiculo.getIdCliente());
            
            ps.execute();
            return 1;
        } catch (SQLException e)
        {
            return 0;
            //throw e;
        }
    }

    public ArrayList readVehiculos()
    {
        ArrayList<VehiculosDto> listaVehiculos = new ArrayList<VehiculosDto>();

        String sql = "Select * from Vehiculos";
        //String buscar = "Select * from usuarios where nombre like '%" + valor + "%' or nombre like '%" + valor + "'";
        try
        {
            conn = cn.conectar();

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next())
            {
                VehiculosDto vehiculoDto = new VehiculosDto();
                vehiculoDto.setIdVehiculo(rs.getInt("idVehiculo"));
                vehiculoDto.setMarca(rs.getString("marca"));
                vehiculoDto.setModelo(rs.getString("modelo"));
                vehiculoDto.setMatricula(rs.getString("matricula"));
                vehiculoDto.setMotor(rs.getString("motor"));
                vehiculoDto.setDiagnostico(rs.getString("diagnostico"));
                vehiculoDto.setIdCliente(rs.getInt("idCliente"));

                listaVehiculos.add(vehiculoDto);
                
            }

        } catch (SQLException e)
        {
            System.out.println("Error: " + e.toString());
            return null;
        }
        return listaVehiculos;
    }

    public int updateVehiculos(VehiculosDto objVehiculo)
    {
        String sql = "update Vehiculos set marca = ?, modelo = ?, matricula = ?, motor = ?, diagnostico = ?, idCliente = ?"
                + " where idVehiculo = ?";

        try
        {
            conn = cn.conectar();
            ps = conn.prepareStatement(sql);
            //rs = ps.executeQuery();
            ps.setString(1, objVehiculo.getMarca());
            ps.setString(2, objVehiculo.getModelo());
            ps.setString(3, objVehiculo.getMatricula());
            ps.setString(4, objVehiculo.getMotor());
            ps.setString(5, objVehiculo.getDiagnostico());
            ps.setInt(6, objVehiculo.getIdCliente());
            ps.setInt(7, objVehiculo.getIdVehiculo());
            ps.execute();
            return 1;
        } catch (SQLException e)
        {
            return 0;
            //throw e;
        }
    }

    public int deleteVehiculo(VehiculosDto objVehiculo)
    {
        String sql = "Delete from Vehiculos where idVehiculo = ?";

        try
        {
            conn = cn.conectar();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, objVehiculo.getIdVehiculo());
            ps.execute();
            return 1;
        } catch (SQLException e)
        {
            
        }
        return 0;
    }
}
