package businessObject;

import dataAccess.CitasDao;
import dataAccess.CitasDto;
import java.util.ArrayList;

public class CitasBLL
{

    public boolean crearCita(String fechaEntrada, String fechaSalida, String descripcion, int estatus, int idVehiculo)
    {
        try
        {
            CitasDao citasDao = new CitasDao();
            CitasDto citasDto = new CitasDto(0, fechaEntrada, fechaSalida, descripcion, estatus, idVehiculo);
            citasDao.createCitas(citasDto);
            return true;

        } catch (Exception e)
        {
            // Crear log de errores con libreria de java
            //JOptionPane.showMessageDialog(null, "Error : "+e.toString());
            return false;
        }

    }

    public boolean modificarCita(int idCita,String fechaEntrada, String fechaSalida, String descripcion, int estatus, int idVehiculo)
    {
        try
        {
            CitasDao citasDao = new CitasDao();
            CitasDto citasDto = new CitasDto(idCita, fechaEntrada, fechaSalida, descripcion, estatus, idVehiculo);
            if (citasDao.updateCitas(citasDto) == 1)
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

    public ArrayList mostrarCitas()
    {
        try
        {
            CitasDao citaDao = new CitasDao();

            if (citaDao.readCitas() != null)
            {
                return citaDao.readCitas();
            } else
            {
                return null; // No hay nada en el Arraylist osea no hay datos registrados
            }
        } catch (Exception e)
        {
            return null;
        }

    }

    public boolean eliminarCita(int id)
    {
        CitasDao citaDao = new CitasDao();
        CitasDto citaDto = new CitasDto();
        citaDto.setIdCita(id);
        
        if (citaDao.deleteCitas(citaDto) == 1)
        {
            return true;
        } else
        {
            return false;
        }
    }
}
