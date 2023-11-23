package dataAccess;

public class CitasDto
{

    private int idCita;
    private String fechaEntrada;
    private String fechaSalida;
    private String descripcion;
    private int estatus;
    private int idVehiculo;

    public CitasDto()
    {
    }

    public CitasDto(int idCita, String fechaEntrada, String fechaSalida, String descripcion, int estatus, int idVehiculo)
    {
        this.idCita = idCita;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.descripcion = descripcion;
        this.estatus = estatus;
        this.idVehiculo = idVehiculo;
    }

    public int getIdCita()
    {
        return idCita;
    }

    public void setIdCita(int idCita)
    {
        this.idCita = idCita;
    }

    public String getFechaEntrada()
    {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada)
    {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida()
    {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida)
    {
        this.fechaSalida = fechaSalida;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public int getEstatus()
    {
        return estatus;
    }

    public void setEstatus(int estatus)
    {
        this.estatus = estatus;
    }

    public int getIdVehiculo()
    {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo)
    {
        this.idVehiculo = idVehiculo;
    }
    
    

}
