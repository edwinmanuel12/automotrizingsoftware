package businessObject;

import dataAccess.ClientesDao;
import dataAccess.ClientesDto;
import java.util.ArrayList;

public class ClientesBLL
{

    public boolean crearCliente(String nombre, String apellido,String direccion,
            String telefono, int estatus)
    {
        try
        {
            ClientesDao clienteDao = new ClientesDao();
            ClientesDto clienteDto = new ClientesDto(0, nombre, apellido, direccion, telefono, estatus);
            clienteDao.createClientes(clienteDto);
            return true;

        } catch (Exception e)
        {
            // Crear log de errores con libreria de java
            //JOptionPane.showMessageDialog(null, "Error : "+e.toString());
            return false;
        }

    }

    public boolean modificarCliente(int idUsuario, String nombre, String apellido, String direccion,
            String telefono, int estatus)
    {
        try
        {
            ClientesDao clienteDao = new ClientesDao();
            ClientesDto clienteDto = new ClientesDto(idUsuario, nombre, apellido, direccion,telefono, estatus);
            if (clienteDao.updateClientes(clienteDto) == 1)
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

    public ArrayList mostrarClientes()
    {
        try
        {
            ClientesDao clienteDao = new ClientesDao();

            if (clienteDao.readClientes() != null)
            {
                return clienteDao.readClientes();
            } else
            {
                return null; // No hay nada en el Arraylist osea no hay datos registrados
            }
        } catch (Exception e)
        {
            return null;
        }

    }

    public boolean eliminarCliente(int id)
    {
        ClientesDao clientesDao = new ClientesDao();
        ClientesDto clientesDto = new ClientesDto();
        clientesDto.setIdCliente(id);
        if (clientesDao.deleteClientes(clientesDto) == 1)
        {
            return true;
        } else
        {
            return false;
        }
    }
}
