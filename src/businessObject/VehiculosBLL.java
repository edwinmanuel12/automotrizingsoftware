package businessObject;

import dataAccess.VehiculosDao;
import dataAccess.VehiculosDto;
import java.util.ArrayList;

public class VehiculosBLL
{

    public boolean crearVehiculo(String marca, String modelo, String matricula,
            String motor, String diagnostico, int idCliente)
    {
        try
        {
            VehiculosDao vehDao = new VehiculosDao();
            VehiculosDto vehDto = new VehiculosDto(0, marca, modelo, matricula, motor, diagnostico, idCliente);
            vehDao.createVehiculo(vehDto);
            return true;

        } catch (Exception e)
        {
            // Crear log de errores con libreria de java
            //JOptionPane.showMessageDialog(null, "Error : "+e.toString());
            return false;
        }

    }

    public boolean modificarVehiculo(int idVehiculo,String marca, String modelo, String matricula,
            String motor, String diagnostico, int idCliente)
    {
        try
        {
            VehiculosDao vehDao = new VehiculosDao();
            VehiculosDto vehDto = new VehiculosDto(idVehiculo, marca, modelo, matricula, motor, diagnostico, idCliente);
            if (vehDao.updateVehiculos(vehDto) == 1)
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

    public ArrayList mostrarVehiculos()
    {
        try
        {
            VehiculosDao vehiculoDao = new VehiculosDao();

            if (vehiculoDao.readVehiculos() != null)
            {
                return vehiculoDao.readVehiculos();
            } else
            {
                return null; // No hay nada en el Arraylist osea no hay datos registrados
            }
        } catch (Exception e)
        {
            return null;
        }

    }

    public boolean eliminarVehiculo(int idVehiculo)
    {
        VehiculosDao vehiculoDao = new VehiculosDao();
        VehiculosDto vehiculoDto = new VehiculosDto();
        vehiculoDto.setIdVehiculo(idVehiculo);
        if (vehiculoDao.deleteVehiculo(vehiculoDto) == 1)
        {
            return true;
        } else
        {
            return false;
        }
    }

}
