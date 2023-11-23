
package dataAccess;

public class RolesDto
{
    private int idRol;
    private String nombre;
    private String descripcion;
    private int estatus;

    public RolesDto()
    {
    }

    public RolesDto(int idRol, String nombre, String descripcion, int estatus)
    {
        this.idRol = idRol;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estatus = estatus;
    }

    public int getIdRol()
    {
        return idRol;
    }

    public void setIdRol(int idRol)
    {
        this.idRol = idRol;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
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

    
    

    
}
