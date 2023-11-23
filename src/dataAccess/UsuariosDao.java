package dataAccess;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuariosDao
{

    Conexion cn = new Conexion();
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public UsuariosDto login(String usuario, String contrasenia) //throws Exception
    {
        String sql = "SELECT * FROM USUARIOS WHERE nombre = ? AND contrasenia = ?";
        UsuariosDto objUsuarioDto = new UsuariosDto();
        try
        {
            conn = cn.conectar();
            ps = conn.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contrasenia);
            rs = ps.executeQuery();
            if (rs.next())
            {
                objUsuarioDto.setIdUsuario(rs.getInt("idUsuario"));
                objUsuarioDto.setNombre(rs.getString("nombre"));
                objUsuarioDto.setApellido(rs.getString("apellido"));
                objUsuarioDto.setEstatus(rs.getInt("estatus"));
                objUsuarioDto.setCorreo(rs.getString("correo"));
                objUsuarioDto.setTelefono(rs.getInt("telefono"));
                objUsuarioDto.setIdRolFk(rs.getInt("idRol"));
            }
        } catch (SQLException e)
        {
//            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
//            throw e;
        }
        return objUsuarioDto;

    }

    public int createUsuarios(UsuariosDto objUsuario)
    {

        String sql = "Insert Into Usuarios (nombre,apellido,estatus,correo,telefono,contrasenia,idRol) values(?,?,?,?,?,?,?)";

        try
        {
            conn = cn.conectar();
            ps = conn.prepareStatement(sql);

            ps.setString(1, objUsuario.getNombre());
            ps.setString(2, objUsuario.getApellido());
            ps.setInt(3, objUsuario.getEstatus());
            ps.setString(4, objUsuario.getCorreo());
            ps.setInt(5, objUsuario.getTelefono());
            ps.setString(6, objUsuario.getContrasenia());
            ps.setInt(7, objUsuario.getIdRolFk());
            ps.execute();
            return 1;
        } catch (SQLException e)
        {
            return 0;
            //throw e;
        }
    }

    public ArrayList readUsuarios()
    {
        ArrayList<UsuariosDto> listaUsuarios = new ArrayList<UsuariosDto>();

        String sql = "Select * from Usuarios";
        //String buscar = "Select * from usuarios where nombre like '%" + valor + "%' or nombre like '%" + valor + "'";
        try
        {
            conn = cn.conectar();

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next())
            {
                UsuariosDto usuarioDto = new UsuariosDto();
                usuarioDto.setIdUsuario(rs.getInt("idUsuario"));
                usuarioDto.setNombre(rs.getString("nombre"));
                usuarioDto.setApellido(rs.getString("apellido"));
                usuarioDto.setEstatus(rs.getInt("estatus"));
                usuarioDto.setCorreo(rs.getString("correo"));
                usuarioDto.setTelefono(rs.getInt("telefono"));
                usuarioDto.setIdRolFk(rs.getInt("idRol"));

                listaUsuarios.add(usuarioDto);
            }

        } catch (SQLException e)
        {
            System.out.println("Error: " + e.toString());
            return null;
        }
        return listaUsuarios;
    }

    public int updateUsuarios(UsuariosDto objUsuario)
    {
        String sql = "update usuarios set nombre = ?, apellido = ?, estatus = ?, correo = ?, telefono = ?, idRol = ?"
                + " where idUsuario = ?";

        try
        {
            conn = cn.conectar();
            ps = conn.prepareStatement(sql);
            //rs = ps.executeQuery();
            ps.setString(1, objUsuario.getNombre());
            ps.setString(2, objUsuario.getApellido());
            ps.setInt(3, objUsuario.getEstatus());
            ps.setString(4, objUsuario.getCorreo());
            ps.setInt(5, objUsuario.getTelefono());
            ps.setInt(6, objUsuario.getIdRolFk());
            ps.setInt(7, objUsuario.getIdUsuario());
            ps.execute();
            return 1;
        } catch (SQLException e)
        {
            return 0;
            //throw e;
        }
    }

    public int deleteUsuarios(UsuariosDto objUsuario)
    {
        String sql = "Delete from Usuarios where idUsuario = ?";

        try
        {
            conn = cn.conectar();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, objUsuario.getIdUsuario());
            ps.execute();
            return 1;
        } catch (SQLException e)
        {
            
        }
        return 0;
    }

}
