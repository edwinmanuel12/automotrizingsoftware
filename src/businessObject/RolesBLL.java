package businessObject;

import dataAccess.RolesDto;
import dataAccess.RolesDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RolesBLL
{

    public boolean crearRol(String nombre, String descripcion, int estatus)
    {
        try
        {
            RolesDto objRoles = new RolesDto(0, nombre, descripcion, estatus);
            RolesDao rolDao = new RolesDao();
            
            rolDao.createRoles(objRoles);
            //
            return true;

        } catch (Exception e)
        {
            // Crear log de errores con libreria de java
            JOptionPane.showMessageDialog(null, "Error : " + e.toString());
            return false;
        }

    }

    public boolean modificarRol(int idRol, String nombre, String descripcion, int estatus)
    {
        try
        {
            RolesDao rolesDao = new RolesDao();
            RolesDto objRoles = new RolesDto(idRol, nombre, descripcion, estatus);
            if (rolesDao.updateRoles(objRoles) == 1)
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

    public ArrayList mostrarRoles()
    {
        try
        {
            RolesDao rolesDao = new RolesDao();

            if (rolesDao.readRoles() != null)
            {
                return rolesDao.readRoles();
            } else
            {
                return null; // No hay nada en el Arraylist osea no hay datos registrados
            }
        } catch (Exception e)
        {
            return null;
        }

    }

    public boolean eliminarRoles(int id)
    {
        RolesDao rolesDao = new RolesDao();
        RolesDto rolesDto = new RolesDto();
        rolesDto.setIdRol(id);
        if (rolesDao.deleteRoles(rolesDto) == 1)
        {
            return true;
        } else
        {
            return false;
        }
    }
}
