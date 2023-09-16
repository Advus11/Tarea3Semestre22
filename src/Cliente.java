public class Cliente {
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String numeroContacto;
    private String estadoCivil;
    private String ciudad;

    public Cliente(String nombre, String apellido, String correoElectronico, String numeroContacto, String estadoCivil, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.numeroContacto = numeroContacto;
        this.estadoCivil = estadoCivil;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getCiudad() {
        return ciudad;
    }
}