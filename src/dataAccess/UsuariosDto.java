
package dataAccess;


public class UsuariosDto
{
    private int idUsuario;
    private String nombre;
    private String apellido;
    private int estatus;
    private String correo;
    private int telefono;
    private String contrasenia;
    private int idRolFk;

    public UsuariosDto()
    {
        
        
    }

    
    
    public UsuariosDto(int idUsuario, String nombre, String apellido, int estatus, 
                       String correo, int telefono, String contrasenia, int idRolFk)
    {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estatus = estatus;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasenia = contrasenia;
        this.idRolFk = idRolFk;
    }
    
    // Constructor para el Login

    public UsuariosDto(String nombre, String contrasenia)
    {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }
    
    

    public int getIdUsuario()
    {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario)
    {
        this.idUsuario = idUsuario;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public int getEstatus()
    {
        return estatus;
    }

    public void setEstatus(int estatus)
    {
        this.estatus = estatus;
    }

    public String getCorreo()
    {
        return correo;
    }

    public void setCorreo(String correo)
    {
        this.correo = correo;
    }

    public int getTelefono()
    {
        return telefono;
    }

    public void setTelefono(int telefono)
    {
        this.telefono = telefono;
    }

    public String getContrasenia()
    {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia)
    {
        this.contrasenia = contrasenia;
    }

    public int getIdRolFk()
    {
        return idRolFk;
    }

    public void setIdRolFk(int idRolFk)
    {
        this.idRolFk = idRolFk;
    }
    
    
    
}
