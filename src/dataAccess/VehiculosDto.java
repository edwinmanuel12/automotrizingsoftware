
package dataAccess;


public class VehiculosDto
{
    private int idVehiculo;
    private String marca;
    private String modelo;
    private String matricula;
    private String motor;
    private String diagnostico;
    private int idCliente;

    public VehiculosDto()
    {
    }

    public VehiculosDto(int idVehiculo, String marca, String modelo, String matricula, String motor, String diagnostico, int idCliente)
    {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.motor = motor;
        this.diagnostico = diagnostico;
        this.idCliente = idCliente;
    }

    public int getIdVehiculo()
    {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo)
    {
        this.idVehiculo = idVehiculo;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public String getMotor()
    {
        return motor;
    }

    public void setMotor(String motor)
    {
        this.motor = motor;
    }

    public String getDiagnostico()
    {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico)
    {
        this.diagnostico = diagnostico;
    }

    public int getIdCliente()
    {
        return idCliente;
    }

    public void setIdCliente(int idCliente)
    {
        this.idCliente = idCliente;
    }
    
    
            
}
