package businessObject;

import dataAccess.UsuariosDao;
import dataAccess.UsuariosDto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuariosBLL
{

    public UsuariosDto loginUsuario(String usuario, String contrasenia) //throws Exception
    {
        UsuariosDao usuarioDao = new UsuariosDao();
        UsuariosDto usuarioDto;
        usuarioDto = usuarioDao.login(usuario, contrasenia); // Si retorna null es de que no lo encontro
        return usuarioDto;                                             // Si lo encuentra retorna el objeto
    }

    public boolean crearUsuario(String nombre, String apellido, int estatus, String correo,
            int telefono, String contrasenia, int idRol)
    {
        try
        {
            UsuariosDao usuarioDao = new UsuariosDao();
            UsuariosDto usuarioDto = new UsuariosDto(0, nombre, apellido, estatus, correo, telefono, contrasenia, idRol);
            usuarioDao.createUsuarios(usuarioDto);
            //
            return true;

        } catch (Exception e)
        {
            // Crear log de errores con libreria de java
            //JOptionPane.showMessageDialog(null, "Error : "+e.toString());
            return false;
        }

    }
    public boolean modificarUsuario(int idUsuario,String nombre, String apellido, int estatus, String correo,
            int telefono, String contrasenia, int idRol)
    {
        try
        {
            UsuariosDao usuarioDao = new UsuariosDao();
            UsuariosDto usuarioDto = new UsuariosDto(idUsuario, nombre, apellido, estatus, correo, telefono, contrasenia, idRol);
            if(usuarioDao.updateUsuarios(usuarioDto) == 1)
            {
                return true;
            
            }

        } catch (Exception e)
        {
            // Crear log de errores con libreria de java
            //JOptionPane.showMessageDialog(null, "Error : "+e.toString());
            //return false;
        }
        return false;
    }

    public ArrayList mostrarUsuarios()
    {
        try
        {
            UsuariosDao usuarioDao = new UsuariosDao();

            if (usuarioDao.readUsuarios() != null)
            {
                return usuarioDao.readUsuarios();
            } else
            {
                return null; // No hay nada en el Arraylist osea no hay datos registrados
            }
        } catch (Exception e)
        {
            return null;
        }

    }
    
    public boolean eliminarUsuario(int id)
    {
        UsuariosDao usuarioDao = new UsuariosDao();
        UsuariosDto usuarioDto = new UsuariosDto();
        usuarioDto.setIdUsuario(id);
        if (usuarioDao.deleteUsuarios(usuarioDto) == 1)
        {
            
            return true;
        } else
        {
            return false;
        }
    }

}
